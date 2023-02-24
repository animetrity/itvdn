package java_1_Starter.lesson_5.task_3;

public class LogicOperations {
    public static void main(String[] args) {
        int x = 5, y = 10, z = 15;
        x += y >> x++ * z;
        System.out.println(x);
        z = ++x & y * 5;
        System.out.println(z);
        y /= x + 5 | z;
        System.out.println(y);
        z = x++ & y * 5;
        System.out.println(z);
        x = y << x++ ^ z;
        System.out.println(x);

        System.out.println("Ітого");
        System.out.println("x = " + x + "\ny = " + y + "\nz = " + z);
    }
}
