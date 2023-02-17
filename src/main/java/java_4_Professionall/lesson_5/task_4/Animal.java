package main.java.java_4_Professionall.lesson_5.task_4;

import java.io.Serializable;

public class Animal  implements Serializable {
private int age =  5;
protected String name = "test";
public int year = 1995;

@Override
public String toString() {
	return "Animal{" +
			"age=" + age +
			", name='" + name + '\'' +
			", year=" + year +
			'}';
}
}
