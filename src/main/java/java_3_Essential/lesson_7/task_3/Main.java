package java_3_Essential.lesson_7.task_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Price> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 2; i++) {
            list.add(new Price());
            System.out.println("Введіть назву товару");
            list.get(i).nameProduct = br.readLine();
            System.out.println("Введіть назву магазину");
            list.get(i).nameShop = br.readLine();
            System.out.println("Введіть ціну товару");
            list.get(i).priceUAH = Integer.parseInt(br.readLine());
        }
        list.sort(Comparator.comparing(Price::getNameShop));

        System.out.println("введіть назву магазину для пошуку");
        String nameShop = br.readLine();


       int count = 0;

        for (int i = 0; i < list.size(); i++) {

            if(list.get(i).nameShop.equals(nameShop)){
                System.out.println(list.get(i));
                count++;
            }
        }

        if(count == 0){
            throw new IOException();
        }






    }


}
