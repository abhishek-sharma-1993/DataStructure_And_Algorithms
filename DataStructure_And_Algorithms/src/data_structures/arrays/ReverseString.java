package data_structures.arrays;

public class ReverseString {
	
	public static String reverse(String s) {
		int last = s.length()-1;
		String reversed = "";
		while(last>0) {
			reversed += (s.charAt(last));
			last--;
		}
		
		return reversed;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("abhishek sharma"));
	}

}
