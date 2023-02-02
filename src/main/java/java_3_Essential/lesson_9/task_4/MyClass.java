package main.java.java_3_Essential.lesson_9.task_4;

public class MyClass<T> {
    public T field;

    public MyClass() {
    }

    public MyClass(T field) {
        this.field = field;
    }

    public static <S> MyClass<S> factoryMethod() {
        return new MyClass<>();
    }

    public static <S> MyClass<S> factoryMethod(S arg) {
        return new MyClass<>(arg);
    }
}
