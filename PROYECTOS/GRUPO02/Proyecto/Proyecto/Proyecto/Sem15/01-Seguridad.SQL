/*
Empresa        :  EGCC
Software       :  Sistema de Gestion Financiera de un Colegio
DBMS           :  MySQL Server
Base de Datos  :  COLEGIODB
Script         :  Crea esquema SEGURIDAD.
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

CREATE TABLE EMPLEADO
(
	idempleado           INTEGER AUTO_INCREMENT,
	apellido             VARCHAR(60) NOT NULL,
	nombre               VARCHAR(60) NOT NULL,
	dni                  VARCHAR(11) NOT NULL,
	email                VARCHAR(60) NOT NULL,
	telefono             VARCHAR(20) NOT NULL,
	PRIMARY KEY PK_EMPLEADO(idempleado)
) engine = innodb;



CREATE UNIQUE INDEX XAK1EMPLEADO ON EMPLEADO
(
	dni
);



CREATE TABLE ROL
(
	idrol                INTEGER NOT NULL,
	nombre               VARCHAR(60) NOT NULL,
	PRIMARY KEY PK_ROL(idrol)
) engine = innodb;



CREATE TABLE USUARIO
(
	idempleado           INTEGER NOT NULL,
	idrol                INTEGER NOT NULL,
	usuario              VARCHAR(20) NOT NULL,
	clave                VARCHAR(60) NOT NULL,
	estado               INTEGER NOT NULL CHECK ( estado IN (0,1) ),
	PRIMARY KEY PK_USUARIO(idempleado),
	FOREIGN KEY FK_USUARIO_EMPLEADO (idempleado) REFERENCES EMPLEADO (idempleado),
	FOREIGN KEY FK_USUARIO_ROL (idrol) REFERENCES ROL (idrol)
);

CREATE UNIQUE INDEX idx_usuario_usuario
ON USUARIO (usuario);

-- =============================================
-- Cargar Datos
-- =============================================

-- Empleados

INSERT INTO EMPLEADO(idempleado,apellido,nombre,       
dni,email,telefono) VALUES
(1,'CORONEL','GUSTAVO','A','A','A'),
(2,'B','B','B','B','B'),
(3,'C','C','C','C','C'),
(4,'D','D','D','D','D'),
(5,'E','E','E','E','E');


-- Roles

INSERT INTO ROL(idrol,nombre) VALUES
(1,'Administrador'),
(2,'Operador'),
(3,'Usuario');


-- Roles

INSERT INTO USUARIO(idempleado,idrol,usuario,clave,estado) VALUES
(1,1,'gustavo',SHA('gustavo'),1),
(2,2,'pedro',SHA('pedro'),1),
(3,3,'carla',SHA('carla'),1),
(4,2,'javier',SHA('javier'),1),
(5,3,'terruco_Uch',SHA('terruco_Uch'),0);








