package java_4_Professionall.lesson_8.task_6;

import java.util.concurrent.locks.ReentrantLock;


/**
 * У цьому класі використаний клас ReentrantLock для того  щоб уникнути DeadLock
 */
public class LockMain {
	public static void main(String[] args) {
		ReentrantLock lock1 = new ReentrantLock();
		ReentrantLock lock2 = new ReentrantLock();
		FirstLockThread firstLockThread = new FirstLockThread(lock1, lock2);
		SecondLockThread secondLockThread = new SecondLockThread(lock1, lock2);

		firstLockThread.start();
		secondLockThread.start();
	}
}

class FirstLockThread extends Thread {
	private final ReentrantLock lock1;
	private final ReentrantLock lock2;


	public FirstLockThread(ReentrantLock lock1, ReentrantLock lock2) {
		this.lock1 = lock1;
		this.lock2 = lock2;
	}

	@Override
	public void run() {
		System.out.println("FirstThread is start");
		lock1.lock();
		try {
			Thread.sleep(1000);
			lock2.lock();
			try {
				System.out.println("FirstThread is finish");
			} finally {
				lock2.unlock();
			}
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		} finally {
			lock1.unlock();
		}
	}
}

class SecondLockThread extends Thread {
	private final ReentrantLock lock1;
	private final ReentrantLock lock2;

	public SecondLockThread(ReentrantLock lock1, ReentrantLock lock2) {
		this.lock1 = lock1;
		this.lock2 = lock2;
	}

	@Override
	public void run() {
		System.out.println("SecondThread is start");

		lock1.lock();
		try {
			Thread.sleep(1000);
			lock2.lock();
			try {
				System.out.println("SecondThread is finish");
			} finally {
				lock2.unlock();
			}
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		} finally {
			lock1.unlock();
		}
	}
}