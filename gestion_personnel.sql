-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  jeu. 24 déc. 2020 à 22:03
-- Version du serveur :  10.4.10-MariaDB
-- Version de PHP :  7.4.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `gestion_personnel`
--

-- --------------------------------------------------------

--
-- Structure de la table `manutentionnaire`
--

DROP TABLE IF EXISTS `manutentionnaire`;
CREATE TABLE IF NOT EXISTS `manutentionnaire` (
  `id` int(11) NOT NULL,
  `lastName` varchar(12) NOT NULL,
  `firstName` varchar(12) NOT NULL,
  `age` int(11) NOT NULL,
  `dateEntreeService` varchar(12) NOT NULL,
  `nbrHeurs` int(11) NOT NULL,
  `salaire_Manut` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `manutentionnaire`
--

INSERT INTO `manutentionnaire` (`id`, `lastName`, `firstName`, `age`, `dateEntreeService`, `nbrHeurs`, `salaire_Manut`) VALUES
(1, 'ahmed', 'said', 33, '20/02/2009', 120, 6000);

-- --------------------------------------------------------

--
-- Structure de la table `manutentionnaire_arisque`
--

DROP TABLE IF EXISTS `manutentionnaire_arisque`;
CREATE TABLE IF NOT EXISTS `manutentionnaire_arisque` (
  `id` int(11) NOT NULL,
  `lastName` varchar(12) NOT NULL,
  `firstName` varchar(12) NOT NULL,
  `age` int(11) NOT NULL,
  `dateEntreeService` varchar(12) NOT NULL,
  `nbrHeurs` int(11) NOT NULL,
  `salaire_Manut_arisque` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `manutentionnaire_arisque`
--

INSERT INTO `manutentionnaire_arisque` (`id`, `lastName`, `firstName`, `age`, `dateEntreeService`, `nbrHeurs`, `salaire_Manut_arisque`) VALUES
(1, 'ZZZZZZ', 'ZZZ', 33, '20/12/2018', 120, 6200);

-- --------------------------------------------------------

--
-- Structure de la table `producteur`
--

DROP TABLE IF EXISTS `producteur`;
CREATE TABLE IF NOT EXISTS `producteur` (
  `id` int(11) NOT NULL,
  `lastName` varchar(12) NOT NULL,
  `firstName` varchar(12) NOT NULL,
  `age` int(11) NOT NULL,
  `dateEntreeService` varchar(12) NOT NULL,
  `nbrUnites` int(11) NOT NULL,
  `salaire_prod` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `producteur`
--

INSERT INTO `producteur` (`id`, `lastName`, `firstName`, `age`, `dateEntreeService`, `nbrUnites`, `salaire_prod`) VALUES
(1, 'Aboulfateh', 'Lboooot', 30, '20/10/2019', 300, 1500),
(2222, 'AHHHHA', 'SDS', 23, '30/30/2019', 450, 1110);

-- --------------------------------------------------------

--
-- Structure de la table `producteur_arisque`
--

DROP TABLE IF EXISTS `producteur_arisque`;
CREATE TABLE IF NOT EXISTS `producteur_arisque` (
  `id` int(11) NOT NULL,
  `lastName` varchar(12) NOT NULL,
  `firstName` varchar(12) NOT NULL,
  `age` int(11) NOT NULL,
  `dateEntreeService` varchar(12) NOT NULL,
  `nbrUnites` int(11) NOT NULL,
  `salaire_prod_arisque` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `producteur_arisque`
--

INSERT INTO `producteur_arisque` (`id`, `lastName`, `firstName`, `age`, `dateEntreeService`, `nbrUnites`, `salaire_prod_arisque`) VALUES
(1, 'ABOULFATEH', 'ZAKARIA', 22, '20/20/2000', 400, 2200);

-- --------------------------------------------------------

--
-- Structure de la table `representant`
--

DROP TABLE IF EXISTS `representant`;
CREATE TABLE IF NOT EXISTS `representant` (
  `id` int(11) NOT NULL,
  `lastName` varchar(12) NOT NULL,
  `firstName` varchar(12) NOT NULL,
  `age` int(11) NOT NULL,
  `dateEntreeService` varchar(12) NOT NULL,
  `chiffreAffaire` double NOT NULL,
  `salaire_rep` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `representant`
--

INSERT INTO `representant` (`id`, `lastName`, `firstName`, `age`, `dateEntreeService`, `chiffreAffaire`, `salaire_rep`) VALUES
(45, 'ZAAA', 'SSSS', 23, '20/09/2009', 2330, 2966);

-- --------------------------------------------------------

--
-- Structure de la table `vendeur`
--

DROP TABLE IF EXISTS `vendeur`;
CREATE TABLE IF NOT EXISTS `vendeur` (
  `id` int(11) NOT NULL,
  `lastName` varchar(12) NOT NULL,
  `firstName` varchar(12) NOT NULL,
  `age` int(11) NOT NULL,
  `dateEntreeService` varchar(12) NOT NULL,
  `chiffreAffaire` double NOT NULL,
  `salaire_vendeur` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `vendeur`
--

INSERT INTO `vendeur` (`id`, `lastName`, `firstName`, `age`, `dateEntreeService`, `chiffreAffaire`, `salaire_vendeur`) VALUES
(111, 'ZZZZ', 'ZZZ', 22, '2000/20/20', 2090, 1918);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
