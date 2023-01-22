package main.java.java_3_Essential;

public class Test{

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hi";
        System.out.println(s1==s2);
        s1 += 1;
        s2 += 1;
        System.out.println(String.format("hel = %s and hi = %s", s1,s2));

    }

}
