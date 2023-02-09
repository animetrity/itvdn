package main.java.java_4_Professionall.lesson_4.task_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
public static void main(String[] args) {
	String format = "dd.MM.yyyy HH:mm:ss";
	System.out.println("Введіть дату у форматі " + format);

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
	LocalDateTime localDateTime;

	try {
		localDateTime = LocalDateTime.parse(br.readLine(), formatter);
	} catch (IOException e) {
		throw new RuntimeException(e);
	}

	getAge(localDateTime);

}

public static void getAge(LocalDateTime localDateTime){
	LocalDateTime localDateTimeNow = LocalDateTime.now();
	LocalDateTime localDateTimeAge = localDateTimeNow
			.minusYears(localDateTime.getYear())
			.minusMonths(localDateTime.getMonthValue())
			.minusDays(localDateTime.getDayOfMonth())
			.minusHours(localDateTime.getHour())
			.minusMinutes(localDateTime.getMinute())
			.minusSeconds(localDateTime.getSecond())
			;

	System.out.println("Вам виповнилося " +
			localDateTimeAge.getYear() + " років, " +
			localDateTimeAge.getMonthValue() + " місяці, "  +
			localDateTimeAge.getDayOfMonth() + " днів, " +
			localDateTimeAge.getHour() + " години, " +
			localDateTimeAge.getMinute() + " хвилин та " +
			localDateTimeAge.getSecond() + " секунд.");
}
}
