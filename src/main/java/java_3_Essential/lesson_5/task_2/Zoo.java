package java_3_Essential.lesson_5.task_2;

import java.util.ArrayList;

public class Zoo {
    public ArrayList<String> zoo = new ArrayList<>();
    {
        zoo.add(0,"Корова");
        zoo.add(1,"Миша");
        zoo.add(2,"Кіт");
        zoo.add(3,"Пес");
        zoo.add(4,"Попугай");
        zoo.add(5,"Дельфін");
        zoo.add(6,"Тигр");
        zoo.add(7,"Лев");
        for (int i = 0; i < zoo.size(); i++) {
            System.out.println(zoo.get(i));
        }
    }
}
