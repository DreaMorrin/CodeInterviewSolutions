/*
 * Question:
Given an array of integers where each number appears exactly twice, except for one integer that appears exactly once, find the lone integer.
 */
public class FindTheLoneInteger {
	
	static public int find(int[] a) {
		int n = a.length;
		if (n == 0) return 0;
		int lone = a[0];
		for (int i = 1; i < n; i++) {
			lone ^= a[i];
		}
		return lone;
	}

	public static void main(String[] args) {
		int[] x = {2,2,3,3,4,5,5};
		System.out.println(find(x));
	}

}
