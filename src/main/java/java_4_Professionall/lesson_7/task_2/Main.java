package main.java.java_4_Professionall.lesson_7.task_2;

import main.java.java_4_Professionall.lesson_5.task_4.Animal;

import java.io.*;

public class Main {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/home/logrog/IdeaProjects/itvdn/src/main/java/java_4_Professionall/lesson_7/task_2/output.txt"));
	oos.writeObject(new Animal());
	oos.flush();
	oos.close();

	BufferedReader br = new BufferedReader(new FileReader("/home/logrog/IdeaProjects/itvdn/src/main/java/java_4_Professionall/lesson_7/task_2/output.txt"));
	String text;
	while ((text = br.readLine()) != null){
		System.out.println(text);
	}

	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/home/logrog/IdeaProjects/itvdn/src/main/java/java_4_Professionall/lesson_7/task_2/output.txt"));

	Animal animal = (Animal) ois.readObject();
	System.out.println(animal.toString());
}
}
