/*
 * Question:
Write a function to compute 2x without using the multiplication operator or any looping structures.
 */
public class Computing2X {
	
	static int computingPowerOf2(int x) {
		return 2 << x;
	}

	public static void main(String[] args) {
		int x = 8;
		System.out.println(computingPowerOf2(x));
	}

}
