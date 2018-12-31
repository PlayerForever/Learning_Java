package DirectedLinkList;

public class Node {
	public long data;  // data 
	
	public Node next;  // next node
	public Node previous; // previous node
	
	public Node(long value) {
		this.data = value;
	}
	
	
	public void display() {
		System.out.print(data + " ");
	}
 	
	
		
}