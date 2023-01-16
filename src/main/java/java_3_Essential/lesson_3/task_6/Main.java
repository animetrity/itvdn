package main.java.java_3_Essential.lesson_3.task_6;

public class Main {
    public static void main(String[] args) {
        Printer[] printers = new Printer[]{
                new PrinterBlue(),
                new PrinterGreen(),
                new PrinterYellow(),
                new Printer()
        };

        for (int i = 0; i < printers.length; i++) {
            printers[i].print("some text");
        }


    }
}
