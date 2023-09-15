package data_structures.arrays;

import java.util.Arrays;

public class MergeSortedArray {
	
	public static int[] mergeSortedArray(int[] arr1, int[] arr2) {
		int[] merged = new int[arr1.length+arr2.length];
		int j = 0, k=0;
		for(int i = 0; i < merged.length; i ++) {
			if(j < arr1.length && (k == arr2.length || arr1[j] < arr2[k])) {
				merged[i] = arr1[j];
				j++;
			}else {
				merged[i] = arr2[k];
				k++;
			}
		}
		
		return merged;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,4,6,9,10};
		int[] arr2 = {4,5,10,21};
		int[] res = mergeSortedArray(arr1,arr2);
		Arrays.stream(res).forEach(System.out::println);
	}

}
