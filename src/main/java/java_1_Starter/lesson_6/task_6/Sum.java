package java_1_Starter.lesson_6.task_6;

public class Sum {
    public static void main(String[] args) {
        int n = 10;
        double result = 0.0d;

        for (int i = 1; i <= n; i++) {
            if(i==1)result += 1;
            result += (double) 1 / factorial(i);
        }
        System.out.println(result);
    }
    public static int factorial(int number){
        int factorial = 1;
        int i = 0;
        do {
            i++;
            factorial *= i;
        }while(i < number);
        return factorial;
    }
}
