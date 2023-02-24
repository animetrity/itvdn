package java_4_Professionall.lesson_6.task_2;
/**
 * @author Anatolii Kosiuta
 * @version 1.0
 */

public class Calculator {
/**
 * Перший параметр калькулятора.
 */
private int firstParametr;
/**
 * Другий параметр калькулятора.
 */
private int secondParametr;

/**
 * Пустий конструктор без ініціалізації.
 */

public Calculator(){

}

/**
 * Конструктор - ініціалізація перемінних об'єкту.
 *
 * @param firstParametr Перший параметр, який буде призначено відвовідній змінній.
 * @param secondParametr Другий параметр, який буде призначено відвовідній змінній.
 */
@CalculatorParams(firstParam = 2, secondParam = 5)
public Calculator(int firstParametr, int secondParametr){
	this.firstParametr = firstParametr;
	this.secondParametr = secondParametr;
}

/**
 * Метод для сумування двох доданків.
 *
 * @return повертає сумму доданків.
 */
public int sum(){
	return firstParametr + secondParametr;
}

}
