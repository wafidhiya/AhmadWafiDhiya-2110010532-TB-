-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 06, 2024 at 06:06 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ppdb-db`
--

-- --------------------------------------------------------

--
-- Table structure for table `formortu`
--

CREATE TABLE `formortu` (
  `NIS` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `ayah` varchar(10) NOT NULL,
  `kerjaayah` varchar(100) NOT NULL,
  `gajiayah` int(255) NOT NULL,
  `ibu` varchar(50) NOT NULL,
  `kerjaibu` varchar(50) NOT NULL,
  `gajiibu` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `formortu`
--

INSERT INTO `formortu` (`NIS`, `nama`, `ayah`, `kerjaayah`, `gajiayah`, `ibu`, `kerjaibu`, `gajiibu`) VALUES
(141414, 'Haikal', 'Ihsan', 'Guru', 5000000, 'Hafsah', 'PNS', 5000000);

-- --------------------------------------------------------

--
-- Table structure for table `formsiswa`
--

CREATE TABLE `formsiswa` (
  `NIS` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `kelamin` varchar(11) NOT NULL,
  `tempat` varchar(30) NOT NULL,
  `tanggal` int(10) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `asal` varchar(50) NOT NULL,
  `telepon` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `formsiswa`
--

INSERT INTO `formsiswa` (`NIS`, `nama`, `kelamin`, `tempat`, `tanggal`, `alamat`, `asal`, `telepon`) VALUES
(131313, 'wafi', 'LAKI-LAKI', 'Martapura', 7062003, 'Martapura', 'SMP1 Martapra', 98766765);

-- --------------------------------------------------------

--
-- Table structure for table `formtransaksi`
--

CREATE TABLE `formtransaksi` (
  `NIS` int(11) NOT NULL,
  `NT` int(100) NOT NULL,
  `NAMA` varchar(100) NOT NULL,
  `PEMBAYARAN` varchar(30) NOT NULL,
  `BIAYA` int(255) NOT NULL,
  `TINGKAT` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `formtransaksi`
--

INSERT INTO `formtransaksi` (`NIS`, `NT`, `NAMA`, `PEMBAYARAN`, `BIAYA`, `TINGKAT`) VALUES
(131313, 5, 'wafi', 'TRANSFER', 10000000, 'SMA'),
(141414, 4, 'Haikal', 'TRANSFER', 7000000, 'SMP');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `formortu`
--
ALTER TABLE `formortu`
  ADD PRIMARY KEY (`NIS`);

--
-- Indexes for table `formsiswa`
--
ALTER TABLE `formsiswa`
  ADD PRIMARY KEY (`NIS`);

--
-- Indexes for table `formtransaksi`
--
ALTER TABLE `formtransaksi`
  ADD PRIMARY KEY (`NIS`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `formsiswa`
--
ALTER TABLE `formsiswa`
  MODIFY `NIS` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23123214;

--
-- AUTO_INCREMENT for table `formtransaksi`
--
ALTER TABLE `formtransaksi`
  MODIFY `NIS` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=141415;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
