package java_1_Starter.lesson_9.task_2;

import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть розмір массива:");
        int lenght = scanner.nextInt();
        int[] list = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            System.out.println("Введіть число №" + (i+1));
            list[i] = scanner.nextInt();
        }

        if(list.length != 0){
            max(list);
            min(list);
            average(list);
            odd(list);
        }



    }
    public static void max(int[] list){
        int max = list[0];
        for (int i = 1; i < list.length; i++) {
            if(max < list[i]) max = list[i];
        }
        System.out.println("Максимальне число в массиві = " + max);
    }
    public static void min(int[] list){
        int min = list[0];
        for (int i = 1; i < list.length; i++) {
            if(min > list[i]) min = list[i];
        }
        System.out.println("Мінімальне число в массиві = " + min);
    }
    public static void average(int[] list){
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        System.out.println("Середнє арифметичне = " + (double)(sum / list.length));
    }
    public static void odd(int[] list){
        System.out.print("Непарні числа в массиві:");
        for (int i = 0; i < list.length; i++) {
            if(list[i] % 2 != 0) System.out.print(" " + list[i]);
        }
        System.out.print("\n");
    }
}
