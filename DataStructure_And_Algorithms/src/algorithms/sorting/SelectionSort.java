package algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {
	
	public static int[] sort(int[] input) {
		for(int i = 0 ; i < input.length; i++) {
			int min = input[i];
			int minIndex = i;
			for(int j = i+1; j < input.length ; j++) {
				if(min > input[j]) {
					min = input[j];
					minIndex = j;
				}
			}
			int tmp = input[i];
			input[i] = input[minIndex];
			input[minIndex] = tmp;
		}
		return input;
	}

	public static void main(String[] args) {
		int[] input = {7,5,2,1,6,3,8,4};
		input = sort(input);
		Arrays.stream(input).forEach(System.out::print);
	}

}
