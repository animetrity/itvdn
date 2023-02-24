package java_3_Essential.lesson_2.task_3;

public class Auto {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Auto() {
    }

    public Auto(int year) {
        this.year = year;
    }

    public Auto(int year, double speed) {
        this.year = year;
        this.speed = speed;
    }

    public Auto(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    public Auto(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}
