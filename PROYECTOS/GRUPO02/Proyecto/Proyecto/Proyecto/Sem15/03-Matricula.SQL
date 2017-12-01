/*
Empresa        :  EGCC
Software       :  Sistema de Gestion Financiera de un Colegio
DBMS           :  MySQL Server
Base de Datos  :  COLEGIODB
Script         :  Crea esquema MATRICULA.
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
CREATE TABLE ESTUDIANTE
(
    estudiante       INTEGER AUTO_INCREMENT,
	apellido            VARCHAR(60) NOT NULL,
	nombre             VARCHAR(60) NOT NULL,
	dni                  VARCHAR(11) NOT NULL,
	email                VARCHAR(60) NOT NULL,
	telefono             VARCHAR(20) NOT NULL,
	PRIMARY KEY PK_ESTUDIANTE (estudiante)
) engine = innodb;


CREATE TABLE MATRICULA
(
	matricula            INTEGER AUTO_INCREMENT,
	seccion              INTEGER NOT NULL,
	estudiante           INTEGER NOT NULL,
	fecha                DATE NOT NULL,
    activa               INTEGER NOT NULL,
	PRIMARY KEY PK_MATRICULA (matricula),
	FOREIGN KEY FK_MATRICULA_SECCION (seccion) REFERENCES SECCION (seccion),
	FOREIGN KEY FK_MATRICULA_ESTUDIANTE (estudiante) REFERENCES ESTUDIANTE (estudiante)
) engine = innodb;


INSERT INTO ESTUDIANTE(estudiante,apellido,nombre,dni,email,telefono) VALUES
(1000001,'Lazo Amado','Jerson Misael','73112971','misaellazo1999@gmail.com','942788522'),
(1000002,'Lunarejo Aponte','Luis Enrique','73549875','luislunaxd@gmail.com','942788522'),
(1000003,'Romero','Claudia Nathalia','73852465','clauidaromerito12@gmail.com','942788522');

INSERT INTO MATRICULA(matricula,seccion,estudiante,fecha,activa) VALUES
(1,1,1000001,'28/12/17',850),
(2,2,1000002,'02/01/18',850),
(3,3,1000003,'03/01/18',850);
