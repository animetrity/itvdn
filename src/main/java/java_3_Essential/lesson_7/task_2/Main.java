package main.java.java_3_Essential.lesson_7.task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Worker> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            list.add(new Worker());
            System.out.println("Введіть прізвище та ініціали працівника.");
            list.get(i).fio = br.readLine();
            System.out.println("Введіть назву посади.");
            list.get(i).nameWork = br.readLine();
            System.out.println("Введіть рік надходження на роботу.");
            String year = br.readLine();
            if(year.length() == 4) list.get(i).year = Integer.parseInt(year);
            else throw new IOException();
        }

        list.sort(Comparator.comparing(Worker::getFio));

        System.out.println("Введіть стаж роботи для пошуку працівників");
        int workYear = Integer.parseInt(br.readLine());

        for (int i = 0; i < list.size(); i++) {
            int y = 2023  - list.get(i).year;
            if(y  > workYear){
                System.out.println("Працівник - " + list.get(i).getFio() + ", стаж = " + y);
            }
        }
    }

}
