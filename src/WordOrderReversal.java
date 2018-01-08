/*
 * Question:
Given a string that contains words separated by spaces, write a function that reverses the order of the words.
 */
import java.util.Stack;

public class WordOrderReversal {

	static public String reversal(String s) {
		int n = s.length();
		if (n == 0) { return s; }
		
		StringBuilder sb = new StringBuilder();
		Stack<String> stack = new Stack<String>();
		
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == ' ') {
				stack.push(sb.toString());
				sb = new StringBuilder();
			}
			else {
				sb.append(s.charAt(i));
			}
		}
		stack.push(sb.toString());
		sb = new StringBuilder();
		
		while (!stack.isEmpty()) {
			String v = stack.pop();
			sb.append(v);
			if (!stack.isEmpty()) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		String s = "apple is great";
		System.out.println(reversal(s));
	}

}
