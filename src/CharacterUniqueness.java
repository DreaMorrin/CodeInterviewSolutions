/*
 * Question:
Given a string, write a function that checks to see if every character in the string is unique.
 */
public class CharacterUniqueness {

	static public boolean isUniquic(String s) {
		int n = s.length();
		if (n == 0) {
			return true;
		}

		int[] table = new int[256];
		for (int i = 0; i < n; i++) {
			if (table[s.charAt(i)] == 0) {
				table[s.charAt(i)]++;
			} else {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String s = "asdfghjti";
		System.out.println(isUniquic(s));
	}

}
