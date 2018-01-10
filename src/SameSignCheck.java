/*
 * Question:
Given two integers, write a function that checks to see if the two numbers are the same sign using bitwise operators.
 */
public class SameSignCheck {
	
	static boolean check (int a, int b) {
		return (a >>= 31) == (b >> 31);
	}

	public static void main(String[] args) {
		int a = -3;
		int b = 3;
		System.out.println(check(a, b));

	}

}
