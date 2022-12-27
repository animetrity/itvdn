package main.java.java_3_Essential.lesson_2.task_4;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto();
        Auto auto1 = new Auto(2000);
        Auto auto2 = new Auto(2001,40.6);
        Auto auto3 = new Auto(2002,36.6,1200);
        Auto auto4 = new Auto(2003,55.5,1800,"Голубий");

        System.out.println(auto);
        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);
        System.out.println(auto4);
    }
}
