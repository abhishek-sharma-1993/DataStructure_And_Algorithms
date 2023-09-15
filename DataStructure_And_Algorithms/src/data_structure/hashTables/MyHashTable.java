package data_structure.hashTables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyHashTable {
	
	private class MyNodes extends ArrayList<MyNode>{
	}
	
	private final int length;
	private MyNodes[] array;
	
	public MyHashTable(int size) {
		this.length = size;
		this.array = new MyNodes[size];
	}
	
	public void set(Object key, Object value) {
		if(array[hash(key)] == null) {
			array[hash(key)] = new MyNodes();
		}
		array[hash(key)].add(new MyNode(key,value));
	}
	
	public Object get(Object key) {
		if(array[hash(key)] == null) {
			return 0;
		}
		for(int i = 0; i < length; i++) {
			MyNode node = array[hash(key)].get(i);
			if(node.getkey().equals(key)) {
				return node.getValue();
			}
		}
		return 0;
	}
	
	public List<Object> keys(){
		List<Object> keys = new ArrayList<Object>();
		for(int i = 0; i < length; i++) {
			if(array[i] != null) {
				for(int j = 0; j < array[i].size(); j++) {
					if(array[i].get(j) != null) {
						keys.add(array[i].get(j).getkey());
					}
				}
			}
			
		}
		
		return keys;
	}
	
	private int hash(Object key) {
		int hash = 0;
		String keyStr = String.valueOf(key);
		for(int i = 0; i < keyStr.length(); i ++) {
			hash = ( hash + (int) keyStr.charAt(i) * i) % this.array.length; 
		}
		return hash;
	}

	public static void main(String[] args) {
				
		MyHashTable myhashTable = new MyHashTable(2);
		myhashTable.set("grapes", 10000);
		myhashTable.set("grape", 100);
		
		System.out.println(myhashTable.get("grapes"));
		System.out.println(myhashTable.get("grape"));
		System.out.println(myhashTable.keys());
	}

}
