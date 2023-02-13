package main.java.java_4_Professionall.lesson_5.task_3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
final static String COLORRED = (char) 27 + "[31m";
final static String COLORDEFAULT = (char) 27 + "[39m";
final static String COLORBLUE = (char) 27 + "[34m";
public static void main(String[] args) {
	Class clazz = User.class;

	/*Поля*/
	System.out.println(COLORRED + "Поля:" + COLORDEFAULT);

	Field[] fields = clazz.getDeclaredFields();

	for (Field field : fields) {
		Class fieldType = field.getType();
		System.out.println(COLORBLUE + "\tНазва: " + COLORDEFAULT + field.getName());
		System.out.println(COLORBLUE + "\tТип: " + COLORDEFAULT + fieldType.getName());
		System.out.println(COLORBLUE + "\tМодифікатори: " + COLORDEFAULT + getModifiers(field.getModifiers()));
	}
	/*Методи*/
	System.out.println(COLORRED + "Методи:" + COLORDEFAULT);
	Method[] methods = clazz.getMethods();
	for (Method method : methods) {
		System.out.println(COLORRED + "Назва: " + COLORDEFAULT + method.getName());
		System.out.println(COLORBLUE + "\tПовертаємий тип: " + COLORDEFAULT + method.getReturnType().getName());
		System.out.println(COLORBLUE + "\tМодифікатори: " + COLORDEFAULT + getModifiers(method.getModifiers()));
		Class[] paramTypes = method.getParameterTypes();
		System.out.print(COLORBLUE + "\tТипи параметрів: " + COLORDEFAULT);
		for (Class<?> paramType : paramTypes) {
			System.out.print(" " + paramType.getName());
		}
		System.out.println();
	}


	/*Конструктори*/
	System.out.println(COLORRED + "Конструктори:" + COLORDEFAULT);

	Constructor[] constructors = clazz.getConstructors();
	for (Constructor ctr : constructors) {
		System.out.println(COLORRED + "Назва: " + COLORDEFAULT + ctr.getName());
		System.out.println(COLORBLUE + "Модифікатори: " + COLORBLUE + getModifiers(ctr.getModifiers()));
		Class[] paramTypes = ctr.getParameterTypes();
		System.out.print(COLORBLUE + "\tТипи параметрів: " + COLORDEFAULT);
		for (Class paramType : paramTypes) {
			System.out.print(paramType.getName() + " ");
		}
		System.out.println();
	}

}
public static String getModifiers(int mods){
	String modifier = "";
	if (Modifier.isPrivate(mods))
		modifier += "private ";
	else if (Modifier.isProtected(mods))
		modifier += "protected ";
	else if (Modifier.isPublic(mods))
		modifier += "public ";
	else
		modifier += "default ";
	if (Modifier.isAbstract(mods))
		modifier += "abstract ";
	if (Modifier.isFinal(mods))
		modifier += "final ";
	return modifier;
}
}
