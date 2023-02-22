package java_4_Professionall.lesson_8.task_5;

public class DeadLockMain {
	public static void main(String[] args) {
		FirstThread firstThread = new FirstThread();
		SecondThread secondThread = new SecondThread();
		firstThread.setThread(secondThread);
		secondThread.setThread(firstThread);

		firstThread.start();
		secondThread.start();
	}
}
class SecondThread  extends Thread{
private Thread firstThread;
public void setThread(Thread thread){
	this.firstThread = thread;
}
@Override
public void run(){
	System.out.println("SecondThread is start");
	try {
		firstThread.join();
	} catch (InterruptedException e) {
		throw new RuntimeException(e);
	}
	System.out.println("SecondThread is finish");
}
}
class FirstThread extends Thread{
private Thread secondThread;
public void setThread(Thread thread){
	this.secondThread = thread;
}
@Override
public void run(){
	System.out.println("FirstThread is start");
	try {
		secondThread.join();
	} catch (InterruptedException e) {
		throw new RuntimeException(e);
	}
	System.out.println("FirstThread is finish");
}
}