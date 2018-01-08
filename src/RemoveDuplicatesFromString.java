/*
 * Question:
Given a string, write a function that returns the string with all duplicate characters removed.
 */
public class RemoveDuplicatesFromString {

	static public String removeal(String s) {
		int n = s.length();
		if (n == 0) {
			return s;
		}

		int[] table = new int[256];
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			if (table[c] == 0) {
				sb.append(c);
			}
			table[c]++;
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "aabbccddee";
		System.out.println(removeal(s));

	}

}
