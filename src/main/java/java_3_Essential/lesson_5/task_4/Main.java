package main.java.java_3_Essential.lesson_5.task_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        ListIterator<Integer> listIterator = list.listIterator();

        while (listIterator.hasNext()){
            Integer integer = listIterator.next();
            listIterator.set(integer + 1);


        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
