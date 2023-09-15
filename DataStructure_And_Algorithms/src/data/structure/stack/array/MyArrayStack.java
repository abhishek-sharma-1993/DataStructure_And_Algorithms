package data.structure.stack.array;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class MyArrayStack {
		
	private List<Object> stack;
	
	public MyArrayStack() {
		this.stack = new ArrayList<Object>();
	}
	
	public void push(Object value) {
		stack.add(value);
	}
	
	public void pop() {
		if(stack.size() == 0) {
			throw new EmptyStackException();
		}
		stack.remove(stack.size()-1);
	}
	
	public Object peek() {
		return stack.get(stack.size()-1);
	}
	
	public void printStack() {
		System.out.print(stack.get(0));
		for(int i = 1; i < stack.size(); i++) {
			System.out.print(" --> "+ stack.get(i));
		}
		System.out.println();
	}

	public static void main(String[] args) {
		MyArrayStack stk = new MyArrayStack();
		stk.push("google");
		stk.push("twitter");
		stk.push("udemy");
		stk.printStack();


	}

}
