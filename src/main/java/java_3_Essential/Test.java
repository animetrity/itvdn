package main.java.java_3_Essential;

import main.java.java_3_Essential.lesson_7.task_2.Worker;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int biggestNumber = 0;
        for (int i = 0; i < size; i++) {
            int number = scanner.nextInt();
            if (number % 4 == 0 && number > biggestNumber) {
                biggestNumber = number;
            }
        }
        System.out.println(biggestNumber);



    }


}