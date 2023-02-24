package java_3_Essential.lesson_9.task_3;

public class Main {
    public static void main(String[] args) throws Exception {
        MyDictionary<String, String> list = new MyDictionary<>();

        list.add("Іванов", "Петро");
        list.add("Штереб", "Андрій");
        list.add("Коцай", "Оксана");
        list.add("Васильєв", "Олександр");

        System.out.println(list.size());
        System.out.println(list.getValueByIndex(1));
        System.out.println(list.getValueByKey("фамілія"));
    }
}
