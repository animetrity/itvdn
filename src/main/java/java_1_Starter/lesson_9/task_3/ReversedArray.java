package java_1_Starter.lesson_9.task_3;

public class ReversedArray {
    public static void main(String[] args) {
        int[] list = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] list1;
        int[] list2;

        list1 = myReverse(list);
        System.out.print("Массив після myReverse:");
        for (int i = 0; i < list1.length; i++) {
            System.out.print(" " + list1[i]);
        }
        System.out.print("\n");

        list2 = subArray(list,5,10);
        System.out.print("Массив після subArray:");
        for (int i = 0; i < list2.length; i++) {
            System.out.print(" " + list2[i]);
        }
    }
    public static int[] myReverse(int [] array){
        int[] arrayNew = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayNew[array.length - 1 - i] = array[i];
        }
        return arrayNew;
    }
    public static int[] subArray(int[] array, int index, int count){
        int[] arrayNew = new int[count];
        for (int i = 0; i < count; i++) {
            if(index + i < array.length){
                arrayNew[i] = array[index + i];
            }
            else{
                arrayNew[i] = 1;
            }
        }
        return arrayNew;
    }
}
