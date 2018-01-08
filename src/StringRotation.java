/*
 * Question:
Given two strings, write a function to check if one string is a rotation of the other
 */
public class StringRotation {

	static public boolean stringRotation(String a, String b) {
		int n = a.length();
		int m = b.length();

		if (n != m) {
			return false;
		}

		for (int i = 0; i < n; i++) {
			if (a.charAt(i) != b.charAt(n - 1 - i)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String a = "abc";
		String b = "cba";
		System.out.println(stringRotation(a, b));
	}

}
