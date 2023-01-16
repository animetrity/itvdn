package main.java.java_3_Essential.lesson_3.task_6;

public class PrinterYellow extends Printer{
    private final String YELLOW = "\u001B[33m";
    @Override
    void print(String value) {
        super.print(YELLOW + value+ DEFAULT);
    }
}
