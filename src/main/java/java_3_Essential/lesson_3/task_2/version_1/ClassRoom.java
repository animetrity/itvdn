package main.java.java_3_Essential.lesson_3.task_2.version_1;

import java.util.ArrayList;

public class ClassRoom {
    public ArrayList<Pupil> pupils = new ArrayList<>();

    public ClassRoom(Pupil pupil1){
        pupils.add(pupil1);

    }
    public ClassRoom(Pupil pupil1, Pupil pupil2){
        pupils.add(pupil1);
        pupils.add(pupil2);
    }
    public ClassRoom(Pupil pupil1,Pupil pupil2,Pupil pupil3){
        pupils.add(pupil1);
        pupils.add(pupil2);
        pupils.add(pupil3);
    }
    public ClassRoom(Pupil pupil1,Pupil pupil2,Pupil pupil3,Pupil pupil4){
        pupils.add(pupil1);
        pupils.add(pupil2);
        pupils.add(pupil3);
        pupils.add(pupil4);
    }
}
