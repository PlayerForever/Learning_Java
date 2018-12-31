package List;

public class LinkList {
	private Node first; // head node
	
	public LinkList() {
		first = null;
	}
	
	public void insertFirst(long value) { // insert item after head node
		Node node = new Node(value);
//		if(first == null) {
//			first = node;
//		} else {
//			node.next = first.next;
//			first = node;
//		}
		node.next = first;
		first = node;
	}
	
	
	public Node deleteFirst() {  // delete a node after head node
		Node tmp = first.next;
		first.next = tmp.next;
		return tmp;
	}
	
	public void display() {
		Node current = first;
		while(current.next != null) {
			current.display();
			current = current.next;
		}
	}
	
	
	
	
	
}
