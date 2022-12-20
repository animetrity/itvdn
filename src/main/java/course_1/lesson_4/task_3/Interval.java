package main.java.course_1.lesson_4.task_3;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        System.out.println("Введіть число:");
        Scanner scanner = new Scanner(System.in);
        intervalNumber(scanner.nextInt());

        //тест чисел від -1 до 101
        //testInterval();

    }
    public static void intervalNumber(int inInt){
        String wrongNumber = "Число не потрапляє в проміжок від 0 до 100";
        if(inInt >= 0){
            if(inInt <= 14) System.out.println("[0-14]");
            else if (inInt <= 35) System.out.println("[15 - 35]");
            else if (inInt <= 50) System.out.println("[36 - 50]");
            else if (inInt <= 100) System.out.println("[50 - 100]");
            else System.out.println(wrongNumber + ", Число більше 100");
        }
        else System.out.println(wrongNumber + ", Число менше 0");
    }
    public static void testInterval(){
        for (int i = -1; i < 102; i++) {
            System.out.print("Число - " + i + " Проміжок - ");
            intervalNumber(i);
        }
    }
}
