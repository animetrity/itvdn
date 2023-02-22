package java_4_Professionall.lesson_8.task_6;

import java.util.concurrent.Semaphore;

/**
 * тут використано Semaphore для уникнення взаємного блокування
 */
public class LockMain2 {
public static void main(String[] args) {
	Semaphore semaphore = new Semaphore(1);

	FirstSemaphoreThread firstThread = new FirstSemaphoreThread(semaphore);
	SecondSemaphoreThread secondThread = new SecondSemaphoreThread(semaphore);

	firstThread.start();
	secondThread.start();
}
}
class FirstSemaphoreThread extends Thread {
private final Semaphore semaphore;

public FirstSemaphoreThread(Semaphore semaphore) {
	this.semaphore = semaphore;
}

@Override
public void run() {
	System.out.println("FirstThread is start");
	try {
		semaphore.acquire();
		Thread.sleep(1000);
		semaphore.release();
	} catch (InterruptedException e) {
		Thread.currentThread().interrupt();
		e.printStackTrace();
	}
	System.out.println("FirstThread is finish");
}
}
class SecondSemaphoreThread extends Thread {
private final Semaphore semaphore;
public SecondSemaphoreThread(Semaphore semaphore) {
	this.semaphore = semaphore;
}
@Override
public void run() {
	System.out.println("SecondThread is start");
	try {
		semaphore.acquire();
		Thread.sleep(1000);
		semaphore.release();
	} catch (InterruptedException e) {
		Thread.currentThread().interrupt();
		e.printStackTrace();
	}
	System.out.println("SecondThread is finish");
}
}
