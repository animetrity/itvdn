package main.java.java_1_Starter.lesson_9.task_4;

public class UserArray {
    public static void main(String[] args) {
        int[] list = new int[]{1,2,3,4,5,6,7,8,9,10};
        list = add(list);
        list = addValue(list, 15);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

    }
    public static int[] add(int[] array){
        int[] arrayNew = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            arrayNew[i] = array[i];
        }
        return arrayNew;
    }
    public static int[] addValue(int[] array, int value){
        int[] arrayNew = new int[array.length + 1];
        arrayNew[0] = value;
        for (int i = 0; i < array.length; i++) {
            arrayNew[i+1] = array[i];
        }
        return arrayNew;
    }
}
