package java_3_Essential.lesson_6.task_2;

public enum Animals {
    DOG(5),
    CAT(8),
    MAUSE(2),
    HORSE(3);

    final int age;

    Animals(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Назва классу = "+ this.getClass().getSimpleName() +"\n" +
                "Назва екземпляру = " + this.name()+ "\n" +
                "вік = " + age + "\n"
                ;
    }
}
