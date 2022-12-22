package main.java.course_1.lesson_6.task_3;

public class Printing_Shapes {
    public static void main(String[] args) {
        int number = 10;
        rectangle(number);
        rightTriangle(number);
        equilateralTriangle(number);
        rhombus(number);

    }
    public static void rectangle(int number){
        for (int y = 0; y < number / 2; y++) {
            for (int j = 0; j < number; j++) {
                if(j == 0 || y == 0 || j == number - 1 || y == number / 2 - 1)System.out.print("*");
                else System.out.print(" ");
                if(j == number - 1) System.out.print("\n");
            }
        }
    }
    public static void rightTriangle(int number){
        for (int y = 0, x = 1; y < number; y++, x++) {
            for (int j = 0; j < x; j++) {
                if(j == 0 || j == x - 1 || y == number - 1)System.out.print("*");
                else System.out.print(" ");
                if(j == x-1) System.out.print("\n");
            }
        }
    }
    public static void equilateralTriangle(int number){
        boolean evenNumber = false;
        int notEvenNumber = 0;

        if(number % 2 == 0)evenNumber = true;
        else notEvenNumber = 1;

        int y = number/2 + notEvenNumber;


        for (int i = 0; i < y; i++) {
            for (int j = 0; j < number; j++) {
                if(!(number / 2 + i == j ||  number / 2 - i == j || i == y - 1) || (evenNumber && j == 0))System.out.print(" ");
                else System.out.print("*");
                if(j == number-1) System.out.print("\n");
            }
        }
    }
    public static void rhombus(int number){
        boolean evenNumber = false;
        int notEvenNumber = 0;

        if(number % 2 == 0)evenNumber = true;
        else notEvenNumber = 1;

        int y = number + notEvenNumber;

        for (int i = 0, counter = 0; i < y-1; i++, counter++) {
            for (int j = 0; j < number; j++) {
                if(!(number / 2 + counter == j ||  number / 2 - counter == j || i == y - 1) || (evenNumber && j == 0))System.out.print(" ");
                else if(i != y-1) System.out.print("*");
                if(j == number-1) System.out.print("\n");
            }
            if(i == y / 2 - 1){
                counter = ~counter + 1;
            }
        }
    }

}
