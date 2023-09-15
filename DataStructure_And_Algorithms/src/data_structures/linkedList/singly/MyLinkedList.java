package data_structures.linkedList.singly;

import java.util.Iterator;

public class MyLinkedList {
	
	private MyLinkedListNode head;
	private MyLinkedListNode tail;
	private int length;
	
	public MyLinkedList(Object value) {
		this.head = new MyLinkedListNode(value);
		this.tail = head;
		this.length = 1;
	}
	
	public void prepend(Object value) {
		MyLinkedListNode newNode = new MyLinkedListNode(value,head);
		head = newNode;
		length++;
	}
	
	public void append(Object value) {
		MyLinkedListNode newNode = new MyLinkedListNode(value,null);
		MyLinkedListNode lastNode = tail;
		lastNode.setNext(newNode);
		tail = newNode;
		length++;
	}
	
	public void insert(int index, Object value) {
		if(index == 0) {
			prepend(value);
			return;
		}
		if(index == length -1) {
			append(value);
			return;
		}
		index = wrapIndex(index);
		MyLinkedListNode newNode = new MyLinkedListNode(value,null);
		MyLinkedListNode currentNode = traverseList(index);
		newNode.setNext(currentNode.getNext());
		currentNode.setNext(newNode);
		length++;
	}
	
	private MyLinkedListNode traverseList(int index) {
		MyLinkedListNode currentNode = head;
		for(int i = 0; i < index; i++) {
			currentNode = currentNode.getNext();
		}
		return currentNode;
	}
	
	public void remove(int index) {
		if(index == 0) {
			head = head.getNext();
			length--;
			return;
		}
		index = wrapIndex(index);
		MyLinkedListNode currentNode = traverseList(index-1);
		MyLinkedListNode deleteNode = currentNode.getNext();
		currentNode.setNext(deleteNode.getNext());
		deleteNode.setNext(null);
		length--;
	}
	
	public void reverse() {
		MyLinkedListNode currentNode = head;
		tail = head;
		MyLinkedListNode prevNode = null;
		while(currentNode.getNext() != null) {
			MyLinkedListNode nextNode = currentNode.getNext();
			currentNode.setNext(prevNode);
			prevNode = currentNode;
			currentNode = nextNode;
		}
		currentNode.setNext(prevNode);
		head = currentNode;
	}
	
	private int wrapIndex(int index) {
		return Math.max(Math.min(index, length-1),0);
	}
	
	public void printList() {
		MyLinkedListNode currentNode = head;
		System.out.print(currentNode.getvalue());
		while(currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
			System.out.print(" --> "+currentNode.getvalue());
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		MyLinkedList linkedlist = new MyLinkedList(45);
		linkedlist.append(89);
		linkedlist.append(23);
		linkedlist.prepend("shek");
		linkedlist.prepend("abhi");
		linkedlist.insert(2, "sharma");
		linkedlist.insert(0, "shubhanshi");
		System.out.println(linkedlist.length);
		linkedlist.insert(10, "error");
		linkedlist.printList();
		System.out.println(linkedlist.length);
		linkedlist.remove(5);
		linkedlist.printList();
		System.out.println(linkedlist.length);
		linkedlist.reverse();
		linkedlist.printList();
	}

}
