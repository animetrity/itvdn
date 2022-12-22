package main.java.course_1.lesson_7.task_5;

public class PowerA3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            powerA3(i, 5);
        }
    }
    public static void powerA3(int a, int b){
        b = a * a * a;
        System.out.println("Третя ступінь числа " + a + " = " + b);
    }
}
