package main.java.java_3_Essential.lesson_1.task_3;

import java.util.Scanner;

public class Book {
    private Author author;
    private Title title;
    private Content content;

    public static void main(String[] args) {

        Book book = new Book();

        book.title.show();
        book.author.show();
        book.content.show();

    }
    public Book(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву книги");
        this.title = new Title(scanner.nextLine());
        System.out.println("Введіть автора книги");
        this.author = new Author(scanner.nextLine());
        System.out.println("Введіть зміст книги");
        this.content = new Content(scanner.nextLine());

    }

}
