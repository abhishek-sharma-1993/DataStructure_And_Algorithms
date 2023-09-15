package algorithms.sorting;

public class BubbleSort {
	
	public static int[] sort(int[] input) {
		for(int i = 0; i < input.length; i++) {
			for(int j= 0; j < input.length-1; j++) {
				if(input[j] > input[j+1]) {
					int tmp = input[j];
					input[j] = input[j+1];
					input[j+1] = tmp;
				}
			}
		}
		return input;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {7,5,2,1,6,3,8,4};
		input = sort(input);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] +" " );
		}
	}

}
