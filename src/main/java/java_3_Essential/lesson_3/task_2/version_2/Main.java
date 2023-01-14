package main.java.java_3_Essential.lesson_3.task_2.version_2;

public class Main {
    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom(
                new BadPupil(),
                new ExecelentPupil(),
                new GoodPupil()
        );

        for (int i = 0; i < classRoom.pupil.length; i++) {
            classRoom.pupil[i].read();
            classRoom.pupil[i].relax();
            classRoom.pupil[i].write();
            classRoom.pupil[i].study();

        }

    }
}
