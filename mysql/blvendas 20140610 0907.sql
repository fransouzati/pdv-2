-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.51a-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema sisvendas
--

CREATE DATABASE IF NOT EXISTS sisvendas;
USE sisvendas;

--
-- Definition of table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE `clientes` (
  `CODIGO` int(11) NOT NULL auto_increment,
  `NOME` varchar(255) default NULL,
  `ENDERECO` varchar(255) default NULL,
  `BAIRRO` varchar(60) default NULL,
  `CIDADE` varchar(60) default NULL,
  `UF` varchar(2) default NULL,
  `CEP` varchar(10) default NULL,
  `TELEFONE` varchar(20) default NULL,
  PRIMARY KEY  (`CODIGO`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `clientes`
--

/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` (`CODIGO`,`NOME`,`ENDERECO`,`BAIRRO`,`CIDADE`,`UF`,`CEP`,`TELEFONE`) VALUES 
 (1,'JURANDIR','RUA 1','CENTRO','UBÃ','MG','000','0000000000');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;


--
-- Definition of table `fornecedores`
--

DROP TABLE IF EXISTS `fornecedores`;
CREATE TABLE `fornecedores` (
  `CODIGO` int(11) NOT NULL auto_increment,
  `NOME` varchar(255) default NULL,
  `ENDERECO` varchar(255) default NULL,
  `BAIRRO` varchar(60) default NULL,
  `CIDADE` varchar(60) default NULL,
  `UF` varchar(2) default NULL,
  `CEP` varchar(10) default NULL,
  `TELEFONE` varchar(20) default NULL,
  PRIMARY KEY  (`CODIGO`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fornecedores`
--

/*!40000 ALTER TABLE `fornecedores` DISABLE KEYS */;
INSERT INTO `fornecedores` (`CODIGO`,`NOME`,`ENDERECO`,`BAIRRO`,`CIDADE`,`UF`,`CEP`,`TELEFONE`) VALUES 
 (1,'MARCELO ','RUA 2','CENTRO 2','UBÃ 2','MG','234','234234');
/*!40000 ALTER TABLE `fornecedores` ENABLE KEYS */;


--
-- Definition of table `produtos`
--

DROP TABLE IF EXISTS `produtos`;
CREATE TABLE `produtos` (
  `CODIGO` int(11) NOT NULL auto_increment,
  `FORNECEDORES_CODIGO` int(11) NOT NULL,
  `NOME` varchar(255) default NULL,
  `VALOR` double default NULL,
  `ESTOQUE` int(11) default NULL,
  PRIMARY KEY  (`CODIGO`),
  KEY `FK_produtos_1` (`FORNECEDORES_CODIGO`),
  CONSTRAINT `FK_produtos_1` FOREIGN KEY (`FORNECEDORES_CODIGO`) REFERENCES `fornecedores` (`CODIGO`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `produtos`
--

/*!40000 ALTER TABLE `produtos` DISABLE KEYS */;
INSERT INTO `produtos` (`CODIGO`,`FORNECEDORES_CODIGO`,`NOME`,`VALOR`,`ESTOQUE`) VALUES 
 (1,1,'pele de boi',100,45),
 (2,1,'cola branca',56,100);
/*!40000 ALTER TABLE `produtos` ENABLE KEYS */;


--
-- Definition of table `tbl_usuarios`
--

DROP TABLE IF EXISTS `tbl_usuarios`;
CREATE TABLE `tbl_usuarios` (
  `pk_codigo` int(10) unsigned NOT NULL auto_increment,
  `nome` varchar(45) NOT NULL,
  `login` varchar(45) NOT NULL,
  `senha` varchar(45) NOT NULL,
  PRIMARY KEY  (`pk_codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_usuarios`
--

/*!40000 ALTER TABLE `tbl_usuarios` DISABLE KEYS */;
INSERT INTO `tbl_usuarios` (`pk_codigo`,`nome`,`login`,`senha`) VALUES 
 (1,'Administrador','admin','123');
/*!40000 ALTER TABLE `tbl_usuarios` ENABLE KEYS */;


--
-- Definition of table `vendas`
--

DROP TABLE IF EXISTS `vendas`;
CREATE TABLE `vendas` (
  `CODIGO` int(11) NOT NULL auto_increment,
  `CLIENTES_CODIGO` int(11) NOT NULL,
  `DATA_VENDA` date default NULL,
  `VALOR_TOTAL` float default NULL,
  `DESCONTO` float default NULL,
  PRIMARY KEY  (`CODIGO`),
  KEY `FK_vendas_1` (`CLIENTES_CODIGO`),
  CONSTRAINT `FK_vendas_1` FOREIGN KEY (`CLIENTES_CODIGO`) REFERENCES `clientes` (`CODIGO`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vendas`
--

/*!40000 ALTER TABLE `vendas` DISABLE KEYS */;
INSERT INTO `vendas` (`CODIGO`,`CLIENTES_CODIGO`,`DATA_VENDA`,`VALOR_TOTAL`,`DESCONTO`) VALUES 
 (1,1,'2014-05-10',412,0);
/*!40000 ALTER TABLE `vendas` ENABLE KEYS */;


--
-- Definition of table `vendas_produto`
--

DROP TABLE IF EXISTS `vendas_produto`;
CREATE TABLE `vendas_produto` (
  `CODIGO` int(11) NOT NULL auto_increment,
  `CODIGO_PRODUTO` int(11) default NULL,
  `CODIGO_VENDA` int(11) default NULL,
  `QUANTIDADE` int(11) default NULL,
  PRIMARY KEY  (`CODIGO`),
  KEY `FK_vendas_produto_1` (`CODIGO_PRODUTO`),
  KEY `FK_vendas_produto_2` (`CODIGO_VENDA`),
  CONSTRAINT `FK_vendas_produto_1` FOREIGN KEY (`CODIGO_PRODUTO`) REFERENCES `produtos` (`CODIGO`),
  CONSTRAINT `FK_vendas_produto_2` FOREIGN KEY (`CODIGO_VENDA`) REFERENCES `vendas` (`CODIGO`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vendas_produto`
--

/*!40000 ALTER TABLE `vendas_produto` DISABLE KEYS */;
INSERT INTO `vendas_produto` (`CODIGO`,`CODIGO_PRODUTO`,`CODIGO_VENDA`,`QUANTIDADE`) VALUES 
 (1,1,1,3),
 (2,2,1,2);
/*!40000 ALTER TABLE `vendas_produto` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
