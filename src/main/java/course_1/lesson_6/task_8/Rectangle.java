package main.java.course_1.lesson_6.task_8;

public class Rectangle {
    public static void main(String[] args) {
        int width = 10, height = 7;
        rectangle(width,height);
    }
    public static void rectangle(int width, int height){
        for (int y = 0; y < height; y++) {
            for (int j = 0; j < width; j++) {
                if(j == 0 || y == 0 || j == width - 1 || y == height - 1)System.out.print("*");
                else System.out.print(" ");
                if(j == width - 1) System.out.print("\n");
            }
        }
    }
}
