package java_2_Git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) throws InterruptedException {




        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть кількість секунд");

        int seconds = scanner.nextInt();

        for (int number = 0; number < seconds; number++) {

            System.out.println(seconds - number);

            Thread.sleep(1000);

        }









    }
}
