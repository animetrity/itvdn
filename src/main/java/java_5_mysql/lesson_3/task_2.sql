-- phpMyAdmin SQL Dump
-- version 5.1.1deb5ubuntu1
-- https://www.phpmyadmin.net/
--
-- Хост: localhost:3306
-- Время создания: Мар 31 2023 г., 14:03
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
-- База данных: `composition`
--

-- --------------------------------------------------------

--
-- Структура таблицы `history`
--

CREATE TABLE `history` (
  `id` int NOT NULL,
  `soldier_id` int NOT NULL,
  `weapon_id` int NOT NULL,
  `issued_by_whom_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Дамп данных таблицы `history`
--

INSERT INTO `history` (`id`, `soldier_id`, `weapon_id`, `issued_by_whom_id`) VALUES
(1, 1, 1, 5),
(2, 1, 2, 6),
(3, 2, 3, 7),
(4, 2, 2, 6),
(5, 3, 1, 5),
(6, 3, 2, 6),
(7, 4, 1, 5);

-- --------------------------------------------------------

--
-- Структура таблицы `office`
--

CREATE TABLE `office` (
  `id` int NOT NULL,
  `number` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Дамп данных таблицы `office`
--

INSERT INTO `office` (`id`, `number`) VALUES
(1, '205'),
(2, '221'),
(3, '201'),
(4, 'Не указан');

-- --------------------------------------------------------

--
-- Структура таблицы `platoon`
--

CREATE TABLE `platoon` (
  `id` int NOT NULL,
  `number` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Дамп данных таблицы `platoon`
--

INSERT INTO `platoon` (`id`, `number`) VALUES
(1, '222'),
(2, '232'),
(3, '212'),
(4, '200'),
(5, 'Не указан');

-- --------------------------------------------------------

--
-- Структура таблицы `position`
--

CREATE TABLE `position` (
  `id` int NOT NULL,
  `name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Дамп данных таблицы `position`
--

INSERT INTO `position` (`id`, `name`) VALUES
(1, 'майор'),
(2, 'солдат'),
(3, 'подполковник');

-- --------------------------------------------------------

--
-- Структура таблицы `soldier`
--

CREATE TABLE `soldier` (
  `id` int NOT NULL,
  `firstname` varchar(30) NOT NULL,
  `lastname` varchar(30) NOT NULL,
  `surname` varchar(30) NOT NULL,
  `office_id` int NOT NULL,
  `platoon_id` int NOT NULL,
  `position_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Дамп данных таблицы `soldier`
--

INSERT INTO `soldier` (`id`, `firstname`, `lastname`, `surname`, `office_id`, `platoon_id`, `position_id`) VALUES
(1, 'В', 'Петров', 'А', 1, 1, 2),
(2, 'П', 'Лодарев', 'С', 2, 2, 2),
(3, 'К', 'Леонтьев', 'В', 3, 3, 2),
(4, 'Р', 'Духов', 'М', 1, 4, 2),
(5, 'О', 'Буров', 'С', 4, 5, 1),
(6, 'Н', 'Рыбаков', 'Г', 4, 5, 1),
(7, 'В', 'Деребанов', 'Я', 4, 5, 3);

-- --------------------------------------------------------

--
-- Структура таблицы `weapon`
--

CREATE TABLE `weapon` (
  `id` int NOT NULL,
  `name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Дамп данных таблицы `weapon`
--

INSERT INTO `weapon` (`id`, `name`) VALUES
(1, 'АК-47'),
(2, 'Глок20'),
(3, 'АК-74');

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `history`
--
ALTER TABLE `history`
  ADD PRIMARY KEY (`id`),
  ADD KEY `soldier` (`soldier_id`),
  ADD KEY `weapon` (`weapon_id`),
  ADD KEY `issued_by_whom` (`issued_by_whom_id`);

--
-- Индексы таблицы `office`
--
ALTER TABLE `office`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `platoon`
--
ALTER TABLE `platoon`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `position`
--
ALTER TABLE `position`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `soldier`
--
ALTER TABLE `soldier`
  ADD PRIMARY KEY (`id`),
  ADD KEY `office` (`office_id`),
  ADD KEY `position` (`position_id`),
  ADD KEY `platoon` (`platoon_id`);

--
-- Индексы таблицы `weapon`
--
ALTER TABLE `weapon`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT для сохранённых таблиц
--

--
-- AUTO_INCREMENT для таблицы `history`
--
ALTER TABLE `history`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT для таблицы `office`
--
ALTER TABLE `office`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT для таблицы `platoon`
--
ALTER TABLE `platoon`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT для таблицы `position`
--
ALTER TABLE `position`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT для таблицы `soldier`
--
ALTER TABLE `soldier`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT для таблицы `weapon`
--
ALTER TABLE `weapon`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Ограничения внешнего ключа сохраненных таблиц
--

--
-- Ограничения внешнего ключа таблицы `history`
--
ALTER TABLE `history`
  ADD CONSTRAINT `history_ibfk_1` FOREIGN KEY (`soldier_id`) REFERENCES `soldier` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `history_ibfk_2` FOREIGN KEY (`weapon_id`) REFERENCES `weapon` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `history_ibfk_3` FOREIGN KEY (`issued_by_whom_id`) REFERENCES `soldier` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Ограничения внешнего ключа таблицы `soldier`
--
ALTER TABLE `soldier`
  ADD CONSTRAINT `soldier_ibfk_1` FOREIGN KEY (`office_id`) REFERENCES `office` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `soldier_ibfk_2` FOREIGN KEY (`position_id`) REFERENCES `position` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `soldier_ibfk_3` FOREIGN KEY (`platoon_id`) REFERENCES `platoon` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
