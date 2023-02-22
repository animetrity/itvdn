package java_4_Professionall.lesson_8.task_2;

public class FirstThread implements Runnable{
@Override
public void run() {
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		throw new RuntimeException(e);
	}
	System.out.println(this.getClass().getSimpleName() + " - Завершився!");
}
}
