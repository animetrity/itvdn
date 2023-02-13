package main.java.java_4_Professionall.lesson_6.task_3;

import java.lang.annotation.*;
/**
 * @author Anatolii Kosiuta
 * @version 1.0
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface User {
	int id();
	int age();
}
