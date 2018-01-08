/*
 * Question:
Given two strings, write a function to check if one string is a rotation of the other
 */
public class StringRotation {

	static public boolean stringRotation(String a, String b) {
		return (a.length() == b.length()) && ((a + a).indexOf(b) != -1);
	}

	public static void main(String[] args) {
		String a = "tionssolu";
		String b = "solutions";
		System.out.println(stringRotation(a, b));
	}

}
