package main.java.java_3_Essential.lesson_3.task_6;

public class PrinterGreen extends Printer{
    private final String GREEN = "\u001B[32m";
    @Override
    void print(String value) {
        super.print(GREEN + value + DEFAULT);
    }
}
