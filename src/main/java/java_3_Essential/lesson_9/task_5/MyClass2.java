package main.java.java_3_Essential.lesson_9.task_5;

public class MyClass2<T> {
    public T field;

    public MyClass2() {
    }

    public MyClass2(T field) {
        this.field = field;
    }

    public static <S> MyClass2<S> factoryMethod() {
        return new MyClass2<>();
    }

    public static <S> MyClass2<S> factoryMethod(S arg) {
        return new MyClass2<>(arg);
    }
}
