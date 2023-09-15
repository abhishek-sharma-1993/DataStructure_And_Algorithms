package data_structure.hashTables;

import java.util.HashSet;
import java.util.Set;

public class FirstRecurringCharacter {
	
	public static int checkRecurringCharacter(int[] data) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < data.length; i++) {
			if(set.contains(data[i])) {
				return data[i];
			}else {
				set.add(data[i]);
			}
		}
		return 0 ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {2,5,1,5,6,5,8,1};
		System.out.println(checkRecurringCharacter(data));
	}

}
