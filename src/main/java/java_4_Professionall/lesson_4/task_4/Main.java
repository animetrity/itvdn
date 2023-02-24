package java_4_Professionall.lesson_4.task_4;

public class Main {
public static void main(String[] args) {
	Thread deamonThread = new Thread(new DeamonThread());
	deamonThread.setDaemon(true);
	deamonThread.start();
	System.out.println("Назва - " + deamonThread.getName());
	System.out.println("Чи потік демон? - " + deamonThread.isDaemon());
	System.out.println("Статус - " + deamonThread.getState());
	System.out.println("Чи ще активний? - " + deamonThread.isAlive());

	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		throw new RuntimeException(e);
	}

	System.out.println("Завершуєм програму");

}
}
