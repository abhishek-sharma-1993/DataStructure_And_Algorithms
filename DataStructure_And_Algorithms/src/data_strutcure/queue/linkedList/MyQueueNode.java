package data_strutcure.queue.linkedList;


public class MyQueueNode {
	
	private Object value;
	private MyQueueNode next;
	
	public MyQueueNode(Object value) {
		this.value = value;
		this.next = null;
	}
	
	public MyQueueNode(Object value, MyQueueNode next) {
		this.value = value;
		this.next = next;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	
	public Object getValue() {
		return this.value;
	}
	
	public void setNext(MyQueueNode next) {
		this.next = next;
	}
	
	public MyQueueNode getNext() {
		return this.next;
	}

}
