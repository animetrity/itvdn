package java_4_Professionall.lesson_8.task_3;

public class PriorityRunner {
public static void main(String[] args) {
	Thread min = new Thread(new PriorityThread());
	Thread max = new Thread(new PriorityThread());
	Thread norm = new Thread(new PriorityThread());
	min.setName("min ");
	max.setName("max ");
	norm.setName("norm");
	min.setPriority(Thread.MIN_PRIORITY);
	max.setPriority(Thread.MAX_PRIORITY);
	norm.setPriority(Thread.NORM_PRIORITY);

	min.start();
	max.start();
	norm.start();
}
}
