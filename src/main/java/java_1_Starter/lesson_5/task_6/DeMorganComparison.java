package java_1_Starter.lesson_5.task_6;

public class DeMorganComparison {
    public static void main(String[] args) {
        boolean a = true, b = false;
        System.out.println(a | b);
        System.out.println(!(!a & !b));
    }
}
