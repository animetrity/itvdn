package main.java.java_3_Essential.lesson_2.task_2;

public class Auto {
    private int year;
    private String color;

    public Auto(int year, String color) {
        this.year = year;
        this.color = color;
    }
    public Auto(String color) {
        this.color = color;
        this.year = 2022;
    }
    public Auto(int year) {
        this.year = year;
        this.color = "Чорний";
    }
    public Auto() {
        this.color = "Чорний";
        this.year = 2022;
    }
}
