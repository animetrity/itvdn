package main.java.java_3_Essential.lesson_3.task_4;

import java.util.Scanner;

public class Main {
    private static String keyPro = "11111";
    private static String keyExpert = "22222";
    private static DocumentWorker documentWorker;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Доброго дня, введіть ключ доступу, або натисніть \"Enter\".");
        String inText = "";

        inText = scanner.nextLine();
        setDocumentWorker(inText);
        for(int i = 0; true; i++){

            System.out.println("Доступний список команд:" +
                    " </key 'ваш новий ключ'>" +
                    " <open>" +
                    " <edit>" +
                    " <save>" +
                    " <exit>"
            );
            String text  = scanner.nextLine();
            if(text.equals("exit")){
                System.out.println("Вихід з програми.");
                return;
            }else if(text.toLowerCase().contains("key")){
                String[] keyNew = text.split(" ");
                if(keyNew.length>=2){
                    setDocumentWorker(keyNew[1]);
                }else {
                    System.out.println("Через пробіл потрібно написати Ваш ключ");
                }
            }else if(text.toLowerCase().contains("open")){
                documentWorker.openDocument();
            }else if(text.toLowerCase().contains("edit")){
                documentWorker.editDocument();
            }else if(text.toLowerCase().contains("save")){
                documentWorker.saveDocument();
            }

        }
    }
    public static void setDocumentWorker(String inText){
        if(inText.equals(keyPro)){
            System.out.println("Відкритий Про доступ");
            documentWorker = new ProDocumentWorker();
        }else if(inText.equals(keyExpert)){
            System.out.println("Відкритий Експерт доступ");
            documentWorker = new ExpertDocumentWorker();
        }else if(inText.equals("")){
            System.out.println("Відкритий базовий доступ");
            documentWorker = new DocumentWorker();
        }else{
            System.out.println("Ключ не підходить.");
            documentWorker = new DocumentWorker();
        }
    }
}
