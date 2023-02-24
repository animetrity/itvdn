package java_3_Essential.lesson_4.task_2;

public class TXTHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("Відкритий формат 'TXT'");
    }

    @Override
    void create() {
        System.out.println("Створений формат 'TXT'");
    }

    @Override
    void change() {
        System.out.println("Змінений формат 'TXT'");
    }

    @Override
    void save() {
        System.out.println("Збережений формат 'TXT'");
    }
}
