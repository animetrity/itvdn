package main.java.java_3_Essential;

class Super{
    static  String ID = "ID";
}
class  Sub extends Super{
    static {
        System.out.println("In Sub");
    }
    static  void m(){

    }
}
public class Test2 {
    public static void main(String[] args) {
        System.out.println(Sub.ID);
        Sub.m();
    }

}
