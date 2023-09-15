package data_structures.stack.linkedList;

public class MyNode {
	private Object value;
	private MyNode next;
	
	public MyNode(Object value) {
		this.value = value;
		this.next = null;
	}
	
	public MyNode(Object value, MyNode next) {
		this.value = value;
		this.next = next;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	
	public Object getValue() {
		return this.value;
	}
	
	public void setNext(MyNode next) {
		this.next = next;
	}
	
	public MyNode getNext() {
		return this.next;
	}

}
