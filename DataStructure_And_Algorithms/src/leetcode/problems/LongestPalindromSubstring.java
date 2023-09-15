package leetcode.problems;

public class LongestPalindromSubstring {
	
	public static String longestPalindromSubstring(String s) {
		StringBuilder subStr = new StringBuilder();
		for(int start = 0; start < s.length(); start++) {
			for(int end = s.length(); end > 0 && end > start ; end-- ) {
				
				StringBuilder tmp = new StringBuilder(s.substring(start, end));
				String tmpStr = tmp.toString();
				StringBuilder reverse = tmp.reverse();
				String revStr = reverse.toString();
				if(tmpStr.equals(revStr) && tmp.length() > subStr.length()) {
					subStr.append(tmp);
				}
			}
		}
		
		return subStr.toString();
	}

	public static void main(String[] args) {
		System.out.println(longestPalindromSubstring("acbabc"));
		System.out.println("ababd".substring(0,5));
		
	}

}
