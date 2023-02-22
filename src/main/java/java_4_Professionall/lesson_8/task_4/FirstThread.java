package java_4_Professionall.lesson_8.task_4;

public class FirstThread extends Thread{
private Main main;
private int countWork;

public FirstThread(Main main, int countWork) {
	this.main = main;
	this.countWork = countWork;
}

@Override
public void run() {
	for (int i = 0; i < countWork; i++) {
		main.counter0();
	}
}
}
