package main.java.java_1_Starter.lesson_8.task_2;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private static Map<Integer,Integer> clientData = new HashMap<>();

    public static void main(String[] args) {
        clientData.putIfAbsent(1,-700);

        money(1,300);
        money(2,200);
        money(1,300);
        money(1,100);
        money(1,300);

    }
    public static void money(int clientId, int pay){
        if(clientData.get(clientId) != null){
            System.out.print("\n");
            status(clientId);
            clientData.put(clientId,clientData.get(clientId) + pay);
            System.out.println("Клієнт_" + clientId + " На рахунок внесена сумма = " + pay);
            status(clientId);
        }
        else {
            System.out.println("\nКлієнт_" + clientId + " Не знайдено такого клієнта, операція відмінена.");
        }
    }
    public static void status(int clientId){
        int clientMoney = clientData.get(clientId);
        if(clientMoney < 0){
            System.out.println("Клієнт_" + clientId + " Сумма заборгованності = " + clientMoney);
        }
        else if(clientMoney > 0){
            System.out.println("Клієнт_" + clientId + " Сумма переплат = " + clientMoney);
        }
        else{
            System.out.println("Клієнт_" + clientId + " Борг відсутній, на Вашому рахунку = " + clientMoney);
        }
    }
}
