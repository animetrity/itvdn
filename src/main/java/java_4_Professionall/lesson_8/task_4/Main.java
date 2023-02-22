package java_4_Professionall.lesson_8.task_4;

public class Main {
volatile public int count = 0;

public static void main(String[] args) {
	Main main = new Main();
	int forCount = 50;
	FirstThread firstThread = new FirstThread(main, forCount);
	SecondThread secondThread = new SecondThread(main, forCount);
	firstThread.start();
	secondThread.start();
}
public synchronized  void counter0(){
	if(count % 2 != 0){
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	System.out.println(Thread.currentThread().getClass().getSimpleName() + "  змінив значення перемінної на " + ++count);
	notify();

}
public synchronized  void counter1(){
	if(count % 2 == 0){
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	System.out.println(Thread.currentThread().getClass().getSimpleName() + " змінив значення перемінної на " + ++count);
	notify();
}
}
