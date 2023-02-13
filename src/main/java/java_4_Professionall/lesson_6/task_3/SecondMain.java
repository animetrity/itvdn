package main.java.java_4_Professionall.lesson_6.task_3;

/**
 * @author Anatolii Kosiuta
 * @version 1.0
 */
public class SecondMain extends Main{


public static void main(String[] args) {
	SecondMain secondMain = new SecondMain();
	System.out.println(secondMain.getAge());
}
public int getAge() {
	return SecondMain.class
			.getAnnotation(User.class).age();
}
}
