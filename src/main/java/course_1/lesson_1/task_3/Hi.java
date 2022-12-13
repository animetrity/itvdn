package main.java.course_1.lesson_1.task_3;

public class Hi {
    public static void main(String[] args) {
        String firstName = "Anatolii";
        String lastName = "Kosiuta";

        Hi hi = new Hi();

        hi.printFirstName(firstName);
        hi.printLastName(lastName);

    }
    public void printFirstName(String text){
        System.out.print(text);
    }
    public void printLastName(String text){
        System.out.print(" " + text);
    }

}
