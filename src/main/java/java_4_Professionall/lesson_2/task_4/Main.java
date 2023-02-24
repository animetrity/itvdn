package java_4_Professionall.lesson_2.task_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> list = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Введіть місто - " + i);
            String city = br.readLine();
            System.out.println("Введіть Фамілію - " + i);
            String lastName = br.readLine();
            list.put(city,lastName);
        }

        System.out.println("Введіть місто:");
        System.out.println(list.getOrDefault(br.readLine(),"Немає такої пари"));

    }
}
