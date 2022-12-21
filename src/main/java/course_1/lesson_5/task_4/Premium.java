package main.java.course_1.lesson_5.task_4;

public class Premium {
    public static void main(String[] args) {
        int wage = 40000;
        int workerYear1 = 3,
                workerYear2 = 6,
                workerYear3 = 11,
                workerYear4 = 17,
                workerYear5 = 22,
                workerYear6 = 27;
        System.out.println(wageWorker(workerYear1,wage));
        System.out.println(wageWorker(workerYear2,wage));
        System.out.println(wageWorker(workerYear3,wage));
        System.out.println(wageWorker(workerYear4,wage));
        System.out.println(wageWorker(workerYear5,wage));
        System.out.println(wageWorker(workerYear6,wage));

    }
    public static int wageWorker(int workerYear, int wage){
        return (int)(premiumForWorker(workerYear) * wage + wage);
    }
    public static double premiumForWorker(int workerYear){
        if(workerYear > 0 && workerYear < 5)return 0.10;
        else if(workerYear >= 5 && workerYear < 10)return 0.15;
        else if(workerYear >=10 && workerYear < 15)return 0.25;
        else if(workerYear >=15 && workerYear < 20)return 0.35;
        else if(workerYear >=20 && workerYear < 25)return 0.45;
        else if(workerYear >=25)return 0.50;
        return 100;
    }
}
