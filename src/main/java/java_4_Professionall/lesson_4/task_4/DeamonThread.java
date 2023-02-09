package main.java.java_4_Professionall.lesson_4.task_4;

public class DeamonThread implements Runnable{

@Override
public void run() {
	System.out.println("Потік демон стартував.");
	for (int i = 0; i < 10; i++) {
		System.out.println("Потік працює..." + i);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
}
