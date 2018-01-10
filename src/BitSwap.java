/*
 * Question:
Write a function that takes a byte and swaps the the first 4 bits with the last 4 bits.
 */

public class BitSwap {

	static int swap(int v) {
		int front4 = v >> 4;
		int end4 = v << 4;
		return front4 | end4;
	}

	public static void main(String[] args) {
		int v = 4;
		System.out.println(swap(4));
	}

}
