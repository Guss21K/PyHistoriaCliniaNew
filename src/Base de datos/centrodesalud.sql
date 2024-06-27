-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-06-2024 a las 07:44:17
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.1.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `centrodesalud`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `acompañante`
--

CREATE TABLE `acompañante` (
  `idacompañante` int(11) NOT NULL,
  `apellido_paterno` varchar(20) DEFAULT NULL,
  `apellido_materno` varchar(20) DEFAULT NULL,
  `nombres` varchar(30) DEFAULT NULL,
  `telefono` varchar(12) DEFAULT NULL,
  `dni` varchar(20) DEFAULT NULL,
  `direccion` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `centro_salud`
--

CREATE TABLE `centro_salud` (
  `idcentro_salud` int(11) NOT NULL,
  `nombre_centro_Salud` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consulta_medica`
--

CREATE TABLE `consulta_medica` (
  `idconsulta_medica` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `consultorio_Ext` varchar(30) DEFAULT NULL,
  `diagnostico_principal` varchar(30) DEFAULT NULL,
  `codigo_ce10` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contacto`
--

CREATE TABLE `contacto` (
  `idcontacto` int(11) NOT NULL,
  `telefono` varchar(12) DEFAULT NULL,
  `domicilio` varchar(40) DEFAULT NULL,
  `provincia` varchar(20) DEFAULT NULL,
  `distrito` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `credencial`
--

CREATE TABLE `credencial` (
  `id_credencial` int(11) NOT NULL,
  `usuario` varchar(15) DEFAULT NULL,
  `contraseña` varchar(20) DEFAULT NULL,
  `rol` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `educacion`
--

CREATE TABLE `educacion` (
  `ideducacion` int(11) NOT NULL,
  `grado_instruccion` varchar(20) DEFAULT NULL,
  `ocupacion` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historia_clinica`
--

CREATE TABLE `historia_clinica` (
  `idhistoria_clinica` int(11) NOT NULL,
  `num_historia` varchar(10) DEFAULT NULL,
  `fecha_apertura` date DEFAULT NULL,
  `consulta_medica_idconsulta_medica` int(11) NOT NULL,
  `centro_salud_idcentro_salud` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `identificacion`
--

CREATE TABLE `identificacion` (
  `ididentificacion` int(11) NOT NULL,
  `apellido_paterno` varchar(20) NOT NULL,
  `apellido_materno` varchar(20) NOT NULL,
  `nombres` varchar(30) NOT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `sexo` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `idpaciente` int(11) NOT NULL,
  `dni` varchar(20) NOT NULL,
  `grupo_sanguineo` varchar(10) DEFAULT NULL,
  `factor_rh` varchar(10) DEFAULT NULL,
  `religion` varchar(15) DEFAULT NULL,
  `estado_civil` varchar(10) DEFAULT NULL,
  `edad` varchar(3) DEFAULT NULL,
  `procendencia` varchar(30) DEFAULT NULL,
  `lugar_nacimiento` varchar(20) DEFAULT NULL,
  `contacto_idcontacto` int(11) NOT NULL,
  `educacion_ideducacion` int(11) NOT NULL,
  `seguro_idseguro` int(11) NOT NULL,
  `acompañante_idacompañante` int(11) NOT NULL,
  `identificacion_ididentificacion` int(11) NOT NULL,
  `historia_clinica_idhistoria_clinica` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `seguro`
--

CREATE TABLE `seguro` (
  `idseguro` int(11) NOT NULL,
  `tipo_seguro` varchar(20) DEFAULT NULL,
  `num_seguro` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `acompañante`
--
ALTER TABLE `acompañante`
  ADD PRIMARY KEY (`idacompañante`);

--
-- Indices de la tabla `centro_salud`
--
ALTER TABLE `centro_salud`
  ADD PRIMARY KEY (`idcentro_salud`);

--
-- Indices de la tabla `consulta_medica`
--
ALTER TABLE `consulta_medica`
  ADD PRIMARY KEY (`idconsulta_medica`);

--
-- Indices de la tabla `contacto`
--
ALTER TABLE `contacto`
  ADD PRIMARY KEY (`idcontacto`);

--
-- Indices de la tabla `credencial`
--
ALTER TABLE `credencial`
  ADD PRIMARY KEY (`id_credencial`);

--
-- Indices de la tabla `educacion`
--
ALTER TABLE `educacion`
  ADD PRIMARY KEY (`ideducacion`);

--
-- Indices de la tabla `historia_clinica`
--
ALTER TABLE `historia_clinica`
  ADD PRIMARY KEY (`idhistoria_clinica`),
  ADD KEY `fk_historia_clinica_consulta_medica1_idx` (`consulta_medica_idconsulta_medica`),
  ADD KEY `fk_historia_clinica_centro_salud1_idx` (`centro_salud_idcentro_salud`);

--
-- Indices de la tabla `identificacion`
--
ALTER TABLE `identificacion`
  ADD PRIMARY KEY (`ididentificacion`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`idpaciente`),
  ADD KEY `fk_paciente_contacto1_idx` (`contacto_idcontacto`),
  ADD KEY `fk_paciente_educacion1_idx` (`educacion_ideducacion`),
  ADD KEY `fk_paciente_seguro1_idx` (`seguro_idseguro`),
  ADD KEY `fk_paciente_acompañante1_idx` (`acompañante_idacompañante`),
  ADD KEY `fk_paciente_identificacion1_idx` (`identificacion_ididentificacion`),
  ADD KEY `fk_paciente_historia_clinica1_idx` (`historia_clinica_idhistoria_clinica`);

--
-- Indices de la tabla `seguro`
--
ALTER TABLE `seguro`
  ADD PRIMARY KEY (`idseguro`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `historia_clinica`
--
ALTER TABLE `historia_clinica`
  MODIFY `idhistoria_clinica` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `historia_clinica`
--
ALTER TABLE `historia_clinica`
  ADD CONSTRAINT `fk_historia_clinica_centro_salud1` FOREIGN KEY (`centro_salud_idcentro_salud`) REFERENCES `centro_salud` (`idcentro_salud`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_historia_clinica_consulta_medica1` FOREIGN KEY (`consulta_medica_idconsulta_medica`) REFERENCES `consulta_medica` (`idconsulta_medica`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD CONSTRAINT `fk_paciente_acompañante1` FOREIGN KEY (`acompañante_idacompañante`) REFERENCES `acompañante` (`idacompañante`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_paciente_contacto1` FOREIGN KEY (`contacto_idcontacto`) REFERENCES `contacto` (`idcontacto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_paciente_educacion1` FOREIGN KEY (`educacion_ideducacion`) REFERENCES `educacion` (`ideducacion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_paciente_historia_clinica1` FOREIGN KEY (`historia_clinica_idhistoria_clinica`) REFERENCES `historia_clinica` (`idhistoria_clinica`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_paciente_identificacion1` FOREIGN KEY (`identificacion_ididentificacion`) REFERENCES `identificacion` (`ididentificacion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_paciente_seguro1` FOREIGN KEY (`seguro_idseguro`) REFERENCES `seguro` (`idseguro`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
