package java_4_Professionall.lesson_8.task_3;

public class PriorityThread implements Runnable{
@Override
public void run() {
	for (int i = 0; i < 50; i++) {
		System.out.println(Thread.currentThread().getName() + " - " + i);
	}
}
}
