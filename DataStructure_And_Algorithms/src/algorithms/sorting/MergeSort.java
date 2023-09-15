package algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
	
	public static Integer[] mergeSort(Integer[] nums) {
		return mergeSort(new ArrayList<>(Arrays.asList(nums))).toArray(new Integer[0]);
	}
	
	public static List<Integer> mergeSort(List<Integer> nums){
		if(nums.size() == 1) {
			return nums;
		}
		List<Integer> left = nums.subList(0, nums.size()/2);
		List<Integer> right = nums.subList(nums.size()/2, nums.size());
		
		return merge(mergeSort(left),mergeSort(right));
	}
	
	public static List<Integer> merge(List<Integer> left, List<Integer> right){
		List<Integer> merged = new ArrayList<>();
		int leftIndex = 0;
		int rightIndex = 0;
		while(leftIndex < left.size() && rightIndex < right.size()) {
			if(left.get(leftIndex) <= right.get(rightIndex)) {
				merged.add(left.get(leftIndex));
				leftIndex++;
			}else {
				merged.add(right.get(rightIndex));
				rightIndex++;
			}
		}
		merged.addAll(left.subList(leftIndex, left.size()));
		merged.addAll(right.subList(rightIndex, right.size()));
		
		return merged;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] nums1 = {5,8,20,7,2,6,1,78,140,3};
		Arrays.stream(mergeSort(nums1)).forEach(System.out::println);
	}

}
