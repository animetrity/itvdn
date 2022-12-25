package main.java.java_1_Starter.lesson_6.task_5;

public class SumMax {
    public static void main(String[] args) {
        int a = 5, b = 15;
        int result = 0;

        if(a < b){
            for (int i = a; i <= b; i++) {
                result += i;
            }
            System.out.println("Сумма = " + result);
        }
    }
}
