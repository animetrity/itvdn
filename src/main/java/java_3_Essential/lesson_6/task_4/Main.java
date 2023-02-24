package java_3_Essential.lesson_6.task_4;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < Vehicles.values().length; i++) {
            System.out.println(Vehicles.values()[i]);
        }

        System.out.println(Vehicles.RED.getColor());
    }
}
