package java_1_Starter.lesson_5.task_5;

public class PowerOfTwo {
    public static void main(String[] args) {
        int number = 4;
        //((number > 0) && ((number & (number - 1)) == 0))
        if(number % 2 == 0) System.out.println("Число " + number + " є ступенем 2");
        else System.out.println("Число " + number + " не є ступенем 2");
    }
}
