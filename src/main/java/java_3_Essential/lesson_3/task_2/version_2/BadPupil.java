package main.java.java_3_Essential.lesson_3.task_2.version_2;

public class BadPupil extends Pupil {
    @Override
    void study() {
        System.out.println("Вмію погано вчитись");
    }

    @Override
    void read() {
        System.out.println("Вмію погано читати");
    }

    @Override
    void write() {
        System.out.println("Вмію погано писати");
    }

    @Override
    void relax() {
        System.out.println("Вмію погано розслаблятись");
    }
}
