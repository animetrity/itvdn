package java_3_Essential.lesson_3.task_4;

public class ProDocumentWorker extends DocumentWorker{
    @Override
    public void editDocument() {
        System.out.println("Документ відредаговано");
    }

    @Override
    public void saveDocument() {
        System.out.println("Документ збережено у старому форматі, збереження в інших форматах доступне у серсії Експерт");
    }
}
