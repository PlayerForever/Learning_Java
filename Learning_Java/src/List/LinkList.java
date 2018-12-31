package List;

public class LinkList {
	private Node first; // head node
	
	public LinkList() {
		first = null;
	}
	
	public void insertFirst(long value) { // insert item after head node
		Node node = new Node(value);
		node.next = first;
		first = node;
//		if(first == null) {
//			first = node;
//		} else {
//			node.next = first;
//			first = node;
//		}
	}
	
	
	public Node deleteFirst() {  // delete the first node
		Node tmp = first;
		first = tmp.next;
		return tmp;
	}
	
	public void display() {
		Node current = first;
		while(current != null) {
			current.display();
			current = current.next;
		}
	}
	

	public Node find(long value) {
		Node current = first;
		while(current.data != value) {
			if(current.next == null) {
				return null;
			}
			current = current.next;
		}
		
		return current;
	}
	

	public Node delete(long value) { // delete elements with particular value
		Node current = first;
		Node previous = first;
		while(current.data != value) {
			if(current.next == null) {
				return null;
			}
			previous = current;
			current = current.next;
		}
		
		if(current == first) {
			first = first.next;
		} else {
			previous.next = current.next;
		}
		
		return current;
	}
	
	
	
	
	
}
