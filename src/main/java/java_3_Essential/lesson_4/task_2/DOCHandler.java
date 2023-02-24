package java_3_Essential.lesson_4.task_2;

public class DOCHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("Відкритий формат 'DOC'");
    }

    @Override
    void create() {
        System.out.println("Створений формат 'DOC'");
    }

    @Override
    void change() {
        System.out.println("Змінений формат 'DOC'");
    }

    @Override
    void save() {
        System.out.println("Збережений формат 'DOC'");
    }
}
