package main.java.java_1_Starter.lesson_4.task_2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1 = 5, operand2 = 8;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть арифметичний знак.");
        String sign = scanner.next();
        switch (sign){
            case "+":
                System.out.println(operand1 + operand2);
                break;
            case "-":
                System.out.println(operand1 - operand2);
                break;
            case "/":
                if(operand2 != 0)System.out.println(operand1 / (double)operand2);
                else System.out.println("Помилка: другий операнд рівний 0");

                break;
            case "*":
                System.out.println(operand1 * operand2);
                break;
            default:
                if(sign.length()>1) System.out.println("Помилка: присутні зайві символи.");
                else System.out.println("Невірний арифметичний знак.");
        }

    }

}
