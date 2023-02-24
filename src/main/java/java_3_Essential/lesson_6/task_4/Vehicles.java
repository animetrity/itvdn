package java_3_Essential.lesson_6.task_4;

public enum Vehicles {
    BLUE(25000),
    RED(29000),
    GREEN(24000),
    BLACK(30000)

    ;

    int price;

    Vehicles(int price){
        this.price = price;
    }

    String getColor(){
        return this.name();
    }

    @Override
    public String toString() {
        return "Назва классу = "+ this.getClass().getSimpleName() +"\n" +
                "Колір = " + this.name()+ "\n" +
                "ціна = " + price + "\n"
                ;
    }
}
