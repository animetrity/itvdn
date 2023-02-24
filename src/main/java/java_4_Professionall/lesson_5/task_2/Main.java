package java_4_Professionall.lesson_5.task_2;

import java.lang.reflect.Member;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	try {
		System.out.println("Введіть назву класу:");
		Class clazz = Class.forName(new Scanner(System.in).nextLine());/*java.lang.String*/
		System.out.println(clazz);
		printInfo(clazz.getFields());
		printInfo(clazz.getConstructors());
		printInfo(clazz.getMethods());
	} catch (ClassNotFoundException e) {
		System.out.println("Невідомий клас:" + args[0]);
	}
}
private static void printInfo(Member[] members) {
	for (int i = 0; i < members.length; i++) {
		if (members[i].getDeclaringClass() == Object.class)
			continue;
		String decl = members[i].toString();
		System.out.print("   ");
		System.out.println(decl);
	}
}
}
