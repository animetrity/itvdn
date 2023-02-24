package java_4_Professionall.lesson_9.task_2;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] list = new int[]{1,2,3,4,5,6,7,8,9,10};
		int result = Arrays.stream(list)
				.map(a -> a * a)
				.reduce(0, Integer::sum);
		System.out.println(result);
	}
}
