-- función para comprobar que el dni es correcto
create or replace function valida_dni(dni char) returns boolean as $vd$ 
declare
	letrasValidas char(23) := 'TRWAGMYFPDXBNJZSQVHLCKE';
	letraCorrecta char;
	letra char := SUBSTR(dni, length(dni), 1);
	dniCorrecto char(8) := SUBSTR(dni, 1, length(dni)-1);
	letraLeida char := substr(letra, 1);
	resto integer;
begin
	resto := mod(cast(dniCorrecto as integer),23);
	letraCorrecta := SUBSTR(letrasValidas, resto+1, 1);
	if (letraCorrecta = letraLeida) then
	return true;
	else
 	return false;
	end if;
end;
$vd$ Language plpgsql;

create table usuario
(
    dni char(9) not null primary key,
    id varchar(20) unique not null,
    correoElectronico varchar(30) unique not null,
    contrasenha varchar(50) not null,
    nombre varchar(40) not null,
    primerApellido varchar(40) not null,
    segundoApellido varchar(40) not null,
    paisProcedencia char(30),
    telefono integer,
    sexo char(1) not null,
    check (sexo='m' or sexo='h' or sexo='-'),
    check(valida_dni(dni) =true)
);
create table personalExterno
(
	usuario char(9) not null primary key,
	estarDentro boolean not null default false,
	foreign key (usuario) references usuario (dni)
		on delete cascade on update cascade
);

create table personalLaboral
(
    usuario char(9) not null,
    labor varchar(30) not null,
    descripcionTarea varchar(150) not null,
    fechaInicio timestamp not null default CURRENT_TIMESTAMP,
    
    primary key(usuario),
    foreign key(usuario) references usuario(dni)
    	on delete cascade on update cascade
    
);

create table historialTrabajo
(
    personalLaboral char(9),
    fechaEntrada timestamp not null default CURRENT_TIMESTAMP,
    fechaSalida timestamp,
    primary key (personalLaboral, fechaEntrada),
    foreign key (personalLaboral) references personalLaboral(usuario)
    	on delete cascade on update cascade
); 

create table administrador
(
    usuario char(9) not null,
    fechaInicio timestamp not null default current_timestamp,
    curriculum varchar(500),
    primary key(usuario),
    foreign key(usuario) references usuario(dni)
    	on delete cascade on update cascade
);

create table terminal
(
    numero integer not null primary key,
    primeraPuerta integer not null,
    ultimaPuerta integer not null
);

--Funcion que crea/borra secuencias que controlan o numero dos codigos de tendas
create or replace function controla_secuencias_terminal() returns trigger as $cst$
declare
	tienda integer;
begin
  case TG_OP
    when 'INSERT' then
      execute 'create sequence seq_codigo_tiendas_'||cast(NEW.numero as text);
      return new;
    when 'UPDATE' then
      IF OLD.terminal <> NEW.terminal THEN
	     tienda:=nextval('seq_codigo_tiendas_'||cast(OLD.numero as text));
	     execute 'drop sequence seq_codigo_tiendas_'||cast(OLD.numero as text);
	     execute 'create sequence seq_codigo_tiendas_'||cast(NEW.numero as text)|| ' start '||cast(tienda as text);
      END IF;
      return new;
    when 'DELETE' then 
      execute 'drop sequence seq_codigo_tiendas_'||cast(OLD.numero as text);
      return old;
    else null;
  end case;
end;
$cst$ Language plpgsql;

--Disparador que activa a funcion controla_sequencia_terminal
create trigger afterTiendas after insert or update or delete on terminal
for each row execute procedure controla_secuencias_terminal();

create table parking
(
    terminal integer,
    piso integer,
    numPlazas integer not null,
    primary key (terminal, piso),
    foreign key (terminal) references terminal(numero)
    	on delete restrict on update cascade
);


create table reservarParking
(
    usuario char(9) not null,
    terminal integer not null,
    piso integer not null,
    numPlaza integer not null,
    fechaEntrada timestamp not null,
    fechaFin timestamp not null,
    matricula char(7) not null,
    
    primary key (usuario, terminal, piso, numPlaza, fechaEntrada),
    foreign key (usuario) references usuario(dni)
    	on delete cascade on update cascade,
    foreign key (terminal, piso) references parking (terminal, piso)
    	on delete cascade on update cascade
);

create table tiendas
(
    terminal integer,
    codigo integer,
    tipoVentas varchar(15),
    nombre varchar(20),
    primary key (terminal, codigo) ,
    foreign key (terminal)  references terminal(numero)
        on delete restrict on update cascade
);

--Funcion que introduce os codigos nas tendas
create or replace function introduce_codigo_tienda() returns trigger as $cst$
begin
  new.codigo:=nextval('seq_codigo_tiendas_'||cast(new.terminal as text));
  return new;
end;
$cst$ Language plpgsql;

--Disparador que activa a funcion introduce_codigo_tienda
create trigger beforeInsertTienda before insert on tiendas
for each row execute procedure introduce_codigo_tienda();

create table cocheAlquiler
(
    matricula char(9) not null,
    modelo varchar(100) not null,
    caballos integer,
    nPlazas integer not null,
    nPuertas integer not null,
    precioPorDia float not null,
    tipoCombustible varchar(15) not null,
    
    primary key(matricula)
);

create table alquilar
(
    fechaAlquiler timestamp not null,
    usuario char(9) not null,
    matricula char(7) not null,
    fechaTeoricaDevolucion timestamp not null,
    fechaDevolucion timestamp,
    retirado boolean not null,
    
    primary key (fechaAlquiler, usuario, matricula),
    foreign key (usuario) references usuario (dni)
    	on delete restrict on update cascade, 
    foreign key (matricula) references cocheAlquiler (matricula)
    	on delete restrict on update cascade

);

create table reservar
(
    fechaInicioReserva timestamp not null default current_timestamp,
    fechaFinReserva timestamp not null,
    
    usuario char(9) not null,
    cocheAlquiler char(7) not null,
    
    primary key(usuario,cocheAlquiler,fechaInicioReserva),
    foreign key(usuario) references usuario (dni)
    	on delete cascade on update cascade,
    foreign key(cocheAlquiler) references cocheAlquiler (matricula)
   		on delete cascade on update cascade
    
);


create table modeloAvion
(
    nombre varchar(20) primary key,
    capacidadNormal integer not null,
    capacidadPremium integer not null,
    consumo float not null,
    empresaFabricante varchar(20) not null
);


create table aerolinea 
(
    nombre varchar(25) not null primary key,
    paisSede varchar(25) not null,
    precioBaseMaleta float not null,
    pesoBaseMaleta float not null
);

create table avion
(
    codigo char(5) primary key,  
    modeloAvion varchar(20) not null,
    aerolinea varchar(25) not null,
    anhoFabricacion int not null,
    retirado boolean not null default false,
    foreign key (modeloAvion) references modeloAvion(nombre)
    	on delete restrict on update cascade,
    foreign key (aerolinea) references aerolinea(nombre)
    	on delete restrict on update cascade
);


create table vuelo
(
    numVuelo char(5) not null,
    origen varchar(30) not null,
    destino varchar(30) not null,
    fechaSalidaTeorica timestamp not null,
    fechaSalidaReal timestamp not null,
    fechaLlegadaTeorica timestamp not null,
    fechaLleagadaReal timestamp not null,
    precioActual float not null,
    precioPremium float not null,
    puertaEmbarque integer,
    cancelado boolean not null default false,
    terminal integer not null,
    avion char(5) not null,
    
    primary key (numVuelo),
    foreign key (terminal) references terminal(numero)
    on delete restrict on update cascade,
    foreign key (avion) references avion(codigo)
    on delete restrict on update cascade

);

create or replace function comprobarAsientoCorrecto
(
 vuelo char(5), tipoAsiento varchar(15), numAsiento integer
 )
returns boolean as $$

declare
	numNormal integer;
	numPremium integer;
begin
	numNormal=(select capacidadNormal
	from vuelo v, avion a, modeloAvion ma
	where v.avion=a.codigo and a.modeloAvion=modeloAvion.nombre
	and v.numVuelo=vuelo);
	
	numPremium=(select capacidadPremium
	from vuelo v, avion a, modeloAvion ma
	where v.avion=a.codigo and a.modeloAvion=modeloAvion.nombre
	and v.numVuelo=vuelo);

	if (tipoAsiento='normal') then
		if(numAsiento between 1 and numNormal) then
			return true;
		else
			return false;
		end if;
	else 
		if(numAsiento between (numNormal+1) and numPremium) then
			return true;

		else
			return false;
		end if;

	end if;
end;
$$ language plpgsql;

create table comprarBillete
(
    usuario char(9) not null,
    vuelo char(5) not null,
    fechaCompra timestamp not null default CURRENT_TIMESTAMP,
    numAsiento integer not null,
    tipoAsiento varchar(15) not null,
    numMaletasReserva integer not null,
    tenerAcompanhante boolean not null,
    pasarControl boolean not null default false,
    
    unique(usuario,vuelo,numAsiento),
    check(tipoAsiento='premium' or tipoAsiento='normal'),
    check(comprobarAsientoCorrecto(vuelo, tipoAsiento, numAsiento)),
    primary key (usuario, vuelo),
    foreign key (usuario) references usuario (dni)
    on delete restrict on update cascade,
    foreign key (vuelo) references vuelo (numVuelo)
    on delete restrict on update cascade

);

create table Maleta
(
	id integer not null primary key, --secuencia!!!!!
    peso float not null
);


create table facturarMaleta
(
	maleta integer,
    usuario char(9),
    vuelo char(5),
    fecha timestamp not null default CURRENT_TIMESTAMP,
    precioExtra float,
    primary key (maleta, usuario, vuelo),
    foreign key (maleta) references maleta(id)
    	on delete restrict on update cascade,
    foreign key (usuario,vuelo) references comprarBillete(usuario,vuelo)
    	on delete cascade on update cascade

);


-- borramos las tablas
drop table facturar;
drop table maleta;
drop table comprarBillete;
drop table vuelo;
drop table avion;
drop table aerolinea;
drop table modeloAvion;
drop table reservar;
drop table alquilar;
drop table cocheAlquiler;
drop table tiendas;
drop table reservarParking;
drop table parking;
drop table terminal;
drop table administrador;
drop table historialTrabajo;
drop table personalLaboral;
drop table personalExterno;
drop table usuario;
-- borramos las funciones
drop function introduce_codigo_tienda();
drop function controla_secuencias_terminal();
drop function valida_dni(dni char);


create or replace function comprobarPuertaCorrecta

create trigger beforeInsertPuerta before insert or update on vuelo 
for each row execute procedure comprobarPuertaCorrecta();


