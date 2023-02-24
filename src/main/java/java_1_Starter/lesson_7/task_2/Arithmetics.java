package java_1_Starter.lesson_7.task_2;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число");
        int a = scanner.nextInt();
        System.out.println("Введіть друге число");
        int b = scanner.nextInt();
        System.out.println("Введіть знак арифметичної операції");
        switch (scanner.next()){
            case "+":
                System.out.println("Результат додавання " + a + " + " + b + " = " + add(a,b));
                break;
            case "-":
                System.out.println("Результат віднімання " + a + " - " + b + " = " + sub(a,b));
                break;
            case "*":
                System.out.println("Результат множення " + a + " * " + b + " = " + mul(a,b));
                break;
            case "/":
                System.out.println("Результат ділення " + a + " / " + b + " = " + div(a,b));
                break;
            default:
                System.out.println("Невірний знак арифметичної операції.");
                break;
        }
    }
    public static int add(int a, int b){
        return a + b;
    }
    public static int sub(int a, int b){
        return a - b;
    }
    public static int mul(int a, int b){
        return a * b;
    }
    public static int div(int a, int b){
        return (b != 0) ? a / b : 0;
    }
}
