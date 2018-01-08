/*
 * Question:
Write a function that iterates over the numbers 1 through 100. If the number is divisible by 3, output "Fizz". If the number is divisible by 5, output "Buzz". If the number is divisible by both 3 and 5, output "FizzBuzz". If the number is divisible by none of these, output the number.
 */
public class FizzBuzz {

	static public void fizzbuzz() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		fizzbuzz();
	}

}
