package main.java.java_3_Essential.lesson_5.task_6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Teacher> list = new ArrayList<>();
        list.add(new Teacher("Вчитель 1",5));
        list.add(new Teacher("Вчитель 2",3));
        list.add(new Teacher("Вчитель 3",12));
        list.add(new Teacher("Вчитель 4",1));

        System.out.println("Кращий вчитель - " + getMax(list));
        System.out.println("Гірший вчитель - " + getMin(list));

    }

    private static Teacher getMax(ArrayList<Teacher> list){
        Teacher teacher = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).bal > teacher.bal)teacher = list.get(i);
        }
        return teacher;
    }
    private static Teacher getMin(ArrayList<Teacher> list){
        Teacher teacher = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).bal < teacher.bal)teacher = list.get(i);
        }
        return teacher;
    }
}
