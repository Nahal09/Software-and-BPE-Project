-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 03, 2024 at 12:09 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `restaurant`
--
CREATE DATABASE IF NOT EXISTS `restaurant` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `restaurant`;

-- --------------------------------------------------------

--
-- Table structure for table `adminsignup`
--

CREATE TABLE `adminsignup` (
  `First_Name` varchar(50) NOT NULL,
  `Last_Name` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Phone_Number` int(11) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `adminsignup`
--

INSERT INTO `adminsignup` (`First_Name`, `Last_Name`, `Email`, `Phone_Number`, `Address`, `Password`) VALUES
('maha', 'ahmed', 'maha12@gmail.com', 23455, 'kechs', '123'),
('nahal', 'junaid', 'nahaljunaid03@gmail.com', 25436, '123 street', '123'),
('ALIZA', 'NAZ', 'maryam133@gmail.com', 2536, 'pechs', '12345'),
('ALIZA', 'NAZ', 'maryam133@gmail.com', 2536, 'pechs', '12345'),
('ALIZA', 'NAZ', 'maryam133@gmail.com', 2536, 'pechs', '12345'),
('HAYA', 'ALI', 'HAYA@GMAIL.COM', 57890, 'FYJFJ', '2002'),
('arzoo', 'khan', 'arzoo12@gmail.com', 22344455, 'khi', '1234'),
('haris ', 'ahmed ', 'haris12@gmail.com', 234454, 'isb', '22345'),
('haris ', 'ahmed ', 'haris12@gmail.com', 234454, 'isb', '22345'),
('habib', 'asif', 'habib01@gmail.com', 23545545, 'khi', '123'),
('abc', 'nine', 'anb167@gmail.com', 2234445, 'khi', '123');

-- --------------------------------------------------------

--
-- Table structure for table `deliverymanagement`
--

CREATE TABLE `deliverymanagement` (
  `Delivery_ID` int(11) DEFAULT NULL,
  `Order_ID` int(11) DEFAULT NULL,
  `Delivery_Status` enum('Pending','Out for Delivery','Delivered') DEFAULT 'Pending',
  `Estimated_Delivery_Time` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `deliverymanagement`
--

INSERT INTO `deliverymanagement` (`Delivery_ID`, `Order_ID`, `Delivery_Status`, `Estimated_Delivery_Time`) VALUES
(1, 1, 'Pending', '2023-12-23 18:44:03'),
(22, 22, 'Delivered', '2024-01-18 15:54:40'),
(8, 8, 'Pending', '2024-01-18 16:05:19'),
(23, 335, 'Delivered', '2024-01-21 08:22:06'),
(15, 15, 'Pending', '2024-02-03 08:56:31'),
(50, 50, 'Delivered', '2024-02-03 08:57:08');

-- --------------------------------------------------------

--
-- Table structure for table `foodpreparation`
--

CREATE TABLE `foodpreparation` (
  `Prep_ID` int(11) NOT NULL,
  `Order_ID` int(11) DEFAULT NULL,
  `Preparation_Status` enum('Pending','In Progress','Completed') DEFAULT 'Pending'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `foodpreparation`
--

INSERT INTO `foodpreparation` (`Prep_ID`, `Order_ID`, `Preparation_Status`) VALUES
(1, 1, 'Pending'),
(2, 2, ''),
(3, 3, 'In Progress'),
(7, 7, 'In Progress'),
(17, 17, 'Pending'),
(20, 20, 'Completed'),
(21, 21, 'Completed'),
(256, 335, 'Completed');

-- --------------------------------------------------------

--
-- Table structure for table `menu`
--

CREATE TABLE `menu` (
  `Menu_ID` int(11) NOT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `Price` decimal(10,2) DEFAULT NULL,
  `Category` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `menu`
--

INSERT INTO `menu` (`Menu_ID`, `Name`, `Price`, `Category`) VALUES
(2, 'beef burger ', '350.00', 'fast food  '),
(7, 'Chicken Zinger ', '500.00', 'fast food '),
(10, 'lasagna', '1100.00', 'fast');

-- --------------------------------------------------------

--
-- Table structure for table `signup`
--

CREATE TABLE `signup` (
  `First Name` varchar(50) NOT NULL,
  `Last Name` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Phone Number` int(11) NOT NULL,
  `Address` varchar(70) NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `signup`
--

INSERT INTO `signup` (`First Name`, `Last Name`, `Email`, `Phone Number`, `Address`, `Password`) VALUES
('Nahal', 'Junaid', 'nahaljunaid12@gmail.com', 2147483647, 'house no 75 st no 4 KECHS, Karachi', 'nahal1245'),
('Maha', 'Ali', 'maha1@gmail.com', 55665, 'khi', '123'),
('maha ', 'ali', 'maha12@gmail.com', 283902, 'kechs ', '123'),
('maha ', 'ali', 'maha12@gmail.com', 283902, 'kechs ', '123'),
('maha', 'ali', 'maha12@gmail.com', 235364, 'kechs', '123'),
('muhammad', 'ahmed', 'ahmed12@gmail.com', 23455, 'Tariq Bin Ziyad', '123'),
('arooba ', 'junaid', 'arooba12@gmail.com', 234556, 'malir ', '124'),
('maryam', 'naz', 'maryam13@gmail.com', 2536, 'pechs', '12345'),
('maryam', 'NAZ', 'maryam100@gmail.com', 2536, '', ''),
('ali', 'ahmed', 'ali@gmail.com', 2355, 'khi', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `deliverymanagement`
--
ALTER TABLE `deliverymanagement`
  ADD KEY `Delivery_ID` (`Delivery_ID`),
  ADD KEY `Order_ID` (`Order_ID`);

--
-- Indexes for table `foodpreparation`
--
ALTER TABLE `foodpreparation`
  ADD PRIMARY KEY (`Prep_ID`),
  ADD KEY `Order_ID` (`Order_ID`);

--
-- Indexes for table `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`Menu_ID`),
  ADD UNIQUE KEY `Name` (`Name`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `foodpreparation`
--
ALTER TABLE `foodpreparation`
  MODIFY `Prep_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=257;

--
-- AUTO_INCREMENT for table `menu`
--
ALTER TABLE `menu`
  MODIFY `Menu_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
