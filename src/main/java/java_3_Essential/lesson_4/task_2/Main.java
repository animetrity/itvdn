package main.java.java_3_Essential.lesson_4.task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
     public static void main(String[] args) {
         AbstractHandler abstractHandler;
         String format;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть формат: 'DOC', 'TXT', XML");
        try {
            format = bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        abstractHandler = getFormatObject(format);

        if (abstractHandler == null){
            System.out.println("Хибний формат - завершення програми...");
            return;
        }
        abstractHandler.create();
        abstractHandler.open();
        abstractHandler.change();
        abstractHandler.save();



    }
    private static AbstractHandler getFormatObject(String format){
        return switch (format) {
            case "DOC" -> new DOCHandler();
            case "TXT" -> new TXTHandler();
            case "XML" -> new XMLHandler();
            default -> null;
        };
    }
}
