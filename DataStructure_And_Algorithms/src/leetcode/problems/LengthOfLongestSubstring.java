package leetcode.problems;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
	
	 public static Set<Character> lengthOfLongestSubstring(String s) {
	        int max = 0, left = 0, right = 0;
	        Set<Character> set = new HashSet<>();
	        
	        while(right < s.length()) {
	        	char ch = s.charAt(right);
	        	if(!set.contains(ch)) {
	        		set.add(ch);
	        		right++;
	        		max = Math.max(max, set.size());
	        	}else {
	        		set.remove(s.charAt(left));
	        		left++;
	        	}
	        }
	        
	        return set;
	    }
	 
	 public static void m1(String a) {
		 System.out.println("Inside String : "+a);
	 }
	 
	 public static void m1(int a) {
		 System.out.println("Inside Integer :"+ a);
	 }
	 
	 public static void m1(Object a) {
		 System.out.println("Inside Object :"+a);
	 }
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(lengthOfLongestSubstring("babad"));
		m1(null);
	}

}
