package main.java.java_1_Starter.lesson_6.task_4;

public class Delivery {
    public static void main(String[] args) {
        int clientSize = 5;
        int factorial = 1;
        int i = 0;
        do {
            i++;
            factorial *= i;
        }while(i < clientSize);

        System.out.println(factorial);
    }
}
