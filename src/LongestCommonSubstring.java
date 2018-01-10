/*
 * Question:
Given two strings, find the length of the longest substring that they have in common.
 */

public class LongestCommonSubstring {

	static public int longest(String a, String b) {
		int n = a.length();
		int m = b.length();
		
		if (n == 0 || m == 0) { return 0; }
		
		char[] aChars = a.toCharArray();
		char[] bChars = b.toCharArray();
		int[][] C = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i == 0 || j == 0) {
					C[i][j] = (aChars[i] == bChars[j] ? 1 : 0);
				}
				else {
					if (aChars[i] == bChars[j]) {
						C[i][j] = C[i - 1][j - 1] + 1;
					}
					else {
						C[i][j] = 0;
					}
				}
			}
		}
		
		return C[n - 1][m - 1];
	}
	
	public static void main(String[] args) {
		String a = "abcddfg";
		String b =  "bcrddfg";
		System.out.println(longest(a, b));
	}

}
