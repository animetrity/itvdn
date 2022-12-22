package main.java.course_1.lesson_7.task_4;

import java.util.Scanner;

public class NumbersCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число:");
        int number = scanner.nextInt();
        task1(number);
        task2(number);
        task3(number);
    }
    public static void task1(int number){
        if(number >= 0) System.out.println("1) Число " + number + " позитивне.");
        else System.out.println("1) Число " + number + " негативне.");
    }
    public static void task2(int number){
        int numberNew;
        if(number < 0) numberNew = ~number + 1;
        else numberNew = number;
        for (int i = 2; i < numberNew; i++) {
            if(numberNew % i == 0){
                System.out.println("2) Число " + number + " не є простим.");
                break;
            }
            if(i == numberNew - 1) System.out.println("2) Число " + number + " є простим.");
        }

    }
    public static void task3(int number){
        if(number % 2 == 0 && number % 5 == 0 && number % 3 == 0 && number % 6 == 0 && number % 9 == 0)
            System.out.println("3) Число " + number + " ділиться на 2, 5, 3, 6, 9 без залишку");
        else System.out.println("3) Число " + number + " не ділиться на 2, 5, 3, 6, 9 без залишку");
    }
}
