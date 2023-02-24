package java_4_Professionall.lesson_9.task_4;

public class Calculate {
	public static void main(String[] args) {
		Calc add = (a,b) -> a + b;
		Calc sub = (a,b) -> a - b;
		Calc mul = (a,b) -> a * b;
		Calc div = (a,b) -> (double) a / b;

		int a = 5;
		int b = 10;

		System.out.println("Додавання = " + a + " і " + b + " = " + (int)add.calculate(a,b));
		System.out.println("Віднімання = " + a + " і " + b + " = " + (int)sub.calculate(a,b));
		System.out.println("Множення = " + a + " і " + b + " = " + (int)mul.calculate(a,b));
		System.out.println("Ділення = " + a + " і " + b + " = " + div.calculate(a,b));

	}
}
interface Calc {
	double calculate(int a, int b);
}
