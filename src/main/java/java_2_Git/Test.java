package main.java.java_2_Git;

import java.util.*;

public class Test {
public static void main(String[] args) {

	System.out.println("\n" + removeDuplicates(new int[]{-3,-1,0,0,0,3,3}));


}

public static int removeDuplicates(int[] nums) {
	int count = 1;
	for (int i = 0; i < nums.length; i++) {
		for (int j = 0; j < i; j++) {
			if(nums[i] == nums[j]){
				break;
			}
			if(j == i-1){
				if(i!= count){
					nums[count] = nums[i];
				}
				count++;
			}
		}
	}
	return count;
}




}

