DROP TABLE IF EXISTS `piezas`;
SET character_set_client = utf8mb4 ;

CREATE TABLE `piezas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curso`
--

LOCK TABLES `piezas` WRITE;
/*!40000 ALTER TABLE `piezas` DISABLE KEYS */;
INSERT INTO `piezas` VALUES (1,'pieza 1'),(2,'pieza 2'),(3,'pieza 3'),(4,'pieza 4');
/*!40000 ALTER TABLE `piezas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedores`
--

DROP TABLE IF EXISTS `proveedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `proveedores` (
	id char(4) not null,
	nombre nvarchar(100),
    primary key(id)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedores`
--

LOCK TABLES `proveedores` WRITE;
/*!40000 ALTER TABLE `proveedores` DISABLE KEYS */;
INSERT INTO `proveedores` VALUES ('SD4D','proveedores 1'),('FWE1','proveedores 2'),('4CFE','proveedores 3'),('WDQS','proveedores 4');
/*!40000 ALTER TABLE `proveedores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `suministra`
--

DROP TABLE IF EXISTS `suministra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `suministra` (
	id int not null auto_increment,
	codigo_pieza int,
    id_proveedor char(4),
    precio int,
    primary key(id),
	CONSTRAINT piezas_fk FOREIGN KEY (codigo_pieza) REFERENCES piezas (id) ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT proveedores_fk FOREIGN KEY (id_proveedor) REFERENCES proveedores (id) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `suministra`
--

LOCK TABLES `suministra` WRITE;
/*!40000 ALTER TABLE `suministra` DISABLE KEYS */;
INSERT INTO `suministra` VALUES (1,'SD4D',21),(2,'WDQS',12),(3,'FWE1',53),(4,'4CFE',23);
/*!40000 ALTER TABLE `suministra` ENABLE KEYS */;
UNLOCK TABLES;