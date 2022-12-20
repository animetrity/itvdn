package main.java.course_1.lesson_4.task_8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        Map<String,String> translateList = new HashMap<>();
        translateList.put("злива","shower");
        translateList.put("вітер","wind");
        translateList.put("хуртовина","blizzard");
        translateList.put("буревій","hurricane");
        translateList.put("ожеледь","icicle");
        translateList.put("туман","fog");
        translateList.put("сніг","snow");
        translateList.put("спека","heat");
        translateList.put("град","hail");
        translateList.put("опади","precipitation");
        Scanner scanner = new Scanner(System.in);
        String textToTranslate = scanner.next();
        System.out.println(translateList.getOrDefault(textToTranslate.toLowerCase(), "Такого слова немає"));


    }
}
