package main.java.java_3_Essential;

public class Test {
    public static void main(String[] args) {
        System.out.println("Програма пройшла компіляцію і успішно запустилась");
        Test test = new Test();
        //test.testInt();
        //test.req(0);

    }




    public void req(int a){
        String b = "sdfsdfsdfsdfsdfsdf";
        if (a > 9000){
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return;
        }
        else {

            System.out.println(a);

            req(a+1);
        }

        System.out.println(a);
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
