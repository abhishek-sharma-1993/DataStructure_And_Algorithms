package data_structures.linkedList.doubly;

import data_structures.linkedList.singly.MyLinkedListNode;

public class MyDoublyLinkedNode {
	
	private Object value;
	private MyDoublyLinkedNode next;
	private MyDoublyLinkedNode prev;
	
	public MyDoublyLinkedNode(Object value) {
		this.value = value;
		this.next = null;
	}
	
	public MyDoublyLinkedNode(Object value, MyDoublyLinkedNode next, MyDoublyLinkedNode prev) {
		this.value = value;
		this.next = next;
		this.prev = prev;
	}
	
	public void setValue(Object value) {
		this.value = value;
	}
	
	public Object getvalue() {
		return value;
	}
	
	public void setNext(MyDoublyLinkedNode next) {
		this.next = next;
	}
	
	public MyDoublyLinkedNode getNext() {
		return next;
	}
	
	public void setPrev(MyDoublyLinkedNode prev) {
		this.prev = prev;
	}
	
	public MyDoublyLinkedNode getPrev() {
		return this.prev;
	}

}
