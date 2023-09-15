package data_structures.linkedList.singly;

public class MyLinkedListNode {
	
	private Object value;
	private MyLinkedListNode next;
	
	public MyLinkedListNode(Object value) {
		this.value = value;
	}
	
	public MyLinkedListNode(Object value, MyLinkedListNode next) {
		this.value = value;
		this.next = next;
	}
	
	public void setValue(Object value) {
		this.value = value;
	}
	
	public Object getvalue() {
		return value;
	}
	
	public void setNext(MyLinkedListNode next) {
		this.next = next;
	}
	
	public MyLinkedListNode getNext() {
		return next;
	}
	

}
