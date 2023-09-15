package data_strutcure.queue.linkedList;

import java.util.NoSuchElementException;

public class MyQueue {
	
	private MyQueueNode first;
	private MyQueueNode last;
	private int length;
	
	public MyQueue() {
		this.first = null;
		this.last = null;
		this.length = 0;
	}
	
	public Object peek() {
		if(length == 0) {
			return null;
		}
		return first.getValue();
	}
	
	public void enqueue(Object value) {
		MyQueueNode newNode = new MyQueueNode(value);
		
		if(length == 0) {
			first = last = newNode;
		}else {
			last.setNext(newNode);
			last = newNode;
		}
		length++;
	}
	
	public void dequeue() {
		if(length == 0) {
			throw new NoSuchElementException();
		}
		first = first.getNext();
		length--;
		if(length == 0) {
			last = null;
		}
	}
	
	public void printlist() {
		MyQueueNode currentNode = first;
		System.out.print(currentNode.getValue());
		while(currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
			System.out.print(" --> "+currentNode.getValue());
		}
		System.out.println();
	}

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.enqueue("Shubhi");
		queue.enqueue("Abhi");
		queue.enqueue("Ashu");
		queue.enqueue("Amit");
		queue.printlist();
		
		queue.dequeue();
		queue.dequeue();
		queue.printlist();

	}

}
