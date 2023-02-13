package main.java.java_4_Professionall.lesson_6.task_4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Anatolii Kosiuta
 * @version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface Math {
/**
 * Метод
 * @return повертає перший пераметр.
 */
	int num1();
/**
 * Метод
 * @return повертає другий пераметр.
 */
	int num2();
}
