/*
 * Question:
Given a string, write a function that returns a string that contains the same characters in the reverse order.

 */
public class StringReversal {

	static public String strngReversal(String s) {
		int n = s.length();
		StringBuilder sb = new StringBuilder();
		for (int i = n - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(strngReversal("abcdef"));
	}

}
