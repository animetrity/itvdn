package main.java.java_1_Starter.lesson_9.task_6;

public class ArrayLesson {
    public static void main(String[] args) {
        int[] list1 = new int[]{1,2,3};
        int[] list2 = new int[]{2,4,6};
        int[] sum = sum(list1,list2);

        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
        }
    }

    public static int[] sum(int[] list1, int[] list2){
        int[] sum = new int[3];
        for (int i = 0; i < sum.length; i++) {
            sum[i] = list1[i] + list2[i];
        }
        return sum;
    }
}
