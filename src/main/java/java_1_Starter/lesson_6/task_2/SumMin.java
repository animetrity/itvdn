package main.java.java_1_Starter.lesson_6.task_2;

public class SumMin {
    public static void main(String[] args) {
        int a = 5, b = 15;
        int result = 0;

        if(a < b){
            for (int i = a + 1; i < b; i++) {
                result += i;
            }
            System.out.println("Сумма = " + result);

            for (int i = a + 1; i < b; i++) {
                if(i % 2 != 0) System.out.println("Непарне число - " + i);
            }
        }
    }
}
