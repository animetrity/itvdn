package main.java.java_4_Professionall.lesson_2.task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Введіть значення - " + i);
            list.add(br.readLine());
        }
        //виводим на екран первинний стан списку
        for (int i = 0; i < list.size(); i++) {
            if(i!=list.size()-1) System.out.print(list.get(i) + ", ");
            else System.out.print(list.get(i) + ".");
        }
        //подвоюємо значення
        doubleValues(list);
        System.out.println();
        //виводимо кінцевий результат
        for (int i = 0; i < list.size(); i++) {
            if(i!=list.size()-1) System.out.print(list.get(i) + ", ");
            else System.out.print(list.get(i) + ".");
        }
    }

    public static void doubleValues (ArrayList<String> list){

        for (int i = 0; i < list.size(); i++,i++) {
            list.add(i+1, list.get(i));
        }
    }
}
