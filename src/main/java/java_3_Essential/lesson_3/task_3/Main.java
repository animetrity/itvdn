package main.java.java_3_Essential.lesson_3.task_3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(34543,556546,5000,120,1995);
        Plane plane = new Plane(6756,456456,7000,350,2000,50,10);
        Ship ship = new Ship(12312,765676,20000,150,2005,50,"NewYork port");

        System.out.println(car);
        System.out.println(plane);
        System.out.println(ship);
    }
}
