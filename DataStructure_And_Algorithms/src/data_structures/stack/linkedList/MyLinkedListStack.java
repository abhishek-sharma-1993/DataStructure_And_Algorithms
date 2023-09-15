package data_structures.stack.linkedList;

public class MyLinkedListStack {
	
	private MyNode top;
	private MyNode bottom;
	private int length;
	
	public MyLinkedListStack() {
		this.top = null;
		this.bottom = null;
		this.length = 0;
	}
	
	public void push(Object value) {
		MyNode node = new MyNode(value, top);
		top = node;
		if(length == 0) {
			bottom = node;
		}
		length++;
	}
	
	public Object pop() {
		if(length == 0){
			return 0 ;
		}
		Object val = top.getValue();
		top = top.getNext();
		length--;
		if(length == 0) {
			bottom = top;
		}
		return val;
	}
	
	public Object peek() {
		if(length == 0) {
			return 0;
		}
		return top.getValue();
	}
	
	public void printStack() {
		if(length == 0) {
			System.out.println("");
		}
		MyNode currentNode = top;
		System.out.print(currentNode.getValue());
		while(currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
			System.out.print(" --> "+currentNode.getValue());
		}
		System.out.println();
	}

	public static void main(String[] args) {

		MyLinkedListStack stack = new MyLinkedListStack();
		stack.push("google.com");
		stack.push("twitter.com");
		stack.push("udemy.com");
		stack.push("youtube.com");
		stack.printStack();
		stack.pop();
		stack.printStack();
		System.out.println(stack.peek());
	}

}
