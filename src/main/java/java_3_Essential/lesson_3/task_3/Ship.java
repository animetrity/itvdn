package java_3_Essential.lesson_3.task_3;

public class Ship extends Vehicle{
    private int countPeople;
    private String fromPort;

    public Ship(int x, int y, int price, int speed, int year, int countPeople, String fromPort) {
        super(x, y, price, speed, year);
        this.countPeople = countPeople;
        this.fromPort = fromPort;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "countPeople=" + countPeople +
                ", fromPort='" + fromPort + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", price=" + price +
                ", speed=" + speed +
                ", year=" + year +
                '}';
    }
}
