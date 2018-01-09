
public class StringToInteger {

	static public int convert(String s) {
		
		int n = s.length();
		
		if (n == 0) {
			return 0;
		}
		
		char[] chars = s.toCharArray();
		int i = 0;
		
		int sign = 1;
		if (chars[0] == '-') {
			sign = -1;
			i = 1;
		}
		
		int sum = 0;
		for (; i < n; i++) {
			if (chars[i] >= '0' && chars[i] <= '9') {
				int x = chars[i] - '0';
				
				// handle overflow case by reversing and compare to origin (TODO: this approach seems not handle overflow properly)
				int newSum = sum * 10 + x;
				if ((newSum - x) / 10 == sum) {
					sum = newSum;
				}
				else {
					return 0;
				}
			}
			else {
				return 0;
			}
		}

		return sum * sign;
	}
	
	public static void main(String[] args) {
		String s = "2147483647";
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(convert(s));
	}

}
