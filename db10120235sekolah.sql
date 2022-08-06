-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 06, 2022 at 08:41 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.0.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db10120235sekolah`
--

-- --------------------------------------------------------

--
-- Table structure for table `guru`
--

CREATE TABLE `guru` (
  `kd_guru` varchar(20) NOT NULL,
  `nama_guru` varchar(50) NOT NULL,
  `alamat` text NOT NULL,
  `no_tlp` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `guru`
--

INSERT INTO `guru` (`kd_guru`, `nama_guru`, `alamat`, `no_tlp`) VALUES
('KDG_001', 'Nita Moha, S.Pd', 'Bandung', '081321123001'),
('KDG_002', 'Acep Surecep, S.Pd', 'Bandung', '081321123002'),
('KDG_003', 'Anang Dinata, S.Pd', 'Bandung', '081321123003'),
('KDG_004', 'Bagus Sudrajat, S.Pd', 'Cimahi', '081321123004'),
('KDG_005', 'Bintang Trita, S.Pd', 'Bandung', '081321123005'),
('KDG_006', 'Cagur Roso, S.Pd', 'Cimahi', '081321123006'),
('KDG_007', 'Citra Kasih, S.Pd', 'Bandung', '081321123007'),
('KDG_008', 'Deden Dirgantara, S.Pd', 'Cimahi', '081321123008'),
('KDG_009', 'Dina Sukmawati, S.Pd', 'Bandung', '081321123009'),
('KDG_010', 'Endang Turjono, S.Pd', 'Cimahi', '081321123010'),
('KDG_011', 'Eka Cantika, S.Pd', 'Bandung', '081321123011'),
('KDG_012', 'Fracuis Sagala, S.Pd', 'Cimahi', '081321123012'),
('KDG_013', 'Fina Nurhayati, S.Pd', 'Bandung', '081321123013'),
('KDG_014', 'Gugun Gudarma, S.Pd', 'Cimahi', '081321123014'),
('KDG_015', 'Gita Gustiana, S.Pd', 'Bandung', '081321123015'),
('KDG_016', 'Haryono Santoso, S.Pd', 'Cimahi', '081321123016'),
('KDG_017', 'Husna Kharomah, S.Pd', 'Bandung', '081321123017'),
('KDG_018', 'Ito Gemilang, S.Pd', 'Cimahi', '081321123018'),
('KDG_019', 'Ira Restu Kartika, S.Pd', 'Bandung', '081321123019'),
('KDG_020', 'Jana Hidayat, S.Pd', 'Cimahi', '081321123020'),
('KDG_021', 'Jesica Indah, S.Pd', 'Bandung', '081321123021'),
('KDG_022', 'Khoiril Imron, S.Pd', 'Cimahi', '081321123022'),
('KDG_023', 'Kartika Sari, S.Pd', 'Bandung', '081321123023'),
('KDG_024', 'Lintang Rohman, S.Pd', 'Cimahi', '081321123024'),
('KDG_025', 'Lilis Lestari, S.Pd', 'Bandung', '081321123025');

-- --------------------------------------------------------

--
-- Table structure for table `jadwal`
--

CREATE TABLE `jadwal` (
  `kd_mapel` varchar(20) NOT NULL,
  `kd_guru` varchar(20) NOT NULL,
  `nama_mapel` varchar(30) NOT NULL,
  `hari` varchar(15) NOT NULL,
  `jam` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `jadwal`
--

INSERT INTO `jadwal` (`kd_mapel`, `kd_guru`, `nama_mapel`, `hari`, `jam`) VALUES
('KDM_001', 'KDG_001', 'PPKN', 'Senin', '07:00:00'),
('KDM_002', 'KDG_002', 'PAI', 'Senin', '09:00:00'),
('KDM_003', 'KDG_003', 'Bahasa Indonesia', 'Senin', '11:00:00'),
('KDM_004', 'KDG_004', 'Matematika Wajib', 'Senin', '13:00:00'),
('KDM_005', 'KDG_005', 'Matematika Minat', 'Senin', '15:00:00'),
('KDM_006', 'KDG_006', 'IPA', 'Selasa', '07:00:00'),
('KDM_007', 'KDG_007', 'IPS', 'Selasa', '09:00:00'),
('KDM_008', 'KDG_008', 'Prakarya', 'Selasa', '11:00:00'),
('KDM_009', 'KDG_009', 'TIK', 'Selasa', '13:00:00'),
('KDM_010', 'KDG_010', 'Fisika', 'Rabu', '07:00:00'),
('KDM_011', 'KDG_011', 'Kimia', 'Rabu', '09:00:00'),
('KDM_012', 'KDG_012', 'Biologi', 'Rabu', '11:00:00'),
('KDM_013', 'KDG_013', 'Geografi', 'Rabu', '13:00:00'),
('KDM_014', 'KDG_014', 'Bahasa Sunda', 'Kamis', '07:00:00'),
('KDM_015', 'KDG_015', 'Bahasa Jepang ', 'Kamis', '09:00:00'),
('KDM_016', 'KDG_016', 'Bahasa Inggris', 'Kamis', '11:00:00'),
('KDM_017', 'KDG_017', 'Bahasa Jerman', 'Kamis', '13:00:00'),
('KDM_018', 'KDG_018', 'Bahasa Rusia ', 'Jum\'at', '07:00:00'),
('KDM_019', 'KDG_019', 'Bahasa Prancis', 'Jum\'at', '09:00:00'),
('KDM_020', 'KDG_020', 'Bahasa Jepang', 'Jum\'at', '11:00:00'),
('KDM_021', 'KDG_021', 'Bahasa China', 'Jum\'at', '13:00:00'),
('KDM_022', 'KDG_022', 'Basis Data', 'Sabtu', '07:00:00'),
('KDM_023', 'KDG_023', 'Program Visual', 'Sabtu', '09:00:00'),
('KDM_024', 'KDG_024', 'Sistem Operasi', 'Sabtu', '11:00:00'),
('KDM_025', 'KDG_025', 'Rekayasa Perangkat Lunak', 'Sabtu', '13:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `mapel`
--

CREATE TABLE `mapel` (
  `kd_mapel` varchar(20) NOT NULL,
  `nama_mapel` varchar(30) NOT NULL,
  `kd_guru` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mapel`
--

INSERT INTO `mapel` (`kd_mapel`, `nama_mapel`, `kd_guru`) VALUES
('KDM_001', 'PPKN', 'KDG_001'),
('KDM_002', 'PAI', 'KDG_002'),
('KDM_003', 'Bahasa Indonesia', 'KDG_003'),
('KDM_004', 'Matematika Wajib', 'KDG_004'),
('KDM_005', 'Matematika Minat', 'KDG_005'),
('KDM_006', 'IPA', 'KDG_006'),
('KDM_007', 'IPS', 'KDG_007'),
('KDM_008', 'Prakarya', 'KDG_008'),
('KDM_009', 'TIK', 'KDG_009'),
('KDM_010', 'Fisika', 'KDG_010'),
('KDM_011', 'Kimia', 'KDG_011'),
('KDM_012', 'Biologi', 'KDG_012'),
('KDM_013', 'Geografi', 'KDG_013'),
('KDM_014', 'Bahasa Sunda', 'KDG_014'),
('KDM_015', 'Bahasa Arab', 'KDG_015'),
('KDM_016', 'Bahasa Inggris', 'KDG_016'),
('KDM_017', 'Bahasa Jerman', 'KDG_017'),
('KDM_018', 'Bahasa Rusia', 'KDG_018'),
('KDM_019', 'Bahasa Prancis', 'KDG_019'),
('KDM_020', 'Bahasa Jepang', 'KDG_020'),
('KDM_021', 'Bahasa China', 'KDG_021'),
('KDM_022', 'Basis Data', 'KDG_022'),
('KDM_023', 'Program Visual', 'KDG_023'),
('KDM_024', 'Sistem Operasi', 'KDG_024'),
('KDM_025', 'Rekayasa Perangkat Lunak', 'KDG_025');

-- --------------------------------------------------------

--
-- Table structure for table `murid`
--

CREATE TABLE `murid` (
  `nis` char(20) NOT NULL,
  `nama_murid` varchar(50) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `murid`
--

INSERT INTO `murid` (`nis`, `nama_murid`, `tgl_lahir`, `alamat`) VALUES
('10120201', 'Abyan Altoriandi Yazid', '2001-07-01', 'Bandung'),
('10120202', 'Arif Rachmat Darmawan', '2002-07-02', 'Bandung'),
('10120203', 'Adi Tata Koswara', '2001-06-03', 'Cimahi'),
('10120204', 'Ardian Julianto Sagala', '2002-05-04', 'Cimahi'),
('10120205', 'Agustiar Fajar Abdillah', '2002-11-05', 'Cianjur'),
('10120206', 'Aditya Sukmadinata', '2001-10-01', 'Bandung'),
('10120207', 'Arby Febrian Saputro', '2001-07-30', 'Jakarta'),
('10120208', 'Alya Salsabila Wolio', '2001-12-02', 'Bandung'),
('10120209', 'Bramantyo Budi Jatmiko', '2002-05-04', 'Cimahi'),
('10120210', 'Daffa Albari', '2002-04-06', 'Semarang'),
('10120211', 'Dzaky Abby Fauzan Aziz', '2001-07-22', 'Bandung'),
('10120212', 'Fajar Juniansyah Sadikin', '2001-09-03', 'Bandung'),
('10120213', 'Faiz Amri Rahman', '2001-07-02', 'Jakarta'),
('10120214', 'Gitri Durrotuy Yatimah', '2001-01-07', 'Ciamis'),
('10120215', 'Hendra Gunawan', '2001-10-15', 'Cimahi'),
('10120216', 'Hanung Dwi Prasetyo', '2002-07-27', 'Batujajar'),
('10120217', 'Hafiz Herla Firmasyah', '2002-06-29', 'Bandung'),
('10120218', 'Muhammad Ichsan Kamil', '2002-04-06', 'Bogor'),
('10120219', 'Martinus Celvyn Situmorang', '2001-10-01', 'Bandung'),
('10120220', 'Muhammad Hasbi Ar-Rasid', '2001-02-16', 'Bandung'),
('10120221', 'Muhammad Hilman Rahmat', '2001-09-03', 'Bandung'),
('10120222', 'Muhammad Rizki Ramdani', '2001-08-20', 'Bandung'),
('10120223', 'Mohammad Mausa Gani', '2002-09-03', 'Bandung'),
('10120224', 'Muhammad Iqbal Lutfi Hanafiyah', '2001-04-05', 'Bandung'),
('10120225', 'Muhammad Naufal Malikulmulki', '2001-08-27', 'Cimahi');

-- --------------------------------------------------------

--
-- Table structure for table `rapot`
--

CREATE TABLE `rapot` (
  `nis` char(20) NOT NULL,
  `kd_mapel` varchar(20) NOT NULL,
  `tahun_akademik` year(4) NOT NULL,
  `semester` char(2) NOT NULL,
  `nilai` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `rapot`
--

INSERT INTO `rapot` (`nis`, `kd_mapel`, `tahun_akademik`, `semester`, `nilai`) VALUES
('10120201', 'KDM_001', 2020, '1', 80),
('10120201', 'KDM_002', 2020, '1', 80),
('10120201', 'KDM_003', 2020, '1', 80),
('10120201', 'KDM_004', 2020, '1', 85),
('10120201', 'KDM_005', 2020, '1', 90),
('10120201', 'KDM_006', 2020, '1', 75),
('10120201', 'KDM_007', 2020, '1', 80),
('10120201', 'KDM_008', 2020, '1', 85),
('10120201', 'KDM_009', 2020, '1', 90),
('10120201', 'KDM_010', 2020, '1', 70),
('10120201', 'KDM_011', 2020, '1', 90),
('10120201', 'KDM_012', 2020, '1', 85),
('10120201', 'KDM_013', 2020, '1', 90),
('10120201', 'KDM_014', 2020, '1', 85),
('10120201', 'KDM_015', 2020, '1', 85),
('10120201', 'KDM_016', 2020, '1', 80),
('10120201', 'KDM_017', 2020, '1', 80),
('10120201', 'KDM_018', 2020, '1', 85),
('10120201', 'KDM_019', 2020, '1', 80),
('10120201', 'KDM_020', 2020, '1', 90),
('10120201', 'KDM_021', 2020, '1', 80),
('10120201', 'KDM_022', 2020, '1', 85),
('10120201', 'KDM_023', 2020, '1', 80),
('10120201', 'KDM_024', 2020, '1', 80),
('10120201', 'KDM_025', 2020, '1', 80);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `guru`
--
ALTER TABLE `guru`
  ADD PRIMARY KEY (`kd_guru`);

--
-- Indexes for table `jadwal`
--
ALTER TABLE `jadwal`
  ADD KEY `kd_guru` (`kd_guru`),
  ADD KEY `kd_mapel` (`kd_mapel`);

--
-- Indexes for table `mapel`
--
ALTER TABLE `mapel`
  ADD PRIMARY KEY (`kd_mapel`),
  ADD KEY `kd_guru` (`kd_guru`);

--
-- Indexes for table `murid`
--
ALTER TABLE `murid`
  ADD PRIMARY KEY (`nis`);

--
-- Indexes for table `rapot`
--
ALTER TABLE `rapot`
  ADD KEY `nis` (`nis`),
  ADD KEY `kd_mapel` (`kd_mapel`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `jadwal`
--
ALTER TABLE `jadwal`
  ADD CONSTRAINT `jadwal_ibfk_1` FOREIGN KEY (`kd_guru`) REFERENCES `guru` (`kd_guru`),
  ADD CONSTRAINT `jadwal_ibfk_2` FOREIGN KEY (`kd_mapel`) REFERENCES `mapel` (`kd_mapel`);

--
-- Constraints for table `mapel`
--
ALTER TABLE `mapel`
  ADD CONSTRAINT `mapel_ibfk_1` FOREIGN KEY (`kd_guru`) REFERENCES `guru` (`kd_guru`);

--
-- Constraints for table `rapot`
--
ALTER TABLE `rapot`
  ADD CONSTRAINT `rapot_ibfk_1` FOREIGN KEY (`nis`) REFERENCES `murid` (`nis`),
  ADD CONSTRAINT `rapot_ibfk_2` FOREIGN KEY (`kd_mapel`) REFERENCES `mapel` (`kd_mapel`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
