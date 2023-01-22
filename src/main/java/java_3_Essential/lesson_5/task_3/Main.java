package main.java.java_3_Essential.lesson_5.task_3;

import main.java.java_3_Essential.lesson_5.task_2.Zoo;

public class Main {
    public static void main(String[] args) {
        remove(new Zoo(), 3);
        remove(new Zoo(), 5);
        remove(new Zoo(), 7);

    }

    private static void remove(Zoo zoo, int count){
        System.out.println("Розпочинаю видалення "+count+" елементів\n");
        for (int i = 0; i < count; i++) {
            zoo.zoo.remove(0);
        }
        System.out.println("Розмір массива після видалення - " + zoo.zoo.size() + "\n");
    }
}
