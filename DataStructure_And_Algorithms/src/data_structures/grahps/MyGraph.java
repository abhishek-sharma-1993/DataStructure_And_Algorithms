package data_structures.grahps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;


public class MyGraph {
	
	private int numerOfnodes;
	private HashMap<Integer, List<Integer>> adjecentList;
	
	public MyGraph() {
		this.adjecentList = new HashMap<>();
		this.numerOfnodes = 0;
	}
	
	public void addNode(int node) {
		adjecentList.put(node, new ArrayList<>());
		numerOfnodes++;
	}
	
	public void addEdge(int node1, int node2) {
		adjecentList.get(node1).add(node2);
		adjecentList.get(node2).add(node1);
	}
	
	public void showConnections() {
		for(Entry<Integer, List<Integer>> entry : adjecentList.entrySet()) {
			System.out.print(entry.getKey()+" ==> ");
			for(int val: entry.getValue()) {
				System.out.print(val +" ");
			}
			System.out.println();
		}
	}
	
	public static int lengthOfLongestSubstring(String s)
    {
        // O(n) time | O(n) space
        HashSet<Character> mySet = new HashSet<>();
        
        int left = 0, right = 0;
        int max = 0;
        
        while(right < s.length())
        {
            char ch = s.charAt(right);
            
            if(!mySet.contains(ch))
            {
                mySet.add(ch);
                right++;
                max = Math.max(max, mySet.size());
            }
            else
            {
            	System.out.println(mySet);
                mySet.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("pwwkew"));
//		MyGraph graph = new MyGraph();
//	    graph.addNode(0);
//	    graph.addNode(1);
//	    graph.addNode(2);
//	    graph.addNode(3);
//	    graph.addNode(4);
//	    graph.addNode(5);
//	    graph.addNode(6);
//	    graph.addEdge(3, 1);
//	    graph.addEdge(3, 4);
//	    graph.addEdge(4, 2);
//	    graph.addEdge(4, 5);
//	    graph.addEdge(1, 2);
//	    graph.addEdge(1, 0);
//	    graph.addEdge(0, 2);
//	    graph.addEdge(6, 5);
//	    graph.showConnections();
	}

}
