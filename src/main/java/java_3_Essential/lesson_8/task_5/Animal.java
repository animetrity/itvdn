package main.java.java_3_Essential.lesson_8.task_5;

public class Animal {
    String name;
    int age;
    boolean tail;

    @Override
    public String toString() {
        return
                "Ім'я: " + name +
                ", вік: " + age +
                ", хвіст: " + (tail?"так":"ні")
                ;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        if (!name.equals(animal.name)) return false;
        if (age != animal.age) return false;
        if (tail != animal.tail) return false;
        return true;
    }
    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (name == null ? 0 : name.hashCode());
        result = 37 * result + age;
        result = 37 * result + (tail ? 1 : 0);

        return result;
    }
}
