package java_3_Essential.lesson_3.task_3;

public class Car extends Vehicle{
    public Car(int x, int y, int price, int speed, int year) {
        super(x, y, price, speed, year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "x=" + x +
                ", y=" + y +
                ", price=" + price +
                ", speed=" + speed +
                ", year=" + year +
                '}';
    }
}
