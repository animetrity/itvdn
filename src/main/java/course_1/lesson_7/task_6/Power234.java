package main.java.course_1.lesson_7.task_6;

public class Power234 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            power234(i,2,3,4);
        }
    }
    public static void power234(int a, int b, int c, int d){
        b = a * a;
        c = a * a * a;
        d = a * a * a * a;
        System.out.println(a + " в степені 2 = " + b + ", в степені 3 = " + c + ", в степені 4 = " + d);

    }
}
