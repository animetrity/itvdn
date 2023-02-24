package java_3_Essential.lesson_5.task_6;

public class Teacher {
    public String name;
    public int bal;
    public Teacher(String name, int bal){
        this.bal = bal;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher " +
                "name='" + name + '\'' +
                ", bal=" + bal;
    }
}
