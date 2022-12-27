package main.java.forWork;

import java.io.*;
import java.util.ArrayList;

public class FromWork {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> inLeads = new ArrayList<>();
        ArrayList<String> inLeadsCreate = new ArrayList<>();
        ArrayList<String> inPays = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> resultLeadsCreate = new ArrayList<>();

        BufferedReader brInLeads = new BufferedReader(new FileReader(new File("/home/logrog/IdeaProjects/itvdn/src/main/java/java_3_Essential/lesson_2/inLeads.txt")));
        BufferedReader brInLeadsCreate = new BufferedReader(new FileReader(new File("/home/logrog/IdeaProjects/itvdn/src/main/java/java_3_Essential/lesson_2/inLeadsCreate.txt")));
        BufferedReader brInPays = new BufferedReader(new FileReader(new File("/home/logrog/IdeaProjects/itvdn/src/main/java/java_3_Essential/lesson_2/inPays.txt")));

        for (int i = 0; true; i++) {
            String text;
            try {
                text = brInLeads.readLine();
                if(text != null && text != "")inLeads.add(text);
                else break;
            } catch (IOException e) {
                break;
            }

        }
        for (int i = 0; true; i++) {
            String text;
            try {
                text = brInLeadsCreate.readLine();
                if(text != null && text != "")inLeadsCreate.add(text);
                else break;
            } catch (IOException e) {
                break;
            }

        }
        for (int i = 0; true; i++) {
            String text;
            try {
                text = brInPays.readLine();
                if(text != null && text != "")inPays.add(text);
                else break;
            } catch (IOException e) {
                break;
            }

        }
        for (int i = 0; i < inPays.size(); i++) {
            for (int j = 0; j < inLeads.size(); j++) {
                if(inLeads.get(j).contains(inPays.get(i))){
                    result.add(inLeads.get(j) + "_|_" + inPays.get(i) + "\n");
                    resultLeadsCreate.add(inLeadsCreate.get(j) + "\n");
                    break;
                }
                else if(j == inLeads.size() - 1) {
                    result.add("\n");
                    resultLeadsCreate.add("\n");
                }
            }
        }
        ///

        FileWriter fileWriter;
        try {
             fileWriter = new FileWriter(new File("/home/logrog/IdeaProjects/itvdn/src/main/java/java_3_Essential/lesson_2/result.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < result.size(); i++) {
            try {
                fileWriter.write(result.get(i));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        FileWriter fileWriter1;
        try {
            fileWriter1 = new FileWriter(new File("/home/logrog/IdeaProjects/itvdn/src/main/java/java_3_Essential/lesson_2/resultLeadsCreate.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < resultLeadsCreate.size(); i++) {
            try {
                fileWriter1.write(resultLeadsCreate.get(i));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            fileWriter1.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fileWriter1.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
