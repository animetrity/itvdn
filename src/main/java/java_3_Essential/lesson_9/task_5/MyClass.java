package java_3_Essential.lesson_9.task_5;

import java.time.LocalDateTime;

public class MyClass<T> {

    public static <T> void factoryMethod(T t1) {
        System.out.println(t1.getClass().toString());
    }

    public static void main(String[] args) {
        factoryMethod(3.14);
        factoryMethod(12);
        factoryMethod(new String("as"));
    }
}
