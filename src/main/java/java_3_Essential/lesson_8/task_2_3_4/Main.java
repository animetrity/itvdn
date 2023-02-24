package java_3_Essential.lesson_8.task_2_3_4;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120, "AB1234567CD");
        Monitor monitor1 = new Monitor("Samsung", 120, "AB1234567CD",1280,1024);
        Monitor monitor2 = new Monitor("Samsung", 120, "AB1234567CD",1280,1024);
        System.out.println(device);
        System.out.println(monitor1);
        System.out.println(monitor2);
        System.out.println();
        System.out.println("Порівняння по equals = " + monitor1.equals(monitor2));
        System.out.println("Порівняння по хешкоду = " + (monitor1.hashCode() == monitor2.hashCode()));
    }
}
