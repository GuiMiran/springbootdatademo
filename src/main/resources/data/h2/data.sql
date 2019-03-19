/*
 * Para acceder a la consola:  	http://localhost:8080/h2-console
 * 
 * Parámetros de conexión:     	JDBC URL: jdbc:h2:mem:testdb
 * 								username: sa
 * 								password: 
 * 
 */

INSERT INTO DEPARTAMENTOS VALUES
(100,'Comercial'),
(101,'Facturación'),
(110,'I+D'),
(120,'Recursos Humanos');

INSERT INTO EMPLEADOS VALUES
('F4655','Pepín','Gálvez','Ridruejo','2017-10-24',14500,110),
('F4634','Honorio','Martín','Salvador','2016-10-10',2100,101),
('F4666','Carlota','Sánchez','Cifuentes','2012-11-10',22100,101);


INSERT INTO ALUMNOS VALUES 
(10,'Pepín','Gálvez'),
(12,'Honorio','Martín'),
(15,'Carlota','Cifuentes'),
(18,'Tatiana','Marín'),
(24,'Rigoberto','Díaz'),
(27,'Walter','Peralta');

INSERT INTO CLIENTES VALUES
('49827334T','CEDIPSA','AVD. DE LOS PINOS, 23','BARCELONA','08024','BARCELONA','ESPAÑA'),
('28734421L','ADEPSA','PLAZA GALDÓS, 3', 'MATARÓ','40823','BARCELONA','ESPAÑA');







