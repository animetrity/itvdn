package main.java.java_1_Starter.lesson_4.task_6;

public class Number {
    public static void main(String[] args) {
        int a = 5, b = 1, c = 9;

        System.out.println("Максимальне число = " + max(a,b,c));
        System.out.println("Середнє число = " + averahe(a,b,c));
        System.out.println("Мінімальне число = " + min(a,b,c));

    }
    public static int max(int a, int b, int c){
        if(a > b && a > c)return a;
        else if(b > a && b > c)return b;
        else return c;
    }
    public static int min(int a, int b, int c){
        if(a < b && a < c)return a;
        else if(b < a && b < c)return b;
        else return c;
    }
    public static int averahe(int a, int b, int c){
        int max = max(a,b,c), min = min(a,b,c);
        if(a != max && a != min)return a;
        else if(b != max && b != min)return b;
        else return c;
    }
}
