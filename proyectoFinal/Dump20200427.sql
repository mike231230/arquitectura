CREATE DATABASE  IF NOT EXISTS `gestor` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `gestor`;
-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: gestor
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `causa`
--

DROP TABLE IF EXISTS `causa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `causa` (
  `idcausa` int NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  PRIMARY KEY (`idcausa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `causa`
--

LOCK TABLES `causa` WRITE;
/*!40000 ALTER TABLE `causa` DISABLE KEYS */;
INSERT INTO `causa` VALUES (1,'TECTONICA','son los sismos que se originan por el desplaz'),(2,'VOLCANICA','es poco frecuente; cuando la erupción es viol'),(3,'HUNDIMIENTO','cuando al interior de la corteza se ha produc'),(4,'DESLIZAMIENTO','el propio peso de las montañas es una fuerza '),(5,'EXPLOSIONES ATOMICAS',' realizadas por el ser humano y que al parece'),(6,'CLIMA','cambios bruscos en la temperatura'),(7,'INVERNADERO','el efecto invernadero causado por las emicion'),(8,'TRUENOS',' se producen por el contacto de una masa de a'),(9,'TALA','la tala excesiva de arboles que producen somb'),(10,'ENFRENTAMIENTO','enfrentamiento con arma de fuego'),(11,'ASALTO CON ARMA DE FUEGO','intento de asalto con arma de fuego'),(12,'PICO','intento de asalto con arma punzo cortante'),(13,'BASURA','quema de basura '),(14,'FOGATA','dejar una fogata en una zona que tiene mucha '),(15,'AUTO','no verificar el estado del auto ');
/*!40000 ALTER TABLE `causa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `causa_has_desastre`
--

DROP TABLE IF EXISTS `causa_has_desastre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `causa_has_desastre` (
  `causa_idcausa` int NOT NULL,
  `desastre_iddesastre` int NOT NULL,
  PRIMARY KEY (`causa_idcausa`,`desastre_iddesastre`),
  KEY `fk_causa_has_desastre_desastre1_idx` (`desastre_iddesastre`),
  KEY `fk_causa_has_desastre_causa1_idx` (`causa_idcausa`),
  CONSTRAINT `fk_causa_has_desastre_causa1` FOREIGN KEY (`causa_idcausa`) REFERENCES `causa` (`idcausa`),
  CONSTRAINT `fk_causa_has_desastre_desastre1` FOREIGN KEY (`desastre_iddesastre`) REFERENCES `desastre` (`iddesastre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `causa_has_desastre`
--

LOCK TABLES `causa_has_desastre` WRITE;
/*!40000 ALTER TABLE `causa_has_desastre` DISABLE KEYS */;
/*!40000 ALTER TABLE `causa_has_desastre` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contactos_ayuda`
--

DROP TABLE IF EXISTS `contactos_ayuda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contactos_ayuda` (
  `idcontactos_ayuda` int NOT NULL,
  `institucion` varchar(45) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  PRIMARY KEY (`idcontactos_ayuda`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contactos_ayuda`
--

LOCK TABLES `contactos_ayuda` WRITE;
/*!40000 ALTER TABLE `contactos_ayuda` DISABLE KEYS */;
INSERT INTO `contactos_ayuda` VALUES (1,'EMERGENCIAS','911'),(2,'PROTECCION CIVIL','56-83-22-22'),(3,'CRUZ ROJA','5557-5757'),(4,'BOMBEROS','5768-3700'),(5,'POLICIA FEDERAL','5684-2142'),(6,'AMBULANCIAS','5601-7631'),(7,'INCENDIOS FORESTALES','5554-0612'),(8,'SECRETARIA DEL MEDIO AMBIENTE','55420117'),(9,'INFORMACION GENERAL','040'),(10,'LOCATEL','5658-1111'),(11,'CAPUFE','074');
/*!40000 ALTER TABLE `contactos_ayuda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `delegacion`
--

DROP TABLE IF EXISTS `delegacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `delegacion` (
  `iddelegacion` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`iddelegacion`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `delegacion`
--

LOCK TABLES `delegacion` WRITE;
/*!40000 ALTER TABLE `delegacion` DISABLE KEYS */;
INSERT INTO `delegacion` VALUES (1,'ALVARO OBREGON'),(2,'AZCAPOTZALCO'),(3,'BENITO JUAREZ'),(4,'COYOACAN'),(5,'CUAJIMALPA DE MORELOS'),(6,'CUAHUTEMOC'),(7,'GUSTAVO A MADERO'),(8,'IZTACALCO'),(9,'IZTAPALAPA'),(10,'MAGDALENA CONTRERAS'),(11,'MIGUEL HIDALGO'),(12,'MILPA ALTA'),(13,'TLAHUAC'),(14,'TLALPAN'),(15,'VENUSTIANO CARRANZA'),(16,'XOCHIMILCO'),(32,'prueba2'),(35,'prueba');
/*!40000 ALTER TABLE `delegacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `delegacion_has_zona`
--

DROP TABLE IF EXISTS `delegacion_has_zona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `delegacion_has_zona` (
  `delegacion_iddelegacion` int NOT NULL,
  `zona_idzona` int NOT NULL,
  PRIMARY KEY (`delegacion_iddelegacion`,`zona_idzona`),
  KEY `fk_delegacion_has_zona_zona1_idx` (`zona_idzona`),
  KEY `fk_delegacion_has_zona_delegacion1_idx` (`delegacion_iddelegacion`),
  CONSTRAINT `fk_delegacion_has_zona_delegacion1` FOREIGN KEY (`delegacion_iddelegacion`) REFERENCES `delegacion` (`iddelegacion`),
  CONSTRAINT `fk_delegacion_has_zona_zona1` FOREIGN KEY (`zona_idzona`) REFERENCES `zona` (`idzona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `delegacion_has_zona`
--

LOCK TABLES `delegacion_has_zona` WRITE;
/*!40000 ALTER TABLE `delegacion_has_zona` DISABLE KEYS */;
INSERT INTO `delegacion_has_zona` VALUES (1,1),(2,1),(3,1),(4,1),(5,1),(6,1),(7,1),(8,1),(9,1),(10,1),(11,1),(12,1),(13,1),(14,1),(15,1),(16,1),(1,2),(2,2),(3,2),(4,2),(5,2),(6,2),(7,2),(8,2),(9,2),(10,2),(11,2),(12,2),(13,2),(14,2),(15,2),(16,2),(1,3),(2,3),(3,3),(4,3),(5,3),(6,3),(7,3),(8,3),(9,3),(10,3),(11,3),(12,3),(13,3),(14,3),(15,3),(16,3),(1,4),(2,4),(3,4),(4,4),(5,4),(6,4),(7,4),(8,4),(9,4),(10,4),(11,4),(12,4),(13,4),(14,4),(15,4),(16,4),(1,5),(2,5),(3,5),(4,5),(5,5),(6,5),(7,5),(8,5),(9,5),(10,5),(11,5),(12,5),(13,5),(14,5),(15,5),(16,5);
/*!40000 ALTER TABLE `delegacion_has_zona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `desastre`
--

DROP TABLE IF EXISTS `desastre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `desastre` (
  `iddesastre` int NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `tipo_idtipo` int NOT NULL,
  PRIMARY KEY (`iddesastre`),
  KEY `fk_desastre_tipo1_idx` (`tipo_idtipo`),
  CONSTRAINT `fk_desastre_tipo1` FOREIGN KEY (`tipo_idtipo`) REFERENCES `tipo` (`idtipo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `desastre`
--

LOCK TABLES `desastre` WRITE;
/*!40000 ALTER TABLE `desastre` DISABLE KEYS */;
INSERT INTO `desastre` VALUES (1,'PRECIPITACION',0),(2,'INUNDACION',0),(3,'TORMENTA ELECTRICA',0),(4,'GRANIZO',0),(5,'TEMPERATURAS MINIMAS',0),(6,'TEMPERATURAS MAXIMAS',0),(7,'NEVADAS',0),(8,'SUSCEPTIBILIDAD DE LADERAS ',0),(9,'SISMO ',0),(10,'CENIZA VOLCANICA',0),(11,'MALA CALIDAD DE AIRE',0),(12,'ACCIDENTES AUTOMOVILISTICOS',0),(13,'FUGAS DE HIDROCARBUROS',0),(14,'BALACERA',0),(15,'HERIDA PUNZO CORTANTE',0),(16,'INCENDIO',0);
/*!40000 ALTER TABLE `desastre` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `borrado` BEFORE DELETE ON `desastre` FOR EACH ROW begin
delete from riesgo where desastre_iddesastre=old.iddesastre;
delete from desastre_has_causa where desastre_iddesastre=old.iddesastre;
delete from desastre_has_zona where desastre_iddesastre=old.iddesastre;
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `desastre_has_zona`
--

DROP TABLE IF EXISTS `desastre_has_zona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `desastre_has_zona` (
  `desastre_iddesastre` int NOT NULL,
  `zona_idzona` int NOT NULL,
  PRIMARY KEY (`desastre_iddesastre`,`zona_idzona`),
  KEY `fk_desastre_has_zona_zona1_idx` (`zona_idzona`),
  KEY `fk_desastre_has_zona_desastre1_idx` (`desastre_iddesastre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `desastre_has_zona`
--

LOCK TABLES `desastre_has_zona` WRITE;
/*!40000 ALTER TABLE `desastre_has_zona` DISABLE KEYS */;
/*!40000 ALTER TABLE `desastre_has_zona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `herramienta`
--

DROP TABLE IF EXISTS `herramienta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `herramienta` (
  `idherramienta` int NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `descripcion` varchar(300) NOT NULL,
  `instrucciones` varchar(300) NOT NULL,
  PRIMARY KEY (`idherramienta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `herramienta`
--

LOCK TABLES `herramienta` WRITE;
/*!40000 ALTER TABLE `herramienta` DISABLE KEYS */;
/*!40000 ALTER TABLE `herramienta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `herramienta_has_zona`
--

DROP TABLE IF EXISTS `herramienta_has_zona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `herramienta_has_zona` (
  `herramienta_idherramienta` int NOT NULL,
  `zona_idzona` int NOT NULL,
  PRIMARY KEY (`herramienta_idherramienta`,`zona_idzona`),
  KEY `fk_herramienta_has_zona_zona1_idx` (`zona_idzona`),
  KEY `fk_herramienta_has_zona_herramienta1_idx` (`herramienta_idherramienta`),
  CONSTRAINT `fk_herramienta_has_zona_herramienta1` FOREIGN KEY (`herramienta_idherramienta`) REFERENCES `herramienta` (`idherramienta`),
  CONSTRAINT `fk_herramienta_has_zona_zona1` FOREIGN KEY (`zona_idzona`) REFERENCES `zona` (`idzona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `herramienta_has_zona`
--

LOCK TABLES `herramienta_has_zona` WRITE;
/*!40000 ALTER TABLE `herramienta_has_zona` DISABLE KEYS */;
/*!40000 ALTER TABLE `herramienta_has_zona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prevencion`
--

DROP TABLE IF EXISTS `prevencion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prevencion` (
  `idprevencion` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `descripcion` varchar(300) NOT NULL,
  `riesgo_idriesgo` int DEFAULT NULL,
  PRIMARY KEY (`idprevencion`),
  KEY `fk_prevencion_riesgo1_idx` (`riesgo_idriesgo`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prevencion`
--

LOCK TABLES `prevencion` WRITE;
/*!40000 ALTER TABLE `prevencion` DISABLE KEYS */;
INSERT INTO `prevencion` VALUES (1,'MASCARILLA','USO DE MASCARILLA PARA EVITAR LA INTRODUCCION DE CENIZA',16),(2,'PIEL CUBIERTA','USO DE ROPA GRANDE PARA QUE LA PIEL NO SUFRA IRRITACION',16),(3,'REVISION DE INMUEBLE','REVISION DE LOS SIMIENTOS DE LOS INMUEBLES PARA NO SUFRIR DE HUNDIMIENTO',1),(4,'REVISION ESTRUCTURAL','REVISAR CONSTANTEMENTE EL HOGAR EN BUSCA DE POSIBLES FRACTURAS',3),(5,'COLOCACION DE REFUERZOS','REFORZAR CON MATERIALES Y CASTILLOS PARA EVITAR EL DERRUMBE',2),(6,'ALBERGUE ','IR A LOS ALBERGUES POR PARTE DEL GOBIERNO PARA NO PERDER MAS ',7),(7,'EVITAR RAYOS','NO SALIR EN UNA TORMENTA ELECTRICA O BIEN NO LLEVAR COSAS DE METAL ENCIMA ',9),(8,'CEDER','EN UN ASALTO CON ARMA PUNZO CORTANTE LO MEJOR ES CEDER PARA NO SUFRIR DAÑOS',11),(9,'CEDER Y TRANQUILIDAD','EN UN ASALTO CON ARMA DE FUEGO ES MEJOR REFUGIARSE DESPUES DE ESTE Y NO ACTUAR DE MANERA VALIENTE',10),(10,'AGACHARSE','EN UN TIROTEO LO MEJOR ES BUSCAR REFUGIO O TIRARSE AL SUELO',10),(11,'TRIANGULO DE LA VIDA','alrededor de cada uno de dichos objetos quedan espacios vacíos; estos espacios son denominados \"triángulos de la vida\", propuestos como el sitio recomendable durante un terremoto para sobrevivir.',17),(12,'SOBRECARGA','NO SOBRECARGAR UN ENCHUFE CON APARATOS ELECTRICOS',16),(13,'AUTO','VERIFICAR EL ESTADO DEL AUTO CUANDO SE SALE',8),(14,'pandemia','se toma las precauciones necesarias para evitar los contagios en la zona o ciudad',0);
/*!40000 ALTER TABLE `prevencion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prevencion_has_contactos_ayuda`
--

DROP TABLE IF EXISTS `prevencion_has_contactos_ayuda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prevencion_has_contactos_ayuda` (
  `prevencion_idprevencion` int NOT NULL,
  `contactos_ayuda_idcontactos_ayuda` int NOT NULL,
  PRIMARY KEY (`prevencion_idprevencion`,`contactos_ayuda_idcontactos_ayuda`),
  KEY `fk_prevencion_has_contactos_ayuda_contactos_ayuda1_idx` (`contactos_ayuda_idcontactos_ayuda`),
  KEY `fk_prevencion_has_contactos_ayuda_prevencion1_idx` (`prevencion_idprevencion`),
  CONSTRAINT `fk_prevencion_has_contactos_ayuda_contactos_ayuda1` FOREIGN KEY (`contactos_ayuda_idcontactos_ayuda`) REFERENCES `contactos_ayuda` (`idcontactos_ayuda`),
  CONSTRAINT `fk_prevencion_has_contactos_ayuda_prevencion1` FOREIGN KEY (`prevencion_idprevencion`) REFERENCES `prevencion` (`idprevencion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prevencion_has_contactos_ayuda`
--

LOCK TABLES `prevencion_has_contactos_ayuda` WRITE;
/*!40000 ALTER TABLE `prevencion_has_contactos_ayuda` DISABLE KEYS */;
/*!40000 ALTER TABLE `prevencion_has_contactos_ayuda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `riesgo`
--

DROP TABLE IF EXISTS `riesgo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `riesgo` (
  `idriesgo` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `descripcion` varchar(300) NOT NULL,
  PRIMARY KEY (`idriesgo`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `riesgo`
--

LOCK TABLES `riesgo` WRITE;
/*!40000 ALTER TABLE `riesgo` DISABLE KEYS */;
INSERT INTO `riesgo` VALUES (1,'HUNDIMIENTO','LA ESTRUCTURA SE PUEDE HUNDIR POR PROBLEMAS CON MINAS O SOCAVONES'),(2,'DERRUMBE','LA ESTRUCTURA DE LA CASA SE ROMPE Y SE QUIEBRA DEJANDO SOLO RESTOS DE LA CASAS'),(3,'FRACTURAS','LA ESTRUCTURA DE LA CASA SOLO SUFRE DAÑOS PERO PUEDE CORRER EL RIESGO DE DERRUMBE'),(4,'ENCHARCAMIENTO','CUANDO EL AGUA SUBE MAS DE UN METRO DE ALTURA SE CONSIDERA UN ENCHARCAMIENTO '),(5,'INUNDACION','EL NIVEL DE AGUA ABARCA MAS DE UN METRO DE ALTURA Y ES CONSTANTE EN LA ZONA'),(6,'CULTIVOS','PERDIDAS DE CULTIVOS A CAUSA DE MUCHA AGUA'),(7,'DAÑOS MATERIALES','SE PUEDE PERDER BIENES MATERIALES POR LA HUMEDAD'),(8,'ASFIXIA','FALTA DE INGRESO DE OXIGENO POR LOS PULMONES'),(9,'ELECTROCUTAMIENTO','SE DA POR EL EXCESO DE ENERGIA ELECTRICA QUE CORRE POR EL CUERPO'),(10,'DISPARO','HERIDA POR ARMA DE FUEGO'),(11,'DAÑO PUNZO CORTANTE','HERIDA POR ARMA PUNZOCORTANTE'),(12,'QUEMADURA 1ER GRADO','AFECTACION DE LA CAPA EXTERNA DE LA PIEL'),(13,'QUEMADURA 2DO GRADO','AFECTACION EN CAPA EXTERNA Y CAPA SUBYACENTE DE LA PIEL CAUSANDO DOLOR ENROJECIMIENTO HINCHAZON Y AMPOLLAS'),(14,'QUEMADURA 3ER GRADO','AFECTAN LAS CAPAS PROFUNDAS DE LA PIEL'),(15,'EXPLOSION','EXPLOSION DE GRAN MAGNITUD'),(16,'INTOXICACION','INTOXICACION POR CENIZAS'),(17,'APLASTAMIENTO','EL CUERPO ES CONTRAIDO POR OBJETOS PESADOS'),(27,'prueba10',''),(28,'mdiasmdlasijda',''),(29,'smalkdsan','smdkalndlkwan');
/*!40000 ALTER TABLE `riesgo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo`
--

DROP TABLE IF EXISTS `tipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo` (
  `idtipo` int NOT NULL,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`idtipo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo`
--

LOCK TABLES `tipo` WRITE;
/*!40000 ALTER TABLE `tipo` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `idusuario` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) NOT NULL,
  `pswd` varchar(20) NOT NULL,
  `codigo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idusuario`),
  UNIQUE KEY `nombre` (`nombre`),
  UNIQUE KEY `codigo_UNIQUE` (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'mike','mike','1234'),(2,'admin','admin','4321'),(3,'papa','papa',NULL),(4,'usuario','usuario',NULL);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zona`
--

DROP TABLE IF EXISTS `zona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `zona` (
  `idzona` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`idzona`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zona`
--

LOCK TABLES `zona` WRITE;
/*!40000 ALTER TABLE `zona` DISABLE KEYS */;
INSERT INTO `zona` VALUES (1,'norte'),(2,'sur'),(3,'poniente'),(4,'oriente'),(5,'centro');
/*!40000 ALTER TABLE `zona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'gestor'
--

--
-- Dumping routines for database 'gestor'
--
/*!50003 DROP PROCEDURE IF EXISTS `delegacion_zona` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `delegacion_zona`(nombre varchar(45))
begin 

select * from delegacion as d inner join colonia as c on c.delegacion_iddelegacion=d.iddelegacion inner join zona as z on c.zona_idzona=z.idzona where d.nombre=nombre;



insert into consulta values(null,nombre);
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-27 19:25:38
