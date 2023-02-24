package java_3_Essential.lesson_4.task_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Player implements Playable, Recodable{
    ArrayList<String> music = new ArrayList<>();
    @Override
    public void play() {
        if(music.size() == 0) System.out.println("Немає записаної музики");
        else {
            for (int i = 0; i < music.size(); i++) {
                System.out.println("Грає музика... - " + music.get(i));
            }
        }
    }

    @Override
    public void record() {
        System.out.println("Запис ввімкнено, вводьте текст, щоб зупинити, напишіть команду 'stop'");
        Scanner scanner = new Scanner(System.in);
        String text;
        while (true){
            text = scanner.nextLine();
            if(text.toLowerCase().equals("stop")) {
                stop();
                break;
            }
            else if(text.toLowerCase().equals("pause")){
                pause();
                break;
            }
            music.add(text);
        }
    }

    @Override
    public void pause() {
        System.out.println("Пауза 10");
    }

    @Override
    public void stop() {
        System.out.println("Зупинено.");
    }
}
