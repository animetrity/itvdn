package main.java.java_3_Essential;

public class Test{

    public static void main(String[] args) {
        char i;
        LOOP: for(i = 0; i < 5; i++){
            for (int j = 0; j < 10; j++) {
                if(j==i){
                    System.out.println("count " + j);
                    break ;
                }
            }
            switch (i++){
                case '0':
                    System.out.println("A");
                case 1:
                    System.out.println("B");
                    break LOOP;
                case 2:
                    System.out.println("C");
                    break;
                case 3:
                    System.out.println("D");
                    break;
                case 4:
                    System.out.println("E");
                case 'E':
                    System.out.println("F");
            }
        }

    }

}
