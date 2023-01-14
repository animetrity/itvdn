package main.java.java_3_Essential.lesson_3.task_2.version_2;

import java.util.ArrayList;

public class ClassRoom {

    public  Pupil[] pupil = new Pupil[4];

    public ClassRoom(Pupil pupil1){
        pupil[0] = pupil1;
        pupil[1] = new Pupil();
        pupil[2] = new Pupil();
        pupil[3] = new Pupil();
    }
    public ClassRoom(Pupil pupil1, Pupil pupil2){
        pupil[0] = pupil1;
        pupil[1] = pupil2;
        pupil[2] = new Pupil();
        pupil[3] = new Pupil();
    }
    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3){
        pupil[0] = pupil1;
        pupil[1] = pupil2;
        pupil[2] = pupil3;
        pupil[3] = new Pupil();
    }
    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4){
        pupil[0] = pupil1;
        pupil[1] = pupil2;
        pupil[2] = pupil3;
        pupil[3] = pupil4;
    }
}
