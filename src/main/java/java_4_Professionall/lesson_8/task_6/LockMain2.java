package java_4_Professionall.lesson_8.task_6;

import java.util.concurrent.Semaphore;

/**
 * тут використано Semaphore для уникнення взаємного блокування
 */
public class LockMain2 {
}
class First extends Thread{
private Semaphore semaphore = new Semaphore(1);
@Override
public void run(){

}
}
class Second extends Thread{
private Semaphore semaphore = new Semaphore(1);
@Override
public void run(){

}
}
