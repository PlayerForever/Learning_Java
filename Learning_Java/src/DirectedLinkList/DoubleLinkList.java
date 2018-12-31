package DirectedLinkList;

public class DoubleLinkList {
	
			private Node first; // head node
			private Node last;
			
			public DoubleLinkList() {
				first = null;
				last = null;
			}
			
			public void insertFirst(long value) { // insert item after head node
				Node node = new Node(value);
				if(isEmpty()) {
					last = node;
				} else {
					first.previous = node;
				}
				
				node.next = first;
				first = node;
			}
			
			public void insertLast(long value) { // insert item at the end 
				Node node = new Node(value);
				if(isEmpty()) {
					first = node;
				} else {
					last.next = node;
					node.previous = last;
				}
				last = node;
			}
			
		
			public Node deleteFirst() {  // delete the first node
				Node tmp = first;
				if(first.next == null) {
					last = null;
				} else {
					first.next.previous = null;
				}
				first = tmp.next;
				return tmp;
			}
			
			public Node deleteLast() {
				Node tmp = last;
				if(first.next == null) {
					first = null;
				} else {
					last = last.previous;
					last.previous.next = null;
				}
				
				return last;	 
			}
			
			public void display() {
				Node current = first;
				while(current != null) {
					current.display();
					current = current.next;
				}
			}
			
			public boolean isEmpty() {
				return (first == null);
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
				while(current.data != value) {
					if(current.next == null) {
						return null;
					}
					current = current.next;
				}
				
				if(current == first) {
					first = first.next;
				} else {
					current.previous.next = current.next;
				}
				
				return current;
			}



}
