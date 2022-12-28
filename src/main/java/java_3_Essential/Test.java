package main.java.java_3_Essential;

public class Test {
    public static void main(String[] args) {
        System.out.println("Програма пройшла компіляцію і успішно запустилась");
        Test test = new Test();
        //test.testInt();
        test.req(0);
    }

    public void req(int a){
        if (a > 10)return;
        else {

            System.out.println(a);
            req(a+1);
        }
    }
    public void testInt(){
        Integer i = null;
        if(i == 0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
