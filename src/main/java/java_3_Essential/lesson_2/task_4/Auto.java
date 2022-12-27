package main.java.java_3_Essential.lesson_2.task_4;

public class Auto {
    private int year;
    private double speed;
    private int weight;
    private String color;

    @Override
    public String toString() {
        return "Auto{" +
                "year=" + year +
                ", speed=" + speed +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

    public Auto() {
        this(2022,50.4,1550,"Червоний");
    }

    public Auto(int year) {
        this(year,50.4,1550,"Зелений");
    }

    public Auto(int year, double speed) {
        this(year,speed,1550,"Жовтий");
    }

    public Auto(int year, double speed, int weight) {
        this(year,speed,weight,"Червоний");
    }

    public Auto(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}
