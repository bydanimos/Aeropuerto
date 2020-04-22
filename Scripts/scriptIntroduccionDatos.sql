--Insertase usuarios
insert into usuario values (
'48116361Q', 'eliPita', 'eliPita@gmail.com', crypt('eli', gen_salt('md5)), 'Eliseo','Pita','Vilariño','España','981666789','m'
); --Administrador
insert into usuario values (
'49204425L', 'antong', 'antong@gmail.com', crypt('ant', gen_salt('md5')), 'Anton','Gomez','Lopez','Galicia','604025148','o'
); --Personal Externo
insert into usuario values (
'12345678Z', 'crisl', 'crisl@gmail.com', crypt('cri', gen_salt('md5')), 'Cristina','Lopez','Amado','Portugal','981234666','m'
);
insert into usuario values (
'45678913Q', 'danim', 'danim@gmail.com', crypt('dan', gen_salt('md5')), 'Daniel','Mosteiro','Angueira','Francia','981234166','h'
); --Personal Laboral

insert into usuario values (
'59518667A', 'fernandof', 'fernandof@gmail.com', crypt('fer', gen_salt('md5')), 'Fernando','Fraga','Bocheiras','Italia','981234610','h'
);
insert into usuario values (
'65892114N', 'minm', 'minom@gmail.com', crypt('min', gen_salt('md5')), 'Mino','Moral','Fernández','España','900234610','h'
);
insert into usuario values (
'09308274J', 'franciscog', 'franciscog@gmail.com', crypt('fra', gen_salt('md5')), 'Francisco','Gómez','Álvarez','España','611234610','h'
);
insert into usuario values (
'60749238M', 'monican', 'mincan@gmail.com', crypt('mon', gen_salt('md5')), 'Mónica','Naranjo','de la Fuente','España','611234178','m'
);

--Insertase persoalExterno
insert into personalexterno values('49204425L', false);

--Insertase persoal Laboral
insert into personallaboral(usuario, labor, descripcionTarea)
	values('45678913Q', 'controlador', 'controla los accesos de los pasajeros');

--Insertase historial de Traballo
insert into historialtrabajo(personalLaboral)
	values('45678913Q');

--Insertase administrador
insert into administrador(usuario) 
	values('48116361Q');

--Insertase terminal
insert into terminal values (1, 1, 20);
insert into terminal values (2, 21, 40);
insert into terminal values (3, 41, 60);

--Insertase parking
insert into parking values(1, 1, 50);
insert into parking values(1, 2, 50);
insert into parking values(2, 1, 75);
insert into parking values(2, 2, 25);
insert into parking values(3, 1, 100);

--Insertase reservarParking
insert into reservarparking values
(
	'12345678Z', 1, 1, 50, '20-04-2020', '29-04-2020', '6364CDD'
);

--Insertase tiendas
insert into tiendas(terminal, tipoVentas, nombre) values
(
    1, 'moda y complementos', 'Calvin Klein' 
);
insert into tiendas(terminal, tipoVentas, nombre) values
(
    1, 'moda y complementos', 'Pull & Bear' 
);
insert into tiendas(terminal, tipoVentas, nombre) values
(
    1, 'moda y complementos', 'Bershka' 
);
insert into tiendas(terminal, tipoVentas, nombre) values
(
    1, 'deportes', 'Nike' 
);
insert into tiendas(terminal, tipoVentas, nombre) values
(
    1, 'joyería y relojería', 'Tous' 
);
insert into tiendas(terminal, tipoVentas, nombre) values
(
    1, 'alimentación', 'Baggeterie Boulevard' 
);
insert into tiendas(terminal, tipoVentas, nombre) values
(
    1, 'alimentación', 'Burger King' 
);
insert into tiendas(terminal, tipoVentas, nombre) values
(
    1, 'farmacia', 'Farmacia' 
);
insert into tiendas(terminal, tipoVentas, nombre) values
(
    1, 'moda y complementos', 'Ray-Ban' 
);


insert into tiendas(terminal, tipoVentas, nombre) values
(
    2, 'joyería y relojería', 'Swarovski' 
);

insert into tiendas(terminal, tipoVentas, nombre) values
(
    2, 'moda y complementos', 'Adolfo Domínguez' 
);
insert into tiendas(terminal, tipoVentas, nombre) values
(
    2, 'deportes', 'Adidas' 
);
insert into tiendas(terminal, tipoVentas, nombre) values
(
    2, 'moda y complementos', 'Calzedonia' 
);
insert into tiendas(terminal, tipoVentas, nombre) values
(
    2, 'moda y complementos', 'Zara' 
);
insert into tiendas(terminal, tipoVentas, nombre) values
(
    2, 'alimentación', 'Chocolat Factory' 
);
insert into tiendas(terminal, tipoVentas, nombre) values
(
    2, 'alimentación', 'Farga' 
);
insert into tiendas(terminal, tipoVentas, nombre) values
(
    2, 'farmacia', 'Farmacia' 
);
insert into tiendas(terminal, tipoVentas, nombre) values
(
    2, 'moda y complementos', 'Mango' 
);


insert into tiendas(terminal, tipoVentas, nombre) values
(
    3, 'moda y complementos', 'Massimo Dutti' 
);
insert into tiendas(terminal, tipoVentas, nombre) values
(
    3, 'moda y complementos', 'Geox' 
);
insert into tiendas(terminal, tipoVentas, nombre) values
(
    3, 'moda y complementos', 'Calzedonia' 
);
insert into tiendas(terminal, tipoVentas, nombre) values
(
    3, 'moda y complementos', 'Levis' 
);
insert into tiendas(terminal, tipoVentas, nombre) values
(
    3, 'moda y complementos', 'Victoria`s Secret' 
);
insert into tiendas(terminal, tipoVentas, nombre) values
(
    3, 'mundo infantil', 'Tutti Frutti' 
);
insert into tiendas(terminal, tipoVentas, nombre) values
(
    3, 'regalos y decoración', 'Thinking ETSE' 
);
insert into tiendas(terminal, tipoVentas, nombre) values
(
    3, 'regalos y decoración', 'Superskunk' 
);
insert into tiendas(terminal, tipoVentas, nombre) values
(
    3, 'alimentación', 'Sibarium' 
);
insert into tiendas(terminal, tipoVentas, nombre) values
(
    3, 'alimentación', 'Farga' 
);
insert into tiendas(terminal, tipoVentas, nombre) values
(
    3, 'alimentación', 'Baggeterie Boulevard' 
);
insert into tiendas(terminal, tipoVentas, nombre) values
(
    3, 'farmacia', 'Farmacia' 
);

--Insertar en cochealquiler
insert into cochealquiler values
(
    '8432DFG', 'Seat Ibiza', 75, 5, 5, 30, 'Gasolina'
);
insert into cochealquiler values
(
    '9127BBN', 'Renault Clio', 72, 5, 3, 30, 'Gasolina'
);
insert into cochealquiler values
(
    '7385CFT', 'Audi A3', 160, 5, 5, 30, 'Diesel'
);

--Insertar en alquilar
insert into alquilar(fechaAlquiler, usuario, matricula, fechateoricadevolucion, retirado) values
(
    '20-04-2020', '12345678Z', '7385CFT', '29-04-2020', false
);

--Insertar en reservar
insert into reservar values('20-06-2020', '30-06-2020', '49204425L', '8432DFG');


--Insertase en modeloAvion
insert into modeloavion values('Boeing 747',500,29,800,'Boeing');
insert into modeloavion values('Airbus A380',800,50,1200,'Airbus');
insert into modeloavion values('Airbus A350',310,38,500,'Airbus');
insert into modeloavion values('Airbus A319',141,0,495,'Airbus');

--Insertase en aerolinea
insert into aerolinea values('Vueling','España',10,12);
insert into aerolinea values('Iberia','España',11,13);
insert into aerolinea values('Ryanair','Irlanda',10,10);
insert into aerolinea values('Czech Airlines','República Checa',8,10);
insert into aerolinea values('Turkish Airlines','Turquía',20,30);

--Insertase en avion
insert into avion values(1000,'Airbus A350','Vueling',2018,false);
insert into avion values(1001,'Airbus A350','Vueling',2016,false);
insert into avion values(603,'Airbus A319','Vueling',2010,true);

insert into avion values(1002,'Airbus A350','Iberia',2019,false);
insert into avion values(1003,'Boeing 747','Iberia',2015,false);
insert into avion values(1004,'Airbus A380','Iberia',2019,false);

insert into avion values(1005,'Airbus A380','Turkish Airlines',2018,false);

insert into avion values(1006,'Airbus A319','Czech Airlines',2014,false);
insert into avion values(1007,'Airbus A350','Czech Airlines',2017,false);

insert into avion values(1008,'Airbus A319','Ryanair',2013,false);
insert into avion values(1009,'Airbus A350','Ryanair',2018,false);


insert into vuelo values
(
964,'Folgoso do Courel','Milán','12-02-2020','12-02-2020','13-02-2020','13-02-2020',90,1,false,1,603
);
insert into vuelo values
(
965,'Vannes','Folgoso do Courel','12-02-2020','12-02-2020','13-02-2020','13-02-2020',60,6,false,1,603
);

insert into comprarbillete values ('59518667A',964,'15-01-2020',1,'normal',0,false,true);
insert into comprarbillete values ('65892114N',964,'18-01-2020',2,'normal',1,false,true);
insert into comprarbillete values ('09308274J',965,'16-01-2020',1,'normal',1,false,true);
insert into comprarbillete values ('60749238M',965,'16-01-2020',2,'normal',1,false,true);

insert into maleta(peso) values(10);
insert into maleta(peso) values(11);
insert into maleta(peso) values(12);

insert into facturarmaleta values(1, '65892114N', 964, '12-02-2020');
insert into facturarmaleta values(2, '09308274J', 965, '12-02-2020');
insert into facturarmaleta values(3, '60749238M', 965, '12-02-2020');
