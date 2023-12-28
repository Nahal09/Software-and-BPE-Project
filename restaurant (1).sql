-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 28, 2023 at 11:07 AM
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
(1, 1, 'Pending', '2023-12-23 18:44:03');

-- --------------------------------------------------------

--
-- Table structure for table `deliverypersonnel`
--

CREATE TABLE `deliverypersonnel` (
  `Delivery_ID` int(11) NOT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `Contact` varchar(20) DEFAULT NULL,
  `Status` enum('Available','Busy') DEFAULT 'Available'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `foodpreparation`
--

CREATE TABLE `foodpreparation` (
  `Prep_ID` int(11) NOT NULL,
  `Order_ID` int(11) DEFAULT NULL,
  `Preparation_Status` enum('Pending','In Progress','Completed') DEFAULT 'Pending'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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
(1, 'burger', '250.00', 'fast food');

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
('Nahal', 'Junaid', 'nahaljunaid12@gmail.com', 2147483647, 'house no 75 st no 4 KECHS, Karachi', 'nahal1245');

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
-- Indexes for table `deliverypersonnel`
--
ALTER TABLE `deliverypersonnel`
  ADD PRIMARY KEY (`Delivery_ID`);

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
-- AUTO_INCREMENT for table `deliverypersonnel`
--
ALTER TABLE `deliverypersonnel`
  MODIFY `Delivery_ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `foodpreparation`
--
ALTER TABLE `foodpreparation`
  MODIFY `Prep_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `menu`
--
ALTER TABLE `menu`
  MODIFY `Menu_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
