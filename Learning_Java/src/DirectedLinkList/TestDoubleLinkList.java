package DirectedLinkList;

public class TestDoubleLinkList {
	public static void main(String[] args) {
		DoubleLinkList dl = new DoubleLinkList();
		dl.insertFirst(45);
		dl.insertFirst(12);
		dl.insertFirst(34);
		dl.insertFirst(90);
		dl.display();
		System.out.println();
		
		while(!dl.isEmpty()) {
			dl.deleteLast();
			dl.display();	
			System.out.println();
		}
		
		
		
		
	}
	
}
