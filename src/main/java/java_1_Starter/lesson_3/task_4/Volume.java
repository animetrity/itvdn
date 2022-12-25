package main.java.java_1_Starter.lesson_3.task_4;

public class Volume {
    public static void main(String[] args) {
        final double PI = Math.PI;
        int r = 4;
        int h = 8;
        double v = PI * Math.pow(r, 2) * h;
        double s = 2 * PI * (h * r);
        double sFull = PI * Math.pow(r, 2) + PI * Math.pow(r, 2) + s;
        System.out.println("Об'єм циліндра = " + v);
        System.out.println("Площа бокової поверхності циліндра = " + s);
        System.out.println("Площа повної поверхності циліндра = " + sFull);


    }
}
