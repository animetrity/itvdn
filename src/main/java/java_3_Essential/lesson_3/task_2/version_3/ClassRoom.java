package java_3_Essential.lesson_3.task_2.version_3;

public class ClassRoom {

    public  Pupil[] pupil = new Pupil[]{new Pupil(), new Pupil(), new Pupil(), new Pupil()};

    {
        for (int i = 0; i < pupil.length; i++) {
            pupil[i] = new Pupil();
        }
    }
    public ClassRoom(Pupil pupil1){
        pupil[0] = pupil1;
    }
    public ClassRoom(Pupil pupil1, Pupil pupil2){
        pupil[0] = pupil1;
        pupil[1] = pupil2;
    }
    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3){
        pupil[0] = pupil1;
        pupil[1] = pupil2;
        pupil[2] = pupil3;
    }
    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4){
        pupil[0] = pupil1;
        pupil[1] = pupil2;
        pupil[2] = pupil3;
        pupil[3] = pupil4;
    }
}
