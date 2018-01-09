/*
 * Question:
Given a string that contains words separated by spaces, write a function that reverses the order of the words.
 */

public class WordOrderReversal {

	static public void swap(char[] chars, int i, int j) {
		char tmp = chars[i];
		chars[i] = chars[j];
		chars[j] = tmp;
	}
	
	static public String reverseOrder(String s) {
		int n = s.length();
		char[] chars = s.toCharArray();
		
		// reserves every char
		for (int i = 0; i < (n % 2 == 0 ? n / 2 : n / 2 + 1); i++) {
			swap(chars, i, n - 1 - i);
		}
		
		// reserves every word
		StringBuilder str = new StringBuilder();
		StringBuilder word = new StringBuilder();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == ' ') {
				str.append(word.reverse() + " ");
				word = new StringBuilder();
			}
			else {
				word.append(chars[i]);
			}
		}
		str.append(word.reverse());
		
		return str.toString();
	}
	
	public static void main(String[] args) {
		String s = "apple is grea";
		System.out.println(reverseOrder(s));
	}

}
