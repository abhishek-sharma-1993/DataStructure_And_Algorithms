package data_structure.tree.binary_search_tree;

public class MyTreeNode {
	
	private int value;
	private MyTreeNode left;
	private MyTreeNode right;
	
	public MyTreeNode(int value) {
		this.left = null;
		this.right = null;
		this.value = value;
	}
	
	public void setLeft(MyTreeNode left) {
		this.left = left;
	}
	
	public MyTreeNode getLeft() {
		return this.left;
	}
	
	public MyTreeNode getRight() {
		return this.right;
	}
	
	public void setRight(MyTreeNode right) {
		this.right =right;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}

}
