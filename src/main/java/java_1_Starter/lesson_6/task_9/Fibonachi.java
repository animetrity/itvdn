package main.java.java_1_Starter.lesson_6.task_9;

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число:");
        int leftNumberFromUser = scanner.nextInt();
        System.out.println("Введіть друге число:");
        int rightNumberFromUser = scanner.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;
        int sum = 0;
        while (true){
            sum = firstNumber + secondNumber;
            if(sum <= rightNumberFromUser) {
                // якщо згідно умови потрібно щоб число не було рівним першому числу яке ввів користувач, то в умові знизу забрати знак "="
                if(sum >= leftNumberFromUser)System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
                firstNumber = secondNumber;
                secondNumber = sum;
            }
            else break;
        }
    }

}
