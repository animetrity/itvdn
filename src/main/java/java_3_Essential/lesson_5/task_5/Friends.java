package java_3_Essential.lesson_5.task_5;

import java.util.ArrayList;
import java.util.Collections;

public class Friends {
    ArrayList<String> friends = new ArrayList<>();
    {
        friends.add("Василь");
        friends.add("Олег");
        friends.add("Андрій");
        friends.add("Віталік");

        for (int i = 0; i < friends.size(); i++) {
            System.out.println(friends.get(i));
        }
        System.out.println("\nпісля сортування\n");
        Collections.sort(friends);
        for (int i = 0; i < friends.size(); i++) {
            System.out.println(friends.get(i));
        }
    }
}
