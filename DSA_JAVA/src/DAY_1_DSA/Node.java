package DAY_1_DSA;

public class Node {
	private int data;
	private Node nextnode;
	public Node(int data) {
		this.data=data;
		this.nextnode=null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node next() {
		return nextnode;
	}
	public void setnext(Node n) {
		this.nextnode = n;
	}
}
