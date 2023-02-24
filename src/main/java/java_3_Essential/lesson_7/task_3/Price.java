package java_3_Essential.lesson_7.task_3;

public class Price {
    String nameProduct;
    String nameShop;
    int priceUAH;



    public String getNameShop() {
        return nameShop;
    }

    @Override
    public String toString() {
        return  "nameProduct = " + nameProduct + "\n" +
                "nameShop = " + nameShop + "\n" +
                "priceUAH = " + priceUAH + "\n"
                ;
    }
}
