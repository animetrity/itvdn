package main.java.java_4_Professionall.lesson_4.task_2;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Descryptor {
public static void main(String[] args) {

	StringBuilder sb = new StringBuilder();

	Pattern p = Pattern.compile("\\b(біля|без|в|у|від|для|до|з|із|зі|за|над|під|о|об|через)\\b",Pattern.UNICODE_CHARACTER_CLASS);
	Matcher m;

	try (BufferedReader br = new BufferedReader(new FileReader("/home/logrog/IdeaProjects/itvdn/src/main/java/java_4_Professionall/lesson_4/task_2/file.txt"))){
		for (String text;(text = br.readLine()) != null;) {
			m = p.matcher(text);
			text = m.replaceAll( "Java");
			sb.append(text).append("\n");
		}
	} catch (IOException e) {
		throw new RuntimeException(e);
	}

	try (FileWriter fileWriter = new FileWriter("/home/logrog/IdeaProjects/itvdn/src/main/java/java_4_Professionall/lesson_4/task_2/file.txt")){
		fileWriter.write(sb.toString());
	} catch (IOException e) {
		throw new RuntimeException(e);
	}

}
}
