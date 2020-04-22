-- borramos las tablas
drop table facturarmaleta;
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
drop function introduce_codigo_tienda;
drop function controla_secuencias_terminal;
drop function valida_dni(dni char);
drop sequence seq_id_maleta;
drop function comprobarPlazaParking;
drop extension pgcrypto;
