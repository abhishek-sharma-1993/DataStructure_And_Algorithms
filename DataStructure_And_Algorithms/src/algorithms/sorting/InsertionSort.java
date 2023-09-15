package algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {
	
	public static int[] sort(int[] input) {
		for(int i = 0; i < input.length-1 ; i++) {
			for(int j = i+1; j> 0; j--) {
				if(input[j-1] > input[j]) {
					int tmp = input[j-1];
					input[j-1] = input[j];
					input[j] = tmp;
				}else {
					break;
				}
			}
		}
		return input;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {52,56,78,1,32,96,45,21,2,9,4};
		Arrays.stream(sort(input)).forEach(x->System.out.print(x+" "));
	}

}
