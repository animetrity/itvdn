package main.java.java_3_Essential.lesson_3.task_2.version_1;

public class Main {
    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom(
                new BadPupil(),
                new ExecelentPupil(),
                new GoodPupil(),
                new ExecelentPupil()
        );

        for (int i = 0; i < classRoom.pupils.size(); i++) {
            classRoom.pupils.get(i).read();
            System.out.println(classRoom.pupils.get(i).getClass());
            classRoom.pupils.get(i).relax();
            classRoom.pupils.get(i).write();
            classRoom.pupils.get(i).study();

        }

    }
}
