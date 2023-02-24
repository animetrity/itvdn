package java_3_Essential.lesson_1.task_5;

public class Main {
    public static void main(String[] args) {

        Address address = new Address();
        address.setIndex(56299);
        address.setCountry("Україна");
        address.setCity("Львів");
        address.setStreet("Шевченка");
        address.setHouse("45Б");
        address.setApartment("5/2");

        System.out.println(address.getCountry() + ", " +
                "місто " + address.getCity() + "(" + address.getIndex() + "), " +
                "вул. " + address.getStreet() + ", " +
                "дім " + address.getHouse() + ", " +
                "квартира " + address.getApartment());
    }
}
