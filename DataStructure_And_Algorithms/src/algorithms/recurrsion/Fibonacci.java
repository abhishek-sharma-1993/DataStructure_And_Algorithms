package algorithms.recurrsion;

public class Fibonacci {
	
	public static int fibonacciRecursive(int n) {
		if(n<2) {
			return n;
		}
		int sum = fibonacciRecursive(n-1) + fibonacciRecursive(n-2);

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacciRecursive(8));
	}

}
