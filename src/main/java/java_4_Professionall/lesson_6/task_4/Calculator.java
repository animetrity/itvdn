package java_4_Professionall.lesson_6.task_4;
public class Calculator {

public static void main(String[] args) throws NoSuchMethodException {
	Calculator calculator = new Calculator();

	Math math = calculator
			.getClass()
			.getMethod("mathSum", int.class, int.class)
			.getAnnotation(Math.class);

	calculator.mathSum(math.num1(), math.num2());
}
@Math(num1 = 100, num2 = 200)
public void mathSum(int num1, int num2) {
	int result = num1 + num2;
	System.out.println("Результат додавання " + num1 + " і " + num2 + " дорівнює " + result);
}

}