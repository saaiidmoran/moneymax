-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 03-05-2018 a las 16:50:05
-- Versión del servidor: 5.7.15-log
-- Versión de PHP: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `casaempeños`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `apartados`
--

DROP TABLE IF EXISTS `apartados`;
CREATE TABLE IF NOT EXISTS `apartados` (
  `idApartados` int(11) NOT NULL AUTO_INCREMENT,
  `Fecha_ini_apart` date NOT NULL,
  `Fecha_fin_apart` date NOT NULL,
  `Precio_apart` int(11) NOT NULL,
  `Refrendo` int(11) NOT NULL,
  `Empleados_idEmpleado` int(11) NOT NULL,
  `Clientes_idClientes` int(11) NOT NULL,
  `Articulos_idArticulos` int(11) NOT NULL,
  PRIMARY KEY (`idApartados`),
  UNIQUE KEY `idApartados_UNIQUE` (`idApartados`),
  KEY `fk_Apartados_Empleados1_idx` (`Empleados_idEmpleado`),
  KEY `fk_Apartados_Clientes1_idx` (`Clientes_idClientes`),
  KEY `fk_Apartados_Articulos1_idx` (`Articulos_idArticulos`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `apartados`
--

INSERT INTO `apartados` (`idApartados`, `Fecha_ini_apart`, `Fecha_fin_apart`, `Precio_apart`, `Refrendo`, `Empleados_idEmpleado`, `Clientes_idClientes`, `Articulos_idArticulos`) VALUES
(1, '2017-05-31', '2017-06-30', 3000, 3000, 1, 3, 7),
(2, '2017-05-01', '2017-05-30', 5000, 5000, 1, 8, 11);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `articulos`
--

DROP TABLE IF EXISTS `articulos`;
CREATE TABLE IF NOT EXISTS `articulos` (
  `idArticulos` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre_art` varchar(100) DEFAULT NULL,
  `Marca_art` varchar(100) DEFAULT NULL,
  `Modelo_art` varchar(100) DEFAULT NULL,
  `Serie_art` varchar(100) DEFAULT NULL,
  `Categ_art` varchar(100) DEFAULT NULL,
  `Descripcion` varchar(100) DEFAULT NULL,
  `Estado_calidad` varchar(100) DEFAULT NULL,
  `Kilataje` varchar(100) DEFAULT NULL,
  `Modalidad` varchar(100) DEFAULT NULL,
  `Locacion` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idArticulos`),
  UNIQUE KEY `idArticulos_UNIQUE` (`idArticulos`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `articulos`
--

INSERT INTO `articulos` (`idArticulos`, `Nombre_art`, `Marca_art`, `Modelo_art`, `Serie_art`, `Categ_art`, `Descripcion`, `Estado_calidad`, `Kilataje`, `Modalidad`, `Locacion`) VALUES
(1, 'Celular', 'Samsung', 'Grand Neo', 'Galaxy', 'Electronico', 'Ta chidito', 'Buena', '--', 'En Venta', 'Anaquel 1'),
(2, 'Celular', 'Samsung', 'Grand Neo', 'Galaxy', 'Electronico', '--', 'Buena', '--', 'Empeñado', 'Anaquel 2'),
(3, 'Celular', 'Samsung', 'Grand Neo', 'Galaxy', 'Electronico', '--', 'Buena', '--', 'Empeñado', 'Anaquel 2'),
(4, 'Celular', 'Samsung', 'Grand Neo', 'Galaxy', 'Electronico', '--', 'Buena', '--', 'Empeñado', '--'),
(5, 'Ipod', 'Apple', '5s', '4th generción', 'Electronico', '-', 'Buena', '--', 'Empeñado', 'Anaquel 1'),
(6, 'Celular', 'Lenovo', 'Z2', 'ZUK', 'Electronico', '--', 'Buena', '--', 'Vendido', 'Anaquel 3'),
(7, 'Laptop', 'Patito', 'Barato', 'Chafa', 'Electronico', '--', 'Buena', '--', 'En Venta', 'Anaquel 2'),
(8, 'Celular', 'Sony', 'XA', 'Xperia', 'Electronico', '--', 'Buena', '--', 'Empeñado', 'Anaquel 1'),
(9, 'Laptop', 'HP', '8447', 'Elitebook', 'Electronico', '--', 'Buena', '--', 'Empeñado', '--'),
(10, 'Laptop', 'HP', 'Classmate', '8937', 'Electronico', '--', 'Buena', '--', 'Empeñado', '--'),
(11, 'Celular', 'Sony', 'XA', 'Xperia', 'Electronico', '--', 'Buena', '--', 'Vendido', '--'),
(12, 'Celular', 'Motorola', '2015', 'Moto X', 'Electronico', '--', 'Buena', '--', 'Empeñado', 'Anaquel 1'),
(13, 'Celular', 'Apple', 'Iphone 5', '--', 'Electronico', 'Iphone 5', 'Buena', '--', 'En Venta', 'Anaquel 4');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE IF NOT EXISTS `clientes` (
  `idClientes` int(11) NOT NULL AUTO_INCREMENT,
  `Cliente_nom` varchar(100) NOT NULL,
  `Cliente_tel` varchar(100) NOT NULL,
  PRIMARY KEY (`idClientes`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`idClientes`, `Cliente_nom`, `Cliente_tel`) VALUES
(1, 'David', '7351332197'),
(2, 'Ariadna Moran Gutierrez', '7351332197'),
(3, 'Erick', '7351464521'),
(4, 'Ariadna Moran', '7351332197'),
(5, 'Omar Hernandez', '7351332197'),
(6, 'Said', '7351332197'),
(8, 'David Loco', '7351443597'),
(9, 'Miguel Angel', '7351593827'),
(11, 'Gustavo Larana', '7351283290'),
(12, 'Gerardo Sanchez', '7351111111');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compras`
--

DROP TABLE IF EXISTS `compras`;
CREATE TABLE IF NOT EXISTS `compras` (
  `idCompras` int(11) NOT NULL AUTO_INCREMENT,
  `Fecha_comp` date NOT NULL,
  `Precio_comp` int(11) NOT NULL,
  `Empleados_idEmpleado` int(11) NOT NULL,
  `Clientes_idClientes` int(11) NOT NULL,
  `Articulos_idArticulos` int(11) NOT NULL,
  PRIMARY KEY (`idCompras`),
  UNIQUE KEY `idCompras_UNIQUE` (`idCompras`),
  KEY `fk_Compras_Empleados_idx` (`Empleados_idEmpleado`),
  KEY `fk_Compras_Clientes1_idx` (`Clientes_idClientes`),
  KEY `fk_Compras_Articulos1_idx` (`Articulos_idArticulos`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `compras`
--

INSERT INTO `compras` (`idCompras`, `Fecha_comp`, `Precio_comp`, `Empleados_idEmpleado`, `Clientes_idClientes`, `Articulos_idArticulos`) VALUES
(1, '2017-05-30', 2003, 1, 3, 7),
(2, '2017-06-06', 2000, 1, 12, 13);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empeños`
--

DROP TABLE IF EXISTS `empeños`;
CREATE TABLE IF NOT EXISTS `empeños` (
  `idEmpeños` int(11) NOT NULL AUTO_INCREMENT,
  `Fecha_ini_emp` date NOT NULL,
  `Fecha_fin_emp` date NOT NULL,
  `Prestamo` int(11) NOT NULL,
  `Renovacion` int(11) NOT NULL,
  `Finiquito` int(11) NOT NULL,
  `Estado` varchar(100) NOT NULL,
  `Empleados_idEmpleado` int(11) NOT NULL,
  `Clientes_idClientes` int(11) NOT NULL,
  `Articulos_idArticulos` int(11) NOT NULL,
  PRIMARY KEY (`idEmpeños`),
  UNIQUE KEY `idEmpeños_UNIQUE` (`idEmpeños`),
  KEY `fk_Empeños_Empleados1_idx` (`Empleados_idEmpleado`),
  KEY `fk_Empeños_Clientes1_idx` (`Clientes_idClientes`),
  KEY `fk_Empeños_Articulos1_idx` (`Articulos_idArticulos`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `empeños`
--

INSERT INTO `empeños` (`idEmpeños`, `Fecha_ini_emp`, `Fecha_fin_emp`, `Prestamo`, `Renovacion`, `Finiquito`, `Estado`, `Empleados_idEmpleado`, `Clientes_idClientes`, `Articulos_idArticulos`) VALUES
(1, '2018-04-30', '2018-04-30', 3000, 200, 3600, 'Retirado', 1, 1, 3),
(2, '2017-05-28', '2017-06-28', 3000, 0, 3000, 'Retirado', 1, 1, 4),
(3, '2017-05-29', '2017-06-29', 1500, 300, 1500, 'Retirado', 1, 2, 5),
(4, '2017-04-30', '2017-06-30', 4000, 800, 4000, 'Retirado', 1, 4, 8),
(5, '2017-04-30', '2017-05-30', 5000, 1000, 6000, 'Retirado', 1, 5, 9),
(6, '2017-04-30', '2017-06-30', 3500, 700, 3500, 'Retirado', 1, 6, 10),
(7, '2017-05-01', '2017-05-30', 2500, 0, 0, 'Retirado', 1, 9, 12);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

DROP TABLE IF EXISTS `empleados`;
CREATE TABLE IF NOT EXISTS `empleados` (
  `idEmpleado` int(11) NOT NULL AUTO_INCREMENT,
  `Nom_emp` varchar(100) NOT NULL,
  `contraseña` varchar(100) NOT NULL,
  `acceso` varchar(100) NOT NULL,
  PRIMARY KEY (`idEmpleado`),
  UNIQUE KEY `idClientes_UNIQUE` (`idEmpleado`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`idEmpleado`, `Nom_emp`, `contraseña`, `acceso`) VALUES
(1, 'saaiidmoran', '1749', 'Administrador'),
(2, 'Alfredo', '1234', 'Administrador'),
(3, 'Hannia', '12345', 'Administrador'),
(4, 'David', '12345', 'Empleado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

DROP TABLE IF EXISTS `ventas`;
CREATE TABLE IF NOT EXISTS `ventas` (
  `idVentas` int(11) NOT NULL AUTO_INCREMENT,
  `Fecha_venta` date NOT NULL,
  `Precio_venta` int(11) NOT NULL,
  `Empleados_idEmpleado` int(11) NOT NULL,
  `Clientes_idClientes` int(11) NOT NULL,
  `Articulos_idArticulos` int(11) NOT NULL,
  PRIMARY KEY (`idVentas`),
  UNIQUE KEY `idVentas_UNIQUE` (`idVentas`),
  KEY `fk_Ventas_Empleados1_idx` (`Empleados_idEmpleado`),
  KEY `fk_Ventas_Clientes1_idx` (`Clientes_idClientes`),
  KEY `fk_Ventas_Articulos1_idx` (`Articulos_idArticulos`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`idVentas`, `Fecha_venta`, `Precio_venta`, `Empleados_idEmpleado`, `Clientes_idClientes`, `Articulos_idArticulos`) VALUES
(1, '2017-05-30', 4001, 1, 3, 6),
(2, '2017-06-02', 5000, 1, 11, 11);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `apartados`
--
ALTER TABLE `apartados`
  ADD CONSTRAINT `fk_Apartados_Articulos1` FOREIGN KEY (`Articulos_idArticulos`) REFERENCES `articulos` (`idArticulos`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Apartados_Clientes1` FOREIGN KEY (`Clientes_idClientes`) REFERENCES `clientes` (`idClientes`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Apartados_Empleados1` FOREIGN KEY (`Empleados_idEmpleado`) REFERENCES `empleados` (`idEmpleado`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `compras`
--
ALTER TABLE `compras`
  ADD CONSTRAINT `fk_Compras_Articulos1` FOREIGN KEY (`Articulos_idArticulos`) REFERENCES `articulos` (`idArticulos`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Compras_Clientes1` FOREIGN KEY (`Clientes_idClientes`) REFERENCES `clientes` (`idClientes`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Compras_Empleados` FOREIGN KEY (`Empleados_idEmpleado`) REFERENCES `empleados` (`idEmpleado`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `empeños`
--
ALTER TABLE `empeños`
  ADD CONSTRAINT `fk_Empeños_Articulos1` FOREIGN KEY (`Articulos_idArticulos`) REFERENCES `articulos` (`idArticulos`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Empeños_Clientes1` FOREIGN KEY (`Clientes_idClientes`) REFERENCES `clientes` (`idClientes`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Empeños_Empleados1` FOREIGN KEY (`Empleados_idEmpleado`) REFERENCES `empleados` (`idEmpleado`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `fk_Ventas_Articulos1` FOREIGN KEY (`Articulos_idArticulos`) REFERENCES `articulos` (`idArticulos`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Ventas_Clientes1` FOREIGN KEY (`Clientes_idClientes`) REFERENCES `clientes` (`idClientes`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Ventas_Empleados1` FOREIGN KEY (`Empleados_idEmpleado`) REFERENCES `empleados` (`idEmpleado`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
