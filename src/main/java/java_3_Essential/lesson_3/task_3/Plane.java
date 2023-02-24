package java_3_Essential.lesson_3.task_3;

public class Plane extends Vehicle{
    private int height;
    private int countPeople;

    public Plane(int x, int y, int price, int speed, int year, int height, int countPeople) {
        super(x, y, price, speed, year);
        this.height = height;
        this.countPeople = countPeople;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "height=" + height +
                ", countPeople=" + countPeople +
                ", x=" + x +
                ", y=" + y +
                ", price=" + price +
                ", speed=" + speed +
                ", year=" + year +
                '}';
    }
}
