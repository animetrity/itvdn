package main.java.java_1_Starter.lesson_8.task_5;

public class Calculator {
    public static void main(String[] args) {
        int a = 5, b = 7, c = 12;
        calculate(a,b,c);
    }
    public static void calculate(int a, int b, int c){
        //не зрозуміла умова "повертає значення кожного аргументу поділеного на 5"
        //так як це примітивний тип, значення не буде присвоєно перемінним в методі main,
        //а залишиться на рівні цього метода
        System.out.println(a /= 5);
        System.out.println(b /= 5);
        System.out.println(c /= 5);
    }
}
