/*
 * Question:
Write a function that takes 3 booleans and return true if at least two of them are true.
 */
public class TwoAreTrue {

	static public boolean twoAreTrue(boolean a, boolean b, boolean c) {
		return a ? (b || c) : (b && c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
