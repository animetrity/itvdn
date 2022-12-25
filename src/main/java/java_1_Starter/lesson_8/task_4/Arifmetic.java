package main.java.java_1_Starter.lesson_8.task_4;

public class Arifmetic {
    public static void main(String[] args) {
        maxMinAve(
                average(2,4,5),
                average(2,4,5,9),
                average(2,4,5,10,15)
        );
    }
    public static double average(int a, int b, int c){
        return (a + b + c) / 3d;
    }
    public static double average(int a, int b, int c, int d){
        return (a + b + c + d) / 4d;
    }
    public static double average(int a, int b, int c, int d, int e){
        return (a + b + c + d + e) / 5d;
    }
    public static void maxMinAve(double a, double b, double c){
        double max, min, ave;
        if(a > b && a > c)max = a;
        else if(b > a && b > c)max = b;
        else max = c;

        if(a < b && a < c)min = a;
        else if(b < a && b < c)min = b;
        else min = c;

        if(a != max && a != min)ave = a;
        else if(b != max && b != min)ave = b;
        else ave = c;

        System.out.println("Максимальне число = " + max);
        System.out.println("Мінімальне число = " + min);
        System.out.println("Середнє число = " + ave);
    }

}
