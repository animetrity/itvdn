package main.java.java_1_Starter.lesson_9.task_5;

public class ArrayLesson {
    public static void main(String[] args) {
        int[] list1 = new int[]{1,2,3};
        int[] list2 = new int[]{2,4,6};
        int[] sum = new int[3];
        for (int i = 0; i < sum.length; i++) {
            sum[i] = list1[i] + list2[i];
        }

        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
        }
    }
}
