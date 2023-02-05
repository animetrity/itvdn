package main.java.java_4_Professionall.lesson_2.task_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть N:");
        int numberN = Integer.parseInt(br.readLine());

        LinkedList<Integer> list = new LinkedList<>();

        getIntegerList(numberN, list);
        getMinimum(list);

    }
    public static void getIntegerList(int numberN, LinkedList<Integer> list){
        for (int i = 0; i < numberN; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println("Массив = " + list);
    }
    public static void getMinimum(LinkedList<Integer> list){
        int min = (list.size() != 0) ? list.get(0) : 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < min) min = list.get(i);
        }
        System.out.println("Мінімальне число = " + min);
    }
}
