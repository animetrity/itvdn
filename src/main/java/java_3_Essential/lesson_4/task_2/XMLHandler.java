package java_3_Essential.lesson_4.task_2;

public class XMLHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("Відкритий формат 'XML'");
    }

    @Override
    void create() {
        System.out.println("Створений формат 'XML'");
    }

    @Override
    void change() {
        System.out.println("Змінений формат 'XML'");
    }

    @Override
    void save() {
        System.out.println("Збережений формат 'XML'");
    }
}
