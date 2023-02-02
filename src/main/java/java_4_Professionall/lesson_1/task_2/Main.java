package main.java.java_4_Professionall.lesson_1.task_2;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("123");
        list.add("234");
        list.add("345");
        list.add("456");
        list.add("567");
        list.add("678");
        list.add("789");
        list.add("890");
        list.add("987");
        list.add("756");


        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            System.out.println(it.next());


        }

    }
}
