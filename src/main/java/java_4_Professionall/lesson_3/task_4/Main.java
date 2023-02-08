package main.java.java_4_Professionall.lesson_3.task_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("/home/logrog/IdeaProjects/itvdn/src/main/java/java_4_Professionall/lesson_3/task_4/file.txt")){
            fileWriter.write("Якийсь текст");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedReader br = new BufferedReader(new FileReader("/home/logrog/IdeaProjects/itvdn/src/main/java/java_4_Professionall/lesson_3/task_4/file.txt"))){
            for (String text;(text = br.readLine()) != null;) {
                System.out.println(text);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
