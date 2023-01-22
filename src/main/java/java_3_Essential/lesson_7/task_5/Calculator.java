package main.java.java_3_Essential.lesson_7.task_5;

public class Calculator {

    public int add(int a, int b){
        return a + b;
    }
    public int sub(int a, int b){
        return a - b;
    }
    public int mul(int a, int b){
        return a * b;
    }
    public double div(int a, int b) throws Exception {
        if(b != 0) return a / (double)b;
        else throw new Exception();

    }
}
