package java_4_Professionall.lesson_9.task_3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	private String author;
	private String title;
	private int year;

	public void getAgeBook() {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Анонімний клас__ Автор: " + author + ", Дата випуску книги: " + year + " Вік книги: " + (LocalDate.now().getYear() - year) + " років");
			}
		};
		runnable.run();

		Runnable runnableLambda = () -> System.out.println("Лямбда вираз__ Автор: " + author + ", Дата випуску книги: " + year + " Вік книги: " + (LocalDate.now().getYear() - year) + " років");
		runnableLambda.run();
	}

}
