-- phpMyAdmin SQL Dump
-- version 5.1.1deb5ubuntu1
-- https://www.phpmyadmin.net/
--
-- Хост: localhost:3306
-- Время создания: Апр 12 2023 г., 13:25
-- Версия сервера: 8.0.32-0ubuntu0.22.04.2
-- Версия PHP: 8.1.2-1ubuntu2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `myjoinsdb`
--

-- --------------------------------------------------------

--
-- Структура таблицы `Employees`
--

CREATE TABLE `Employees` (
  `EmployeeID` int NOT NULL,
  `EmployeeName` varchar(50) DEFAULT NULL,
  `PhoneNumber` varchar(20) DEFAULT NULL,
  `PositionID` int DEFAULT NULL,
  `FamilyStatusID` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Дамп данных таблицы `Employees`
--

INSERT INTO `Employees` (`EmployeeID`, `EmployeeName`, `PhoneNumber`, `PositionID`, `FamilyStatusID`) VALUES
(1, 'Олександр Коваль', '+380501234567', 1, 1),
(2, 'Марія Іваненко', '+380501234568', 2, 2),
(3, 'Віктор Петренко', '+380501234569', 1, 1),
(4, 'Ольга Кравченко', '+380501234570', 2, 2),
(5, 'Ігор Григоренко', '+380501234571', 3, 3);

-- --------------------------------------------------------

--
-- Структура таблицы `FamilyStatuses`
--

CREATE TABLE `FamilyStatuses` (
  `FamilyStatusID` int NOT NULL,
  `StatusName` varchar(50) DEFAULT NULL,
  `BirthDate` date DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  `EmployeeID` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Дамп данных таблицы `FamilyStatuses`
--

INSERT INTO `FamilyStatuses` (`FamilyStatusID`, `StatusName`, `BirthDate`, `Address`, `EmployeeID`) VALUES
(1, 'Одружений', '1985-05-15', 'м. Київ, вул. Хрещатик, 1', 1),
(2, 'Неодружений', '1990-12-27', 'м. Львів, вул. Винниченка, 10', 2),
(3, 'Розлучений', '1982-08-21', 'м. Одеса, вул. Дерибасівська, 20', 3),
(4, 'Одружений', '1992-04-10', 'м. Дніпро, вул. Карла Маркса, 15', 4),
(5, 'Неодружений', '1988-11-05', 'м. Харків, вул. Сумська, 30', 5);

-- --------------------------------------------------------

--
-- Структура таблицы `Positions`
--

CREATE TABLE `Positions` (
  `PositionID` int NOT NULL,
  `PositionName` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Дамп данных таблицы `Positions`
--

INSERT INTO `Positions` (`PositionID`, `PositionName`) VALUES
(1, 'Менеджер'),
(2, 'Розробник'),
(3, 'Тестувальник'),
(4, 'Аналітик'),
(5, 'Дизайнер');

-- --------------------------------------------------------

--
-- Структура таблицы `Salaries`
--

CREATE TABLE `Salaries` (
  `SalaryID` int NOT NULL,
  `EmployeeID` int DEFAULT NULL,
  `Salary` decimal(10,2) DEFAULT NULL,
  `PositionID` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Дамп данных таблицы `Salaries`
--

INSERT INTO `Salaries` (`SalaryID`, `EmployeeID`, `Salary`, `PositionID`) VALUES
(1, 1, '20000.00', 1),
(2, 2, '30000.00', 2),
(3, 3, '25000.00', 1),
(4, 4, '35000.00', 2),
(5, 5, '28000.00', 3);

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `Employees`
--
ALTER TABLE `Employees`
  ADD PRIMARY KEY (`EmployeeID`),
  ADD KEY `PositionID` (`PositionID`),
  ADD KEY `FamilyStatusID` (`FamilyStatusID`);

--
-- Индексы таблицы `FamilyStatuses`
--
ALTER TABLE `FamilyStatuses`
  ADD PRIMARY KEY (`FamilyStatusID`),
  ADD KEY `FK_Employees_FamilyStatuses` (`EmployeeID`);

--
-- Индексы таблицы `Positions`
--
ALTER TABLE `Positions`
  ADD PRIMARY KEY (`PositionID`);

--
-- Индексы таблицы `Salaries`
--
ALTER TABLE `Salaries`
  ADD PRIMARY KEY (`SalaryID`),
  ADD KEY `FK_Positions_Salaries` (`PositionID`),
  ADD KEY `EmployeeID` (`EmployeeID`);

--
-- Ограничения внешнего ключа сохраненных таблиц
--

--
-- Ограничения внешнего ключа таблицы `Employees`
--
ALTER TABLE `Employees`
  ADD CONSTRAINT `Employees_ibfk_1` FOREIGN KEY (`PositionID`) REFERENCES `Positions` (`PositionID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `Employees_ibfk_2` FOREIGN KEY (`FamilyStatusID`) REFERENCES `FamilyStatuses` (`FamilyStatusID`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Ограничения внешнего ключа таблицы `FamilyStatuses`
--
ALTER TABLE `FamilyStatuses`
  ADD CONSTRAINT `FK_Employees_FamilyStatuses` FOREIGN KEY (`EmployeeID`) REFERENCES `Employees` (`EmployeeID`);

--
-- Ограничения внешнего ключа таблицы `Salaries`
--
ALTER TABLE `Salaries`
  ADD CONSTRAINT `FK_Positions_Salaries` FOREIGN KEY (`PositionID`) REFERENCES `Positions` (`PositionID`),
  ADD CONSTRAINT `Salaries_ibfk_1` FOREIGN KEY (`EmployeeID`) REFERENCES `Employees` (`EmployeeID`) ON DELETE RESTRICT ON UPDATE RESTRICT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
