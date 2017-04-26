-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 12 Mar 2017 pada 04.20
-- Versi Server: 10.1.13-MariaDB
-- PHP Version: 7.0.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_spkk`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_login`
--

CREATE TABLE `tb_login` (
  `id_login` varchar(10) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `level` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_login`
--

INSERT INTO `tb_login` (`id_login`, `username`, `password`, `level`) VALUES
('rt-01', 'okky', 'c821adbe2db2d35a30551480105cb919', 'rt'),
('rt-02', 'syamsi', '50dd1619a3bb019e012b31c45dc365df', 'rt'),
('rt-03', 'admin', '21232f297a57a5a743894a0e4a801fc3', 'rt');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_pemohon`
--

CREATE TABLE `tb_pemohon` (
  `no` int(11) NOT NULL,
  `id` varchar(6) NOT NULL,
  `nama_pemohon` varchar(40) NOT NULL,
  `pekerjaan` varchar(40) NOT NULL,
  `kewarganegaraan` char(3) NOT NULL,
  `dob` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `agama` varchar(10) NOT NULL,
  `id_login` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_pemohon`
--

INSERT INTO `tb_pemohon` (`no`, `id`, `nama_pemohon`, `pekerjaan`, `kewarganegaraan`, `dob`, `alamat`, `gender`, `agama`, `id_login`) VALUES
(1, 'pm-01', 'Okky Surya Lesmana', 'Wiraswasta', 'WNI', 'Ciamis, 23-10-1990', 'Jl. Setiabudi', 'Pria', 'Islam', 'rt-01'),
(10, 'pm-010', 'Mega Cahaya Dewi', 'BUMN', 'WNI', 'Ciamis, 15-04-1990', 'Jl. Setiabudi', 'Perempuan', 'Islam', 'rt-01'),
(11, 'pm-011', 'Zara Larson', 'Actress', 'WNA', 'Detroit, 24-03-1987', 'Jl. Soekarno Hatta', 'Perempuan', 'kristen', 'rt-01'),
(2, 'pm-02', 'Syamsi Ridwan Falah R', 'Wiraswasta', 'WNA', 'Bandung, 10-05-1980', 'Jl. Cihampelas', 'Pria', 'Islam', 'rt-01'),
(3, 'pm-03', 'Luqman Labib', 'Buruh Harian', 'WNI', 'Cikampek, 01-06-1989', 'Jl. Geger Kalong', 'Pria', 'budha', 'rt-01'),
(4, 'pm-04', 'Fanjar Rizkianto', 'PNS', 'WNI', 'Bangka, 09-07-1976', 'Jl. Gerlong Hilir', 'Pria', 'kristen', 'rt-01'),
(5, 'pm-05', 'Ridwan Zainal Arif', 'BUMN', 'WNI', 'Bandung, 10-10-1977', 'Jl. Sukajadi', 'Pria', 'konghuchu', 'rt-01'),
(6, 'pm-06', 'Mia Wahyuni', 'PNS', 'WNI', 'Bekasi, 10-02-1989', 'Jl. Sarijadi', 'Perempuan', 'Islam', 'rt-01'),
(7, 'pm-07', 'Dewi Puspita Sari', 'BUMN', 'WNI', 'Cirebon, 10-08-1976', 'Jl. UPI', 'Perempuan', 'Islam', 'rt-01'),
(8, 'pm-08', 'Agung Budiawan', 'Wiraswasta', 'WNI', 'Bandung, 21-01-1960', 'Jl. KPAD', 'Pria', 'hindu', 'rt-01'),
(9, 'pm-09', 'Febriani Kusuma Wijaya', 'Wiraswasta', 'WNI', 'Bandung, 10-03-1988', 'Jl. Setiabudi', 'Perempuan', 'Islam', 'rt-01');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_persyaratan`
--

CREATE TABLE `tb_persyaratan` (
  `no` int(11) NOT NULL,
  `id_persyaratan` varchar(10) NOT NULL,
  `akta_nikah` tinyint(1) NOT NULL,
  `akta_lahir` tinyint(1) NOT NULL,
  `ktp` tinyint(1) NOT NULL,
  `pendidikan_terakhir` tinyint(1) NOT NULL,
  `status_persyaratan` varchar(20) NOT NULL,
  `id_pemohon` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_persyaratan`
--

INSERT INTO `tb_persyaratan` (`no`, `id_persyaratan`, `akta_nikah`, `akta_lahir`, `ktp`, `pendidikan_terakhir`, `status_persyaratan`, `id_pemohon`) VALUES
(1, 'pr-01', 1, 1, 1, 1, 'sudah lengkap', 'pm-01'),
(2, 'pr-02', 1, 1, 1, 1, 'sudah lengkap', 'pm-01'),
(3, 'pr-03', 1, 1, 1, 1, 'sudah lengkap', 'pm-01');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_preview`
--

CREATE TABLE `tb_preview` (
  `no` int(11) NOT NULL,
  `id_preview` varchar(10) NOT NULL,
  `nama_pemohon` varchar(40) NOT NULL,
  `dob` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `pekerjaan` varchar(40) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `kewarganegaraan` varchar(3) NOT NULL,
  `agama` varchar(10) NOT NULL,
  `no_rt` char(2) NOT NULL,
  `no_rw` char(2) NOT NULL,
  `nama_rt` varchar(50) NOT NULL,
  `nama_rw` varchar(50) NOT NULL,
  `nama_desa` varchar(20) NOT NULL,
  `nama_kecamatan` varchar(20) NOT NULL,
  `nama_kabupaten` varchar(20) NOT NULL,
  `nama_provinsi` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_preview`
--

INSERT INTO `tb_preview` (`no`, `id_preview`, `nama_pemohon`, `dob`, `alamat`, `pekerjaan`, `gender`, `kewarganegaraan`, `agama`, `no_rt`, `no_rw`, `nama_rt`, `nama_rw`, `nama_desa`, `nama_kecamatan`, `nama_kabupaten`, `nama_provinsi`) VALUES
(1, 'pm-02', 'Syamsi Ridwan Falah R', 'Bandung, 10-05-1980', 'Jl. Cihampelas', 'Wiraswasta', 'Pria', 'WNA', 'Islam', '04', '01', 'Fanjar', 'Syamsi Ridwan', 'Setiabudhi', 'Cihampelas', 'Bandung', 'Jawa Barat');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_setting`
--

CREATE TABLE `tb_setting` (
  `no` int(11) NOT NULL,
  `id_setting` varchar(10) NOT NULL,
  `no_rt` char(2) NOT NULL,
  `no_rw` char(2) NOT NULL,
  `nama_rt` varchar(50) NOT NULL,
  `nama_rw` varchar(50) NOT NULL,
  `nama_desa` varchar(20) NOT NULL,
  `nama_kecamatan` varchar(20) NOT NULL,
  `nama_kabupaten` varchar(20) NOT NULL,
  `nama_provinsi` varchar(20) NOT NULL,
  `id_login` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_setting`
--

INSERT INTO `tb_setting` (`no`, `id_setting`, `no_rt`, `no_rw`, `nama_rt`, `nama_rw`, `nama_desa`, `nama_kecamatan`, `nama_kabupaten`, `nama_provinsi`, `id_login`) VALUES
(1, 'st-01', '04', '01', 'Dudung', 'Dadang', 'Setiabudhi', 'Cihampelas', 'Bandung', 'Jawa Barat', 'rt-01'),
(2, 'st-02', '02', '01', 'Luqman Labib', 'Fanjar Rizkianto', 'Scapa Ad', 'Setiabudi', 'Bandung', 'Jawa Barat', 'rt-02');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_login`
--
ALTER TABLE `tb_login`
  ADD PRIMARY KEY (`id_login`);

--
-- Indexes for table `tb_pemohon`
--
ALTER TABLE `tb_pemohon`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_login` (`id_login`),
  ADD KEY `id_login_2` (`id_login`);

--
-- Indexes for table `tb_persyaratan`
--
ALTER TABLE `tb_persyaratan`
  ADD PRIMARY KEY (`id_persyaratan`),
  ADD KEY `id_pemohon` (`id_pemohon`);

--
-- Indexes for table `tb_setting`
--
ALTER TABLE `tb_setting`
  ADD PRIMARY KEY (`id_setting`),
  ADD KEY `id_login` (`id_login`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `tb_setting`
--
ALTER TABLE `tb_setting`
  ADD CONSTRAINT `tb_setting_ibfk_1` FOREIGN KEY (`id_login`) REFERENCES `tb_login` (`id_login`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
