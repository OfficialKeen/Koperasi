-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 18, 2015 at 08:15 AM
-- Server version: 5.6.26
-- PHP Version: 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `koperasi`
--

-- --------------------------------------------------------

--
-- Table structure for table `t_anggota`
--

CREATE TABLE IF NOT EXISTS `t_anggota` (
  `No_anggota` varchar(11) NOT NULL,
  `Nama` varchar(30) NOT NULL,
  `Alamat` varchar(50) NOT NULL,
  `Tmp_lahir` varchar(20) NOT NULL,
  `Tgl_lahir` date NOT NULL,
  `Sim_pokok` varchar(20) NOT NULL,
  `Adm` varchar(20) NOT NULL,
  `No_telp` varchar(20) NOT NULL,
  `Pekerjaan` varchar(30) NOT NULL,
  `Tgl_masuk` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_anggota`
--

INSERT INTO `t_anggota` (`No_anggota`, `Nama`, `Alamat`, `Tmp_lahir`, `Tgl_lahir`, `Sim_pokok`, `Adm`, `No_telp`, `Pekerjaan`, `Tgl_masuk`) VALUES
('AG-000001', 'Sri Harini', 'Sribhawono', 'Lampung', '2015-11-15', '600000', '100000', '123123123', 'PNS', '2015-11-15'),
('AG-000002', 'Keen Susilo Aji', 'Bandar Lampung', 'Lamtim', '2015-11-18', '600000', '100000', '12312312', 'PNS', '2015-11-29'),
('AG-000003', 'Dika', 'Lampung', 'Serang', '2015-11-15', '600000', '100000', '123123123', 'PNS', '2015-11-15'),
('AG-000004', 'Roni', 'Jepang', 'Tokyo', '2015-11-16', '600000', '100000', '123123123123', 'PNS', '2015-11-16'),
('AG-000005', 'Kira', 'Jakarta', 'Blok M', '2015-11-17', '600000', '100000', '234234', 'Tani', '2015-11-17'),
('AG-000006', 'Fikry Aida Fitria', 'Pringsewu', 'Pringsewu', '2015-11-18', '600000', '100000', '234234234', 'Pedagang', '2015-11-18'),
('AG-000007', 'Eka Elistia', 'Metro', 'Metro', '2015-11-19', '600000', '100000', '234234234', 'Wiraswasta', '2015-11-19'),
('AG-000008', 'Leo Aprilio', 'Bandung	', 'Bandung', '2015-11-20', '600000', '100000', '4534534534', 'Wiraswasta', '2015-11-20'),
('AG-000009', 'Sita Arista', 'Medan', 'Medan', '2015-11-21', '600000', '100000', '23423423423', 'Wiraswasta', '2015-11-21'),
('AG-000010', 'Rian Hidayat', 'Unit2', 'Rawajitu', '2015-11-22', '600000', '100000', '234234', 'Pedagang', '2015-11-22'),
('AG-000011', 'Rere', 'Lamtim', 'lamtim', '2015-11-07', '600000', '100000', '96967687', 'Tani', '2015-11-19');

-- --------------------------------------------------------

--
-- Table structure for table `t_angsuran`
--

CREATE TABLE IF NOT EXISTS `t_angsuran` (
  `Kd_Angsuran` varchar(20) NOT NULL,
  `Tgl_pinjam` date NOT NULL,
  `Tgl_Angsur` date NOT NULL,
  `kd_pinjaman` varchar(20) NOT NULL,
  `No_anggota` varchar(20) NOT NULL,
  `Nama` varchar(30) NOT NULL,
  `Jml_pinjam` varchar(30) NOT NULL,
  `Lama` varchar(5) NOT NULL,
  `Tot_pinjaman` varchar(20) NOT NULL,
  `Angsuran` double NOT NULL,
  `Bulan_ke` varchar(3) NOT NULL,
  `Tipe` varchar(30) NOT NULL,
  `Angsuran_ke` varchar(3) NOT NULL,
  `Sisa` varchar(20) NOT NULL,
  `Pokok` varchar(20) NOT NULL,
  `Bunga` varchar(20) NOT NULL,
  `Total_Angsur` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_angsuran`
--

INSERT INTO `t_angsuran` (`Kd_Angsuran`, `Tgl_pinjam`, `Tgl_Angsur`, `kd_pinjaman`, `No_anggota`, `Nama`, `Jml_pinjam`, `Lama`, `Tot_pinjaman`, `Angsuran`, `Bulan_ke`, `Tipe`, `Angsuran_ke`, `Sisa`, `Pokok`, `Bunga`, `Total_Angsur`) VALUES
('KP-000001', '2015-11-10', '2015-12-10', 'PJ-000001', 'AG-000001', 'Sri Harini', '5000000', '10', '5100000', 600000, '1', 'Pokok', '1', '4500000', '500,000', '100,000', '600,000'),
('KP-000002', '2015-11-10', '2016-01-17', 'PJ-000001', 'AG-000001', 'Sri Harini', '5000000', '10', '5100000', 600000, '2', 'Bunga', '2', '4500000', '0', '125,000', '125,000'),
('KP-000003', '2015-11-10', '2016-02-17', 'PJ-000001', 'AG-000001', 'Sri Harini', '5000000', '10', '5100000', 600000, '3', 'Pokok', '2', '4000000', '500,000', '100,000', '600,000');

-- --------------------------------------------------------

--
-- Table structure for table `t_jabatan`
--

CREATE TABLE IF NOT EXISTS `t_jabatan` (
  `No_Jabatan` varchar(5) NOT NULL,
  `Jabatan` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_jabatan`
--

INSERT INTO `t_jabatan` (`No_Jabatan`, `Jabatan`) VALUES
('1', 'Tani'),
('2', 'PNS'),
('3', 'Pedagang'),
('4', 'Karyawan'),
('5', 'Wirausaha');

-- --------------------------------------------------------

--
-- Table structure for table `t_karyawan`
--

CREATE TABLE IF NOT EXISTS `t_karyawan` (
  `No_Kar` varchar(5) NOT NULL,
  `Nama` varchar(20) NOT NULL,
  `Alamat` varchar(30) NOT NULL,
  `No_hp` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `t_pekerjaan`
--

CREATE TABLE IF NOT EXISTS `t_pekerjaan` (
  `No_Pek` varchar(5) NOT NULL,
  `Pekerjaan` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_pekerjaan`
--

INSERT INTO `t_pekerjaan` (`No_Pek`, `Pekerjaan`) VALUES
('1', 'PNS'),
('2', 'Tani'),
('3', 'Pedagang'),
('4', 'wiraswasta');

-- --------------------------------------------------------

--
-- Table structure for table `t_pengurus`
--

CREATE TABLE IF NOT EXISTS `t_pengurus` (
  `No_Peng` varchar(5) NOT NULL,
  `Ketua` varchar(30) NOT NULL,
  `Wakil` varchar(30) NOT NULL,
  `Sekretaris` varchar(30) NOT NULL,
  `Bendahara` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_pengurus`
--

INSERT INTO `t_pengurus` (`No_Peng`, `Ketua`, `Wakil`, `Sekretaris`, `Bendahara`) VALUES
('1', 'SRI HARINI,S.P.d', '-', 'EKO WANI SEFTININGSIH', 'KUS SUHARWIYATI,M.Pd.I');

-- --------------------------------------------------------

--
-- Table structure for table `t_pinjam`
--

CREATE TABLE IF NOT EXISTS `t_pinjam` (
  `kd_pinjaman` varchar(10) NOT NULL,
  `No_anggota` varchar(20) NOT NULL,
  `Nama` varchar(20) NOT NULL,
  `Jml_pinjam` varchar(20) NOT NULL,
  `Tgl_pinjam` date NOT NULL,
  `Tgl_tempo` date NOT NULL,
  `Lama` varchar(5) NOT NULL,
  `Bunga` varchar(5) NOT NULL,
  `Jml_bunga` int(20) NOT NULL,
  `Tot_pinjaman` varchar(20) NOT NULL,
  `Non_bunga` varchar(20) NOT NULL,
  `Angsuran` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_pinjam`
--

INSERT INTO `t_pinjam` (`kd_pinjaman`, `No_anggota`, `Nama`, `Jml_pinjam`, `Tgl_pinjam`, `Tgl_tempo`, `Lama`, `Bunga`, `Jml_bunga`, `Tot_pinjaman`, `Non_bunga`, `Angsuran`) VALUES
('PJ-000001', 'AG-000001', 'Sri Harini', '5000000', '2015-11-10', '2015-11-10', '10', '2', 100000, '5100000', '500000', '600000');

-- --------------------------------------------------------

--
-- Table structure for table `t_shu`
--

CREATE TABLE IF NOT EXISTS `t_shu` (
  `Periode1` date NOT NULL,
  `Periode2` date NOT NULL,
  `Data` varchar(5) NOT NULL,
  `TotalSHU` varchar(20) NOT NULL,
  `Pengurus` varchar(20) NOT NULL,
  `Pengurus1` varchar(20) NOT NULL,
  `Cadangan` varchar(20) NOT NULL,
  `Cadangan1` varchar(20) NOT NULL,
  `Sosial` varchar(20) NOT NULL,
  `Sosial1` varchar(20) NOT NULL,
  `Doorprize` varchar(20) NOT NULL,
  `Doorprize1` varchar(20) NOT NULL,
  `Anggota` varchar(20) NOT NULL,
  `Anggota1` varchar(20) NOT NULL,
  `Sembako` varchar(20) NOT NULL,
  `Sembako1` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_shu`
--

INSERT INTO `t_shu` (`Periode1`, `Periode2`, `Data`, `TotalSHU`, `Pengurus`, `Pengurus1`, `Cadangan`, `Cadangan1`, `Sosial`, `Sosial1`, `Doorprize`, `Doorprize1`, `Anggota`, `Anggota1`, `Sembako`, `Sembako1`) VALUES
('2015-11-01', '2015-11-29', '11', '7,000,000', '10', '700,000', '15', '1,050,000', '5', '350,000', '5', '350,000', '50', '3,500,000', '15', '1,050,000');

-- --------------------------------------------------------

--
-- Table structure for table `t_simpan`
--

CREATE TABLE IF NOT EXISTS `t_simpan` (
  `kd_simpanan` varchar(10) NOT NULL,
  `No_anggota` varchar(20) NOT NULL,
  `Nama` varchar(30) NOT NULL,
  `Tgl_simpanan` date NOT NULL,
  `THR` int(20) NOT NULL,
  `Saldo` varchar(20) NOT NULL,
  `Tot_saldo` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_simpan`
--

INSERT INTO `t_simpan` (`kd_simpanan`, `No_anggota`, `Nama`, `Tgl_simpanan`, `THR`, `Saldo`, `Tot_saldo`) VALUES
('SM-000001', 'AG-000001', 'Sri Harini', '2015-11-10', 100000, '0', 'null'),
('SM-000002', 'AG-000001', 'Sri Harini', '2015-12-10', 200000, '100000', '100000');

-- --------------------------------------------------------

--
-- Table structure for table `t_user`
--

CREATE TABLE IF NOT EXISTS `t_user` (
  `user` varchar(20) NOT NULL,
  `pass` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_user`
--

INSERT INTO `t_user` (`user`, `pass`) VALUES
('Admin', '123'),
('Koperasi', '321'),
('Riko', '321');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `t_anggota`
--
ALTER TABLE `t_anggota`
  ADD PRIMARY KEY (`No_anggota`);

--
-- Indexes for table `t_angsuran`
--
ALTER TABLE `t_angsuran`
  ADD PRIMARY KEY (`Kd_Angsuran`);

--
-- Indexes for table `t_jabatan`
--
ALTER TABLE `t_jabatan`
  ADD PRIMARY KEY (`No_Jabatan`);

--
-- Indexes for table `t_karyawan`
--
ALTER TABLE `t_karyawan`
  ADD PRIMARY KEY (`No_Kar`);

--
-- Indexes for table `t_pekerjaan`
--
ALTER TABLE `t_pekerjaan`
  ADD PRIMARY KEY (`No_Pek`);

--
-- Indexes for table `t_pengurus`
--
ALTER TABLE `t_pengurus`
  ADD PRIMARY KEY (`No_Peng`);

--
-- Indexes for table `t_pinjam`
--
ALTER TABLE `t_pinjam`
  ADD PRIMARY KEY (`kd_pinjaman`);

--
-- Indexes for table `t_simpan`
--
ALTER TABLE `t_simpan`
  ADD PRIMARY KEY (`kd_simpanan`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
