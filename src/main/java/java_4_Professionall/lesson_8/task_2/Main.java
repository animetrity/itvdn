package java_4_Professionall.lesson_8.task_2;

public class Main {
public static void main(String[] args) {
	Thread thirdThread = new Thread(new ThirdThread());
	Thread secondThread = new Thread(new SecondThread());
	Thread firstThread = new Thread(new FirstThread());

	thirdThread.start();
	secondThread.start();
	firstThread.start();
}
}
