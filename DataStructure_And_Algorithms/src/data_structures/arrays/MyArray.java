package data_structures.arrays;

import java.util.Arrays;

public class MyArray {
	private int length;
	private Object[] array;
	private int capacity;

	public MyArray() {
		this.length = 0;
		this.capacity = 1;
		this.array = new Object[1];
	}

	public Object get(int index) {
		return array[index];
	}

	public void push(Object value) {
		if(length == capacity) {
			capacity = capacity*2;
			array = Arrays.copyOf(array,capacity);
		}
		array[length] = value;
		length++;
	}

	public Object pop() {
		Object popedValue = array[length-1];
		array[length-1] = null;
		length--;
		return popedValue;
	}

	public Object delete(int index) {
		Object deletedValue = array[index];
		shiftArray(index);
		return deletedValue;
	}

	private void shiftArray(int index) {
		for(int i = index; i < length -1 ; i++) {
			array[i] = array[i+1];
		}
		array[length-1] = null;
		length--;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArray m = new MyArray();
	    m.push("Hello");
	    m.push("World");
	    m.push("!");
//	    m.pop();
	    m.delete(1);
	    for (int i = 0; i < m.length; i++) {
	        System.out.println("Element at index "+i+" is "+m.get(i));
	    }
	}

}
