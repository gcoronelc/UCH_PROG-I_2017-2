/*
Empresa        :  EGCC
Software       :  Sistema de Gestion Financiera de un Colegio
DBMS           :  MySQL Server
Base de Datos  :  COLEGIODB
Script         :  Crea esquema OBLIGACIONES y PAGO.
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

CREATE TABLE TOBLIGACION
(
	tobligacion          INTEGER AUTO_INCREMENT,
	nombre               VARCHAR(60) NOT NULL,
	PRIMARY KEY PK_TOBLIGACION (tobligacion)
) engine = innodb;


CREATE TABLE OBLIGACION
(
	obligacion           INTEGER AUTO_INCREMENT,
	estudiante           INTEGER NOT NULL,
	tobligacion          INTEGER NOT NULL,
	matricula            INTEGER NULL,
	importe              NUMERIC(10,2) NOT NULL,
	vence                DATE NOT NULL,
	PRIMARY KEY PK_OBLIGACION (obligacion),
	FOREIGN KEY FK_OBLIGACION_MATRICULA (matricula) REFERENCES MATRICULA (matricula),
	FOREIGN KEY FK_OBLIGACION_TOBLIGACION (tobligacion) REFERENCES TOBLIGACION (tobligacion),
	FOREIGN KEY FK_OBLIGACION_ESTUDIANTE (estudiante) REFERENCES ESTUDIANTE (estudiante)
) engine = innodb;



CREATE TABLE PAGO
(
	obligacion           INTEGER NOT NULL,
	fecha                DATE NOT NULL,
	importe              NUMERIC(10,2) NOT NULL,
	mora                 NUMERIC(10,2) NOT NULL,
	total                NUMERIC(10,2) NOT NULL,
	comprobante          VARCHAR(30) NOT NULL,
	PRIMARY KEY PK_PAGO (obligacion),
	FOREIGN KEY FK_PAGO_OBLIGACION (obligacion) REFERENCES OBLIGACION (obligacion)
) engine = innodb;


-- =============================================
-- Datos iniciales
-- =============================================

insert into TOBLIGACION(tobligacion, nombre) values
(1, 'Cuota de Ingreso'),
(2, 'Matricula'),
(3, 'Mensualidad');

