package java_1_Starter.lesson_4.task_7;

import java.time.LocalDate;

public class DayCountOfMonth {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            int daysOfMonth = getDayCount(i+1);
            System.out.println("Месяц номер " + (i+1) + " содержит такое количество дней - " + daysOfMonth);
        }
    }
    public static int getDayCount(int monthNumber){
        int year = 2022;
        LocalDate localDate = (monthNumber == 12)?LocalDate.of(year + 1,1,1):LocalDate.of(year,monthNumber + 1,1);
        return localDate.minusDays(1).getDayOfMonth();
    }
}
