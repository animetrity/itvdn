package main.java.java_1_Starter.lesson_7.task_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Map<String, Map<String,Double>> conversionData = new HashMap<>();
        conversionData.put("USD",new HashMap<>());
        conversionData.get("USD").put("UAH", 39.9000);
        conversionData.get("USD").put("EUR", 0.941);

        conversionData.put("UAH",new HashMap<>());
        conversionData.get("UAH").put("USD", 40.3500);
        conversionData.get("UAH").put("EUR", 42.4000);

        conversionData.put("EUR",new HashMap<>());
        conversionData.get("EUR").put("USD", 1.0335);
        conversionData.get("EUR").put("UAH", 41.7000);


        String inConv, outConv;
        double sum;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть валюту з якої хочете зробити конвертацію. UAH/USD/EUR");
        inConv = scanner.next();
        System.out.println("Введіть валюту в яку хочете зробити конвертацію. UAH/USD/EUR");
        outConv = scanner.next();
        System.out.println("Введіть сумму грошей для конвертації.");
        sum = scanner.nextDouble();
        double curs = conversionData.getOrDefault(inConv,new HashMap<>()).getOrDefault(outConv,0.0);

        if(sum != 0 && curs != 0.0){
            System.out.println("Результат конвертації з " + sum + " " + inConv + " = " + (sum * curs) + " " + outConv);
        }
        else{
            System.out.println("Введена невірна валюта.");
        }

    }
}
