package data_structure.hashTables;

public class MyNode {
	private Object key;
	private Object value;
	
	public MyNode(Object key, Object value) {
		this.key = key;
		this.value = value;
	}
	
	public Object getkey() {
		return key;
	}
	
	public void setKey(Object key) {
		this.key = key;
	}
	
	public Object getValue() {
	    return value;
	}
	
	public void setValue(int value) {
	    this.value = value;
	}

}
