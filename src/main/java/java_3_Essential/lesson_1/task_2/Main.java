package java_3_Essential.lesson_1.task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Введіть сторону \"side1\"");
        rectangle.setSide1(scanner.nextInt());

        System.out.println("Введіть сторону \"side2\"");
        rectangle.setSide2(scanner.nextInt());

        System.out.println("Площа прямокутника = " + rectangle.areaCalculator(rectangle.getSide1(), rectangle.getSide2()));
        System.out.println("Периметр прямокутника = " + rectangle.perimeterCalculator(rectangle.getSide1(), rectangle.getSide2()));
    }
}
