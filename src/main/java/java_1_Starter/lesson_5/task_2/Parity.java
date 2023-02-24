package java_1_Starter.lesson_5.task_2;

public class Parity {
    public static void main(String[] args) {
        for (int i = -20; i < 50; i++) {
            System.out.print(option1(i));
            System.out.print(" | ");
            System.out.println(option2(i));
        }

    }
    public static String option1(int number){
        if(number % 2 == 0)return "Число "+ number +" парне";
        return "Число "+ number +" непарне";
    }
    public static String option2(int number){
        if((number & 1) == 0)return "Число "+ number +" парне";
        return "Число "+ number +" непарне";
    }
}
