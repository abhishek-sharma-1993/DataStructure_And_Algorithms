package data_structures.linkedList.doubly;

public class MyDoublyLinkedList {
	
	private int length;
	private MyDoublyLinkedNode head;
	private MyDoublyLinkedNode tail;
	
	public MyDoublyLinkedList(Object value) {
		this.head = new MyDoublyLinkedNode(value);
		tail = head;
		this.length = 1;
	}
	
	public void append(Object value) {
		MyDoublyLinkedNode newNode = new MyDoublyLinkedNode(value,null,tail);
		tail.setNext(newNode);
		tail = newNode;
		length++;
	}
	
	public void prepend(Object value) {
		MyDoublyLinkedNode newNode = new MyDoublyLinkedNode(value);
		head.setPrev(newNode);
		newNode.setNext(head); 
		head = newNode;
		length++;
	}
	
	public void insert(int index,Object value) {
		index = wrapIndex(index);
		if(index == 0) {
			prepend(value);
			return;
		}
		if(index == length -1) {
			append(value);
			return;
		}
		
		MyDoublyLinkedNode leader = travserseList(index-1);
		MyDoublyLinkedNode follower = leader.getNext();
		MyDoublyLinkedNode newNode = new MyDoublyLinkedNode(value,follower,leader);
		leader.setNext(newNode);
		follower.setPrev(newNode);
		length++;
	}
	
	public void remove(int index) {
		index = wrapIndex(index);
		if(index == 0) {
			head = head.getNext();
			head.setPrev(null);
			return;
		}
		MyDoublyLinkedNode leader = travserseList(index-1);
		MyDoublyLinkedNode deleteNode = leader.getNext();
		leader.setNext(deleteNode.getNext());
		if(deleteNode.getNext() != null) {
			deleteNode.getNext().setPrev(leader);
		}
		length--;
	}
	
	private MyDoublyLinkedNode travserseList(int index) {
		index = wrapIndex(index);
		MyDoublyLinkedNode leader = head;
		for(int i = 0; i < index; i++) {
			leader = leader.getNext();
		}
		return leader;
	}
	
	private int wrapIndex(int index) {
		return Math.max(Math.min(index, length-1), 0);
	}
	
	public void printListForward() {
		MyDoublyLinkedNode currentNode = head;
		System.out.print(currentNode.getvalue());
		while(currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
			System.out.print(" --> "+ currentNode.getvalue());
		}
		System.out.println();
	}
	
	public void printListReversed() {
		MyDoublyLinkedNode currentNode = tail;
		System.out.print(currentNode.getvalue());
		while(currentNode.getPrev() != null) {
			currentNode = currentNode.getPrev();
			System.out.print(" --> "+ currentNode.getvalue());
		}
		System.out.println();
	}

	public static void main(String[] args) {
		MyDoublyLinkedList dlinkedlist = new MyDoublyLinkedList(5);
		
		dlinkedlist.append(9);
		dlinkedlist.prepend(10);
		dlinkedlist.insert(5, 56);
		dlinkedlist.insert(2, 56);
//		dlinkedlist.remove(5);
		dlinkedlist.printListForward();
//		dlinkedlist.printListReversed();
//		dlinkedlist.remove(0);
	}

}
