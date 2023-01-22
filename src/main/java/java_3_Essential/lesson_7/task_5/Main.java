package main.java.java_3_Essential.lesson_7.task_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть число а");
        int a;
        int b;
        try {
            a = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Введіть число б");
        try {
            b = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(a,b));
        System.out.println(calculator.sub(a,b));
        System.out.println(calculator.mul(a,b));
        try {
            System.out.println(calculator.div(a,b));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
