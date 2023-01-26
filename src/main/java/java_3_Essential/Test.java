package main.java.java_3_Essential;

import main.java.java_3_Essential.lesson_7.task_2.Worker;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test{

    public static void main(String[] args) throws IOException {


        Worker worker1 = new Worker();
        Worker worker2 = new Worker();

        worker1.year = 12;
        worker2.year = 12;


        System.out.println(worker1.equals(worker2));


    }

}
