/*
Empresa        :  EGCC
Software       :  Sistema de Gestion Financiera de un Colegio
DBMS           :  MySQL Server
Base de Datos  :  COLEGIODB
Script         :  Crea esquema PROGRAMACION.
Responsable    :  Ing. Eric Gustavo Coronel Castillo
Telefono       :  (511) 9966-64457
Email          :  gcoronelc@gmail.com
Sitio Web      :  www.desarrollasoftware.com
Blog           :  http://gcoronelc.blogspot.com
*/

-- =============================================
-- Seleccionar la base de datos
-- =============================================

use COLEGIODB;
set names utf8;


-- =============================================
-- Creación de tablas
-- =============================================


CREATE TABLE NIVEL
(
	nivel                INTEGER NOT NULL,
	nombre               VARCHAR(60) NOT NULL,
	PRIMARY KEY PK_NIVEL (nivel)
) engine = innodb;



CREATE TABLE GRADO
(
	grado                INTEGER NOT NULL,
	nivel                INTEGER NOT NULL,
	nombre               VARCHAR(60) NOT NULL,
	PRIMARY KEY PK_GRADO (grado),
	FOREIGN KEY FK_GRADO_NIVEL (nivel) REFERENCES NIVEL (nivel)
) engine = innodb;



CREATE TABLE PERIODO
(
	periodo              INTEGER NOT NULL,
	fase                 INTEGER NOT NULL,
	ingreso              NUMERIC(12,2) NOT NULL,
	matricula            NUMERIC(10,2) NOT NULL,
	pension              NUMERIC(12,2) NOT NULL,
	PRIMARY KEY PK_PERIODO (periodo)
) engine = innodb;



CREATE TABLE SECCION
(
	seccion              INTEGER AUTO_INCREMENT,
	periodo              INTEGER NOT NULL,
	grado                INTEGER NOT NULL,
	nombre               VARCHAR(60) NOT NULL,	
	vacantes             INTEGER NOT NULL,
	matriculados         INTEGER NOT NULL,
	PRIMARY KEY PK_SECCION (seccion),
	FOREIGN KEY FK_SECCION_GRADO (grado) REFERENCES GRADO (grado),
	FOREIGN KEY FK_SECCION_PERIODO (periodo) REFERENCES PERIODO (periodo)
) engine = innodb;



-- =============================================
-- Cargar Datos
-- =============================================

INSERT INTO NIVEL(nivel,nombre) VALUES
(1,'PRIMARIA'),
(2,'SECUNDARIA');

INSERT INTO GRADO(grado,nivel,nombre) VALUES
(101,1,'PRIMER GRADO DE PRIMARIA'),
(102,1,'SEGUNDO GRADO DE PRIMARIA'),
(103,1,'TERCER GRADO DE PRIMARIA'),
(104,1,'CUARTO GRADO DE PRIMARIA'),
(105,1,'QUINTO GRADO DE PRIMARIA'),
(106,1,'SEXTO GRADO DE PRIMARIA'),
(201,2,'PRIMER GRADO DE SECUNDARIA'),
(202,2,'SEGUNDO GRADO DE SECUNDARIA'),
(203,2,'TERCER GRADO DE SECUNDARIA'),
(204,2,'CUARTO GRADO DE SECUNDARIA'),
(205,2,'QUINTO GRADO DE SECUNDARIA');


INSERT INTO PERIODO(periodo,fase,ingreso,matricula,pension) VALUES
(2018,1,4000.0,750.0,750.0),
(2019,1,4500.0,800.0,800.0),
(2020,1,5000.0,850.0,850.0);



INSERT INTO SECCION(seccion,periodo,grado,nombre,vacantes,matriculados) VALUES
(1,2018,101,'ARDILLITAS',20,0),
(2,2018,102,'LORITOS',20,0),
(3,2018,103,'AVEJITAS',20,0),
(4,2018,104,'LAGARTOS',20,0),
(5,2018,105,'CONEJOS',20,0),
(6,2018,106,'CUYES',20,0),
(7,2018,201,'A',20,0),
(8,2018,202,'B',20,0),
(9,2018,203,'C',20,0),
(10,2018,204,'D',20,0),
(11,2018,205,'E',20,0);











 
 
 
 
 
 