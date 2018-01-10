/*
 * Question:
Given an integer, write a function to check if the number is a power of two using bitwise operators.

 */

public class PowerOf2Check {

	static boolean checkPowerOf2(int v) {
		
		while (v != 1) {
			
			if ((v & 1) == 1) {
				return false;
			}
			
			v >>= 1;
		}
		return true;
	}

	public static void main(String[] args) {
		int v = 8;
		System.out.println(checkPowerOf2(v));
	}

}
