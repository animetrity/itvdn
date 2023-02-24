package java_4_Professionall.lesson_3.task_2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("/home/logrog/IdeaProjects/itvdn/src/main/java/java_4_Professionall/lesson_3/task_2/file.txt")){
            fileWriter.write("random text");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedReader br = new BufferedReader(new FileReader("/home/logrog/IdeaProjects/itvdn/src/main/java/java_4_Professionall/lesson_3/task_2/file.txt"))){
            for (String text;(text = br.readLine()) != null;) {
                System.out.println(text);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
