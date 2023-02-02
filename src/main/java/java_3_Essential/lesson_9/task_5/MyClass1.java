package main.java.java_3_Essential.lesson_9.task_5;

import java.time.LocalDateTime;

public class MyClass1<T> {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        System.out.println(factoryMethod(Main.class));
    }

    public static <T> T factoryMethod(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        return clazz.newInstance();
    }
}

