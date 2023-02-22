package java_4_Professionall.lesson_8.task_2;

public class ThirdThread  implements Runnable {
@Override
public void run() {
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		throw new RuntimeException(e);
	}
	System.out.println(this.getClass().getSimpleName() + " - Завершився!");
}
}
