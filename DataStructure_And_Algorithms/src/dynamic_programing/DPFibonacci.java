package dynamic_programing;

import java.util.HashMap;

public class DPFibonacci {
	//0 1 1 2 3 5 8 13 21 34 55 89 144 
	//0 1 2 3 4 5 6 7  8  9  10 11 12
	private static final HashMap<Integer, Long> cache = new HashMap<>();
	static int calculation = 0;
	public static long fibonacci(int n) {
		calculation++;
		if(cache.containsKey(n)) {
			return cache.get(n);
		}
		if(n < 2) {
			return n;
		}
		cache.put(n,fibonacci(n-2)+fibonacci(n-1));
		return cache.get(n);
		
	}

	public static void main(String[] args) {
		
		System.out.println(fibonacci(1000));
		System.out.println("We did "+calculation+ " calculations");
		String a = "babad";
		System.out.println(a.substring(0,5));
//		String b = String.valueOf(a.charAt(0));
	}

}
