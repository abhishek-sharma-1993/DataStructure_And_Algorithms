package algorithms.recurrsion;

/*
 * Rules of Recursion
 * * Identify the base case to stop the recursive call
 * * Identify the recursive case
 * * Get closer and closer and return when needed, usually two returns required.
 */

public class Factorial {
	
	
	
	public static int findFactorialRecursive(int number) {
		if(number <= 1) {
			return 1;
		}
		int factorial = findFactorialRecursive(number-1);
		factorial = factorial * number;
		return factorial;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findFactorialRecursive(5));

	}

}
