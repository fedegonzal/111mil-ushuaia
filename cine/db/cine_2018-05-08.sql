# ************************************************************
# Sequel Pro SQL dump
# Versión 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.22)
# Base de datos: cine
# Tiempo de Generación: 2018-05-08 11:16:58 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Volcado de tabla Actor
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Actor`;

CREATE TABLE `Actor` (
  `id_actor` int(11) NOT NULL AUTO_INCREMENT,
  `animado` tinyint(1) NOT NULL,
  `apellido` varchar(200) COLLATE utf8_bin NOT NULL,
  `nombre` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  `id_sexo` int(11) NOT NULL,
  PRIMARY KEY (`id_actor`),
  KEY `fk_Actor_Sexo1_idx` (`id_sexo`),
  CONSTRAINT `fk_Actor_Sexo1` FOREIGN KEY (`id_sexo`) REFERENCES `Sexo` (`id_sexo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

LOCK TABLES `Actor` WRITE;
/*!40000 ALTER TABLE `Actor` DISABLE KEYS */;

INSERT INTO `Actor` (`id_actor`, `animado`, `apellido`, `nombre`, `id_sexo`)
VALUES
	(1,0,X'446172C3AD6E',X'5269636172646F',2),
	(2,0,X'5061756C73',X'47617374C3B36E',2),
	(4,0,X'4272C3A964696365',X'4C657469636961',1);

/*!40000 ALTER TABLE `Actor` ENABLE KEYS */;
UNLOCK TABLES;


# Volcado de tabla Calificacion
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Calificacion`;

CREATE TABLE `Calificacion` (
  `id_calificacion` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(200) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id_calificacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

LOCK TABLES `Calificacion` WRITE;
/*!40000 ALTER TABLE `Calificacion` DISABLE KEYS */;

INSERT INTO `Calificacion` (`id_calificacion`, `nombre`)
VALUES
	(1,X'415450'),
	(2,X'4D61796F7265732064652038'),
	(3,X'4D61796F726573206465203133'),
	(4,X'4D61796F726573206465203136'),
	(5,X'4D61796F726573206465203138');

/*!40000 ALTER TABLE `Calificacion` ENABLE KEYS */;
UNLOCK TABLES;


# Volcado de tabla Cine
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Cine`;

CREATE TABLE `Cine` (
  `id_cine` int(11) NOT NULL,
  `direccion` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  `fecha_inauguracion` datetime DEFAULT NULL,
  `nombre` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  `precio_entrada` double DEFAULT NULL,
  PRIMARY KEY (`id_cine`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;



# Volcado de tabla Entrada
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Entrada`;

CREATE TABLE `Entrada` (
  `id_entrada` int(11) NOT NULL,
  `fecha_hora_funcion` datetime DEFAULT NULL,
  `fecha_hora_venta` datetime DEFAULT NULL,
  `precio_cobrado` float DEFAULT NULL,
  `ticket_nro` int(11) DEFAULT NULL,
  `numero` int(11) NOT NULL,
  PRIMARY KEY (`id_entrada`),
  KEY `fk_Entrada_Funcion1_idx` (`numero`),
  CONSTRAINT `fk_Entrada_Funcion1` FOREIGN KEY (`numero`) REFERENCES `Funcion` (`numero`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;



# Volcado de tabla Funcion
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Funcion`;

CREATE TABLE `Funcion` (
  `numero` int(11) NOT NULL,
  `dia_semana` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `duracion` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `hora_inicio` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `id_programacion` int(11) NOT NULL,
  `id_pelicula` int(11) NOT NULL,
  `id_sala` int(11) NOT NULL,
  PRIMARY KEY (`numero`),
  KEY `fk_Funcion_Programacion1_idx` (`id_programacion`),
  KEY `fk_Funcion_Pelicula1_idx` (`id_pelicula`),
  KEY `fk_Funcion_Sala1_idx` (`id_sala`),
  CONSTRAINT `fk_Funcion_Pelicula1` FOREIGN KEY (`id_pelicula`) REFERENCES `Pelicula` (`id_pelicula`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Funcion_Programacion1` FOREIGN KEY (`id_programacion`) REFERENCES `Programacion` (`id_programacion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Funcion_Sala1` FOREIGN KEY (`id_sala`) REFERENCES `Sala` (`id_sala`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;



# Volcado de tabla Genero
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Genero`;

CREATE TABLE `Genero` (
  `id_genero` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id_genero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

LOCK TABLES `Genero` WRITE;
/*!40000 ALTER TABLE `Genero` DISABLE KEYS */;

INSERT INTO `Genero` (`id_genero`, `nombre`)
VALUES
	(1,X'41636369C3B36E'),
	(2,X'53757370656E736F'),
	(3,X'4472616D61'),
	(4,X'4372696D656E');

/*!40000 ALTER TABLE `Genero` ENABLE KEYS */;
UNLOCK TABLES;


# Volcado de tabla HorarioFuncion
# ------------------------------------------------------------

DROP TABLE IF EXISTS `HorarioFuncion`;

CREATE TABLE `HorarioFuncion` (
  `id_horario_funcion` int(11) NOT NULL,
  `duracion_intervalo` int(11) DEFAULT NULL,
  `duracion_publicidad` int(11) DEFAULT NULL,
  `es_trasnoche` tinyint(1) DEFAULT NULL,
  `hora_primera_funcion` datetime DEFAULT NULL,
  `hora_ultima_funcion` datetime DEFAULT NULL,
  `id_cine` int(11) NOT NULL,
  PRIMARY KEY (`id_horario_funcion`),
  KEY `fk_HorarioFuncion_Cine1_idx` (`id_cine`),
  CONSTRAINT `fk_HorarioFuncion_Cine1` FOREIGN KEY (`id_cine`) REFERENCES `Cine` (`id_cine`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;



# Volcado de tabla PaisDeOrigen
# ------------------------------------------------------------

DROP TABLE IF EXISTS `PaisDeOrigen`;

CREATE TABLE `PaisDeOrigen` (
  `id_pais_de_origen` int(11) NOT NULL AUTO_INCREMENT,
  `idioma` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `nombre` varchar(45) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id_pais_de_origen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

LOCK TABLES `PaisDeOrigen` WRITE;
/*!40000 ALTER TABLE `PaisDeOrigen` DISABLE KEYS */;

INSERT INTO `PaisDeOrigen` (`id_pais_de_origen`, `idioma`, `nombre`)
VALUES
	(1,X'45737061C3B16F6C',X'417267656E74696E61'),
	(2,X'45737061C3B16F6C20',X'45737061C3B161'),
	(3,X'496E676CC3A973',X'45455555');

/*!40000 ALTER TABLE `PaisDeOrigen` ENABLE KEYS */;
UNLOCK TABLES;


# Volcado de tabla Pelicula
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Pelicula`;

CREATE TABLE `Pelicula` (
  `id_pelicula` int(11) NOT NULL AUTO_INCREMENT,
  `anio_estreno` int(11) DEFAULT NULL,
  `disponible` tinyint(1) NOT NULL,
  `duracion` int(11) NOT NULL,
  `fecha_ingreso` date DEFAULT NULL,
  `nombre` varchar(100) COLLATE utf8_bin NOT NULL,
  `titulo_original` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `id_calificacion` int(11) NOT NULL,
  `id_pais_de_origen` int(11) NOT NULL,
  `id_genero` int(11) NOT NULL,
  PRIMARY KEY (`id_pelicula`),
  UNIQUE KEY `titulo_original_UNIQUE` (`titulo_original`),
  KEY `fk_Pelicula_Calificacion1_idx` (`id_calificacion`),
  KEY `fk_Pelicula_PaisDeOrigen1_idx` (`id_pais_de_origen`),
  KEY `fk_Pelicula_Genero1_idx` (`id_genero`),
  CONSTRAINT `fk_Pelicula_Calificacion1` FOREIGN KEY (`id_calificacion`) REFERENCES `Calificacion` (`id_calificacion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Pelicula_Genero1` FOREIGN KEY (`id_genero`) REFERENCES `Genero` (`id_genero`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Pelicula_PaisDeOrigen1` FOREIGN KEY (`id_pais_de_origen`) REFERENCES `PaisDeOrigen` (`id_pais_de_origen`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

LOCK TABLES `Pelicula` WRITE;
/*!40000 ALTER TABLE `Pelicula` DISABLE KEYS */;

INSERT INTO `Pelicula` (`id_pelicula`, `anio_estreno`, `disponible`, `duracion`, `fecha_ingreso`, `nombre`, `titulo_original`, `id_calificacion`, `id_pais_de_origen`, `id_genero`)
VALUES
	(2,2000,1,120,'2018-01-01',X'4E75657665205265696E6173',X'4E75657665205265696E6173',1,1,2);

/*!40000 ALTER TABLE `Pelicula` ENABLE KEYS */;
UNLOCK TABLES;


# Volcado de tabla Personaje
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Personaje`;

CREATE TABLE `Personaje` (
  `id_personaje` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_en_pelicula` varchar(40) COLLATE utf8_bin NOT NULL,
  `id_rol` int(11) NOT NULL,
  `id_actor` int(11) NOT NULL,
  PRIMARY KEY (`id_personaje`),
  KEY `fk_Personaje_Rol1_idx` (`id_rol`),
  KEY `fk_Personaje_Actor1_idx` (`id_actor`),
  CONSTRAINT `fk_Personaje_Actor1` FOREIGN KEY (`id_actor`) REFERENCES `Actor` (`id_actor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Personaje_Rol1` FOREIGN KEY (`id_rol`) REFERENCES `Rol` (`id_rol`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

LOCK TABLES `Personaje` WRITE;
/*!40000 ALTER TABLE `Personaje` DISABLE KEYS */;

INSERT INTO `Personaje` (`id_personaje`, `nombre_en_pelicula`, `id_rol`, `id_actor`)
VALUES
	(1,X'4D6172636F73',1,1),
	(2,X'4A75616E',1,2),
	(5,X'56616C65726961',2,4);

/*!40000 ALTER TABLE `Personaje` ENABLE KEYS */;
UNLOCK TABLES;


# Volcado de tabla Programacion
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Programacion`;

CREATE TABLE `Programacion` (
  `id_programacion` int(11) NOT NULL,
  `fecha_fin` datetime DEFAULT NULL,
  `fecha_hora_creada` datetime DEFAULT NULL,
  `fecha_inicio` datetime DEFAULT NULL,
  `id_cine` int(11) NOT NULL,
  PRIMARY KEY (`id_programacion`),
  KEY `fk_Programacion_Cine1_idx` (`id_cine`),
  CONSTRAINT `fk_Programacion_Cine1` FOREIGN KEY (`id_cine`) REFERENCES `Cine` (`id_cine`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;



# Volcado de tabla Reparto
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Reparto`;

CREATE TABLE `Reparto` (
  `id_personaje` int(11) NOT NULL,
  `id_pelicula` int(11) NOT NULL,
  PRIMARY KEY (`id_personaje`,`id_pelicula`),
  KEY `fk_Personaje_has_Pelicula_Pelicula1_idx` (`id_pelicula`),
  CONSTRAINT `fk_Personaje_has_Pelicula_Pelicula1` FOREIGN KEY (`id_pelicula`) REFERENCES `Pelicula` (`id_pelicula`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Personaje_has_Pelicula_Personaje1` FOREIGN KEY (`id_personaje`) REFERENCES `Personaje` (`id_personaje`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

LOCK TABLES `Reparto` WRITE;
/*!40000 ALTER TABLE `Reparto` DISABLE KEYS */;

INSERT INTO `Reparto` (`id_personaje`, `id_pelicula`)
VALUES
	(1,2),
	(2,2),
	(5,2);

/*!40000 ALTER TABLE `Reparto` ENABLE KEYS */;
UNLOCK TABLES;


# Volcado de tabla Rol
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Rol`;

CREATE TABLE `Rol` (
  `id_rol` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id_rol`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

LOCK TABLES `Rol` WRITE;
/*!40000 ALTER TABLE `Rol` DISABLE KEYS */;

INSERT INTO `Rol` (`id_rol`, `nombre`)
VALUES
	(1,X'50726F7461676F6E69737461'),
	(2,X'536563756E646172696F');

/*!40000 ALTER TABLE `Rol` ENABLE KEYS */;
UNLOCK TABLES;


# Volcado de tabla Sala
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Sala`;

CREATE TABLE `Sala` (
  `id_sala` int(11) NOT NULL,
  `capacidad` int(11) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  `id_cine` int(11) NOT NULL,
  PRIMARY KEY (`id_sala`),
  KEY `fk_Sala_Cine1_idx` (`id_cine`),
  CONSTRAINT `fk_Sala_Cine1` FOREIGN KEY (`id_cine`) REFERENCES `Cine` (`id_cine`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;



# Volcado de tabla Sexo
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Sexo`;

CREATE TABLE `Sexo` (
  `id_sexo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id_sexo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

LOCK TABLES `Sexo` WRITE;
/*!40000 ALTER TABLE `Sexo` DISABLE KEYS */;

INSERT INTO `Sexo` (`id_sexo`, `nombre`)
VALUES
	(1,X'46656D656E696E6F'),
	(2,X'4D617363756C696E6F');

/*!40000 ALTER TABLE `Sexo` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
