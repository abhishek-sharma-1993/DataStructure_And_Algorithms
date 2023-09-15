package leetcode.problems;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
	
	
	
	public static int[][] merge(int[][] intervals) {
        List<int[]> merged = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            if(end+intervals[i][0] <= intervals[i][1] ){
                end = intervals[i][1];
            }else{
                int[] tmp = {start,end};
                merged.add(tmp);
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        int[] tmp = {start,end};
        merged.add(tmp);
        return merged.toArray(new int[merged.size()][]);
    }

	public static void main(String[] args) {
		int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		int[][] list = merge(intervals);
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i][0]+ " "+ list[i][1]);
		}
	
	}

}
