package main.java.java_3_Essential.lesson_3.task_3;

public class PrinterBlue extends Printer{
    private final String BLUE = "\u001B[34m";
    @Override
    void print(String value) {
        super.print(BLUE + value + DEFAULT);
    }
}
