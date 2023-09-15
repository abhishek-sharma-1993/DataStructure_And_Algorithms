package data_structure.tree.binary_search_tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MyBSTree {
	
	enum SearchType{
		InOrder,
		PreOrder,
		PostOrder
	}
	
	private MyTreeNode root;
	
	public MyBSTree() {
		this.root = null;
	}
	
	public void insert(int value) {
		MyTreeNode newNode = new MyTreeNode(value);
		if(root == null) {
			root = newNode;
			return;
		}
		MyTreeNode currentNode = root;
		while(true) {
			if(currentNode.getValue() > value) {
				if(currentNode.getLeft() == null) {
					currentNode.setLeft(newNode);
					return;
				}
				currentNode = currentNode.getLeft();
			}else {
				if(currentNode.getRight() == null) {
					currentNode.setRight(newNode);
					return;
				}
				currentNode = currentNode.getRight();
			}
		}
	}
	
	public void remove(int value) {
		if(root == null) {
			return;
		}
		MyTreeNode currentNode = root;
		MyTreeNode deleteNode = null;
		while(true) {
			if(currentNode.getValue() > value) {
				//Left
				if(currentNode.getLeft() == null) {
					return;
				}
				currentNode = currentNode.getLeft();
			}else if(currentNode.getValue() < value) {
				//Right
				if(currentNode.getRight() == null) {
					return;
				}
				currentNode = currentNode.getRight();
			}else {
				//Found node
				deleteNode = currentNode;
			}
		}
	}
	
	public void printTree() {
		if(root == null) {
			return;
		}
		printTree(root);
	}
	
	public void printTree(MyTreeNode node) {
		System.out.println(node.getValue());
		
		if(node.getLeft() != null) {
			printTree(node.getLeft());
		}
		if(node.getRight() != null) {
			printTree(node.getRight());
		}
	}
	
	public List<Integer> breathFirsthSearchIteratively(){
		List<Integer> tree = new ArrayList<>();
		Queue<MyTreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			MyTreeNode currentNode = queue.remove(); 
			tree.add(currentNode.getValue());
			if(currentNode.getLeft() != null) {
				queue.add(currentNode.getLeft());
			}
			if(currentNode.getRight() != null) {
				queue.add(currentNode.getRight());
			}
		}
		return tree;
	}
	
	public List<Integer> breathFirstSearchRecursively(Queue<MyTreeNode> queue, List<Integer> tree){
		if(queue.isEmpty()) {
			return tree;
		}
		MyTreeNode currentNode = queue.poll(); 
		tree.add(currentNode.getValue());
		if(currentNode.getLeft() != null) {
			queue.add(currentNode.getLeft());
		}
		if(currentNode.getRight() != null) {
			queue.add(currentNode.getRight());
		}
		
		return breathFirstSearchRecursively(queue, tree);
		
	}
	
	public List<Integer> breathFirstSearchRecursively() {
	    Queue<MyTreeNode> queue = new LinkedList<>();
	    queue.add(root);
	    return breathFirstSearchRecursively(queue, new ArrayList<>());
	  }
	
	public List<Integer> depthFirstSearchInOrder(MyTreeNode currentNode, List<Integer> list,SearchType type){
		
		if(type == SearchType.PreOrder) {
			list.add(currentNode.getValue());
		}
		if(currentNode.getLeft() != null) {
			depthFirstSearchInOrder(currentNode.getLeft(), list, type);
		}
		if(type == SearchType.InOrder) {
			list.add(currentNode.getValue());
		}
		
		if(currentNode.getRight() != null) {
			depthFirstSearchInOrder(currentNode.getRight(), list, type);
		}
		
		if(type == SearchType.PostOrder) {
			list.add(currentNode.getValue());
		}
		
		return list;
	}
	
	public List<Integer> depthFirstSearchInOrder(SearchType type){
		
		return depthFirstSearchInOrder(root, new ArrayList<>(),type);
	}

	public static void main(String[] args) {
		MyBSTree tree = new MyBSTree();
		tree.insert(9);
		tree.insert(4);
		tree.insert(20);
		tree.insert(6);
		tree.insert(15);
		tree.insert(1);
		tree.insert(170);
		tree.printTree();
		System.out.println("Breath first search " + tree.breathFirsthSearchIteratively());
		System.out.println("Breath first search " + tree.breathFirstSearchRecursively());
		
		System.out.println("Depth first search PreOrder " + tree.depthFirstSearchInOrder(SearchType.PreOrder));
		System.out.println("Depth first search InOrder " + tree.depthFirstSearchInOrder(SearchType.InOrder));
		System.out.println("Depth first search PostOrder " + tree.depthFirstSearchInOrder(SearchType.PostOrder));
		List<List<String>> list = new ArrayList<>();
//		list.add(new ArrayList<String>(Arrays.asList("abhi")));
		System.out.println(list);
		System.out.println(list.isEmpty());
	}

}
