package algorithms.searching;

public class BinarySearch {
	
	public static int search(int[] num, int find) {
		int size = num.length;
		int start = 0, end = size-1;
		while(start <= end) {
			int mid = (start+end)/2;
			if(num[mid] > find) {
				end = mid-1;
			}else if(num[mid] < find) {
				start = mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,4,6,7,9,10,42,187,200,658,899};
		System.out.println(search(a,200));
	}

}
