package main.java.course_1.lesson_7.task_7;

public class Calculator {
    public static void main(String[] args) {
        calculate(2,3,4);
    }
    public static void calculate(int a, int b, int c){
        System.out.println("Середнє арифметичне чисел: " + a + ", " + b+ ", " + c + " = " + ((a + b + c) / 3));
    }
}
