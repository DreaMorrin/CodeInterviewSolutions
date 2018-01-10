/*
 * Question:
Given an integer, write a function to check if the number is a power of two using bitwise operators.

 */

public class PowerOf2Check {

	static boolean checkPowerOf2(int v) {
		return (v & (v - 1) ) == 0 ;
	}

	public static void main(String[] args) {
		int v = 8;
		System.out.println(checkPowerOf2(v));
	}

}
