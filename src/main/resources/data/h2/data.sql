/*
 * Para acceder a la consola:  	http://localhost:8080/h2-console
 * 
 * Parámetros de conexión:     	JDBC URL: jdbc:h2:mem:testdb
 * 								username: sa
 * 								password: 
 * 
 */
INSERT INTO PRODUCTOS VALUES
(100,'PRODUCTO_100', 57),
(101,'PRODUCTO_101', 40),
(102,'PRODUCTO_102', 300),
(103,'PRODUCTO_103', 4),
(104,'PRODUCTO_104', 1278),
(105,'PRODUCTO_105', 52),
(106,'PRODUCTO_106', 28),
(107,'PRODUCTO_107', 1002),
(108,'PRODUCTO_108', 40),
(109,'PRODUCTO_109', 20);

INSERT INTO CLIENTES VALUES
('49827334T','CEDIPSA','AVD. DE LOS PINOS, 23','BARCELONA','08024','BARCELONA','ESPAÑA'),
('28734421L','ADEPSA','PLAZA GALDÓS, 3', 'MATARÓ','40823','BARCELONA','ESPAÑA');

INSERT INTO FACTURAS VALUES
(100,'2018-10-21','49827334T'),
(101,'2018-10-23','28734421L'),
(102,'2018-11-23','28734421L'),
(103,'2018-12-24','28734421L');

INSERT INTO LINEAS_FACTURA VALUES
(100,100,1,57,0),
(100,102,10,300,1),
(100,104,1,1278,2),
(101,102,5,280,0),
(102,100,10,57,0),
(102,102,7,300,1),
(103,100,1,57,0);

INSERT INTO ARTISTAS VALUES
(1,'Artista1', '2018-05-25'),
(2,'Artista2', '2017-06-30'),
(3,'Artista2', '2015-03-10');

INSERT INTO DISCOS VALUES
('codDisco1', 'disco1', 30, 'POP',1),
('codDisco5', 'disco8', 50, 'POP',1),
('codDisco2', 'disco1', 40, 'POP',2),
('codDisco3', 'disco1', 50, 'POP',3);

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

INSERT INTO ASIGNATURAS VALUES
(1,'MATEMATICAS'),
(3,'QUIMICA'),
(4,'FISICA'),
(9,'RELIGION');

INSERT INTO ASIGNATURAS_ALUMNOS VALUES
(10,3),
(10,1),
(27,9),
(15,9),
(12,1),
(12,4),
(12,9),
(18,1),
(18,9),
(27,1);








