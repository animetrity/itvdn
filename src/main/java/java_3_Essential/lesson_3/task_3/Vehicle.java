package main.java.java_3_Essential.lesson_3.task_3;

public class Vehicle {
    protected int x;
    protected int y;
    protected int price;
    protected int speed;
    protected int year;

    public Vehicle(int x, int y, int price, int speed, int year) {
        this.x = x;
        this.y = y;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "x=" + x +
                ", y=" + y +
                ", price=" + price +
                ", speed=" + speed +
                ", year=" + year +
                '}';
    }
}
