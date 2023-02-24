package java_1_Starter.lesson_9.task_7;

public class Arrays {
    public static void main(String[] args) {
        int[] list = new int[]{1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[list.length - 1 -i]);
        }

    }
}
