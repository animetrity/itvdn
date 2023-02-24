package java_4_Professionall.lesson_3.task_3;

public class Main {
    public static void main(String[] args) {
        String text = "With the new Oracle Applications Platform, partners and customers can easily build unique applications with the Redwood UX underpinnings of Oracle Fusion Applications.";
        String textFrist = text.substring(0,text.length()/2);
        String textSecond = text.substring(text.length()/2);
        System.out.println(textFrist);
        System.out.println(textSecond);
    }
}
