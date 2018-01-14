/*
 * Question:
Given an array of integers and a target value, write a function to determine whether the array contains two numbers that add up to the target value.
 */

import java.util.HashSet;

public class TargetSum {
	
	static boolean canSum(int[] nums, int target) {
		
		int n = nums.length;
		if (n == 0) { return false; }
		
		HashSet<Integer> set = new HashSet<Integer>();
	
		for (int i = 0; i < n; i++) {
			if (set.contains(nums[i])) {
				return true;
			}
			set.add(target - nums[i]);
		}
		
		return false;
	}

	public static void main(String[] args) {
		int[] x = {1,2,3,4,5,6};
		int target = 7;
		System.out.println(canSum(x, target));
	}

}
