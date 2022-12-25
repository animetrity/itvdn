package main.java.java_3_Essential.lesson_1.task_3;

public class Content {
    private String text;

    public void show(){
        System.out.println("Зміст = " + this.text);
    }
    public Content(String text){
        this.text = text;
    }
}
