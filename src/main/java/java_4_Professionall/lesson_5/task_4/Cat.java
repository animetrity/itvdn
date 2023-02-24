package java_4_Professionall.lesson_5.task_4;

import java.lang.reflect.Field;

public class Cat {
public static void main(String[] args) {
	try {
		Class clazz = Animal.class;
		Animal animal = new Animal();
		Field age = clazz.getDeclaredField("age");
		Field name = clazz.getDeclaredField("name");
		Field year = clazz.getDeclaredField("year");
		age.setAccessible(true);
		//name.setAccessible(true);
		//year.setAccessible(true);
		age.setInt(animal, 10);
		name.set(animal,"Name");
		year.setInt(animal, 2000);
		System.out.println("Перемінна age: " + age.getInt(animal));
		System.out.println("Перемінна name: " + name.get(animal));
		System.out.println("Перемінна year: " + year.getInt(animal));
	} catch (Exception ex) {
		ex.printStackTrace();
	}
}
}
