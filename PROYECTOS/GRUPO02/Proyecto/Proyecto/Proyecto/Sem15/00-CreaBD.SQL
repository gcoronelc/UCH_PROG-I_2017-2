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
-- Creación de la Base de Datos
-- =============================================

DROP DATABASE IF EXISTS COLEGIODB;

CREATE DATABASE COLEGIODB;


-- =============================================
-- Seleccionar la Base de Datos
-- =============================================

USE COLEGIODB;
SET NAMES 'utf8';


-- =============================================
-- Creación del usuario
-- =============================================

USE MYSQL;
GRANT ALL PRIVILEGES ON *.* TO 'colegio'@'%' IDENTIFIED BY 'admin' WITH GRANT OPTION;
GRANT ALL PRIVILEGES ON *.* TO 'colegio'@'localhost' IDENTIFIED BY 'admin' WITH GRANT OPTION;
FLUSH PRIVILEGES;
USE COLEGIODB;
