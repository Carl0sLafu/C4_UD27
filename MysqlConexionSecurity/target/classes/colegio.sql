DROP DATABASE IF EXISTS piezasprovadores;
CREATE DATABASE piezasprovadores;
USE piezasprovadores;

/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `piezas` (
  `codigo` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

LOCK TABLES `piezas` WRITE;
/*!40000 ALTER TABLE `piezas` DISABLE KEYS */;
INSERT INTO `piezas` VALUES (1,'Tornillo'),(2,'Tuerca'),(3,'Clavo'),(4,'Alambre'),(5,'Sargento'),(6,'Arandela');
/*!40000 ALTER TABLE `piezas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedores`
--

/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proveedores` (
  `id` char(4) NOT NULL,
  `nombre` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedores`
--

LOCK TABLES `proveedores` WRITE;
/*!40000 ALTER TABLE `proveedores` DISABLE KEYS */;
INSERT INTO `proveedores` VALUES ('1','Leroy merlin'),('100','Aircraft'),('12','Bauhaus'),('14','Ferreteria Loli'),('18','Panaderia del metal'),('20','Exmpresa X'),('22','Proveedor Y'),('24','Tornillos y tuercas'),('25','Cobres Manolo'),('26','Chapa y pintura');
/*!40000 ALTER TABLE `proveedores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `suministra`
--
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `suministra` (
  `codigopieza` int NOT NULL,
  `idproveedor` char(4) NOT NULL,
  `precio` smallint NOT NULL,
  PRIMARY KEY (`codigopieza`,`idproveedor`),
  KEY `idproveedor` (`idproveedor`),
  CONSTRAINT `suministra_ibfk_1` FOREIGN KEY (`codigopieza`) REFERENCES `piezas` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `suministra_ibfk_2` FOREIGN KEY (`idproveedor`) REFERENCES `proveedores` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `suministra`
--

LOCK TABLES `suministra` WRITE;
/*!40000 ALTER TABLE `suministra` DISABLE KEYS */;
INSERT INTO `suministra` VALUES (1,'1',100),(2,'12',200),(3,'14',120),(4,'18',150),(5,'20',135),(6,'22',90);
/*!40000 ALTER TABLE `suministra` ENABLE KEYS */;
UNLOCK TABLES;
