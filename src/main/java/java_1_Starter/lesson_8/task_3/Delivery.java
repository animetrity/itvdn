package main.java.java_1_Starter.lesson_8.task_3;

public class Delivery {
    public static void main(String[] args) {
        System.out.println(factorial(10));
        /*
        Рекурсія небезпечна тим шо заповнює кожною ітерацією стек і поступово вивільняє його тоді коли остання ітерація не запустить
        наступний етап рекурсії, відповідно вивільнення почнеться в зворотньому напрямку
        небезпека в тому що стек може заповнитись що безумовно призведе до помилок нехватки пам'яті.
         */
    }
    public static double factorial(int factorial){
        if(factorial > 0){
            return factorial * factorial(factorial -1);
        }else if(factorial == 0){
            return 1;
        }else{
            return 0;
        }
    }
}
