package DirectedLinkList;

public class TestFirstLastLinkList {
	public static void main(String[] args) {
		
		FirstLastLinkList fl = new FirstLastLinkList();
		fl.insertFirst(34);
		fl.insertFirst(56);
		fl.insertFirst(67);
		fl.display();
		System.out.println();
		
//		fl.deleteFirst();
//		fl.deleteFirst();
//		fl.display();
		
		fl.insertLast(89);
		fl.insertLast(100);
		fl.display();
		System.out.println();
		
		fl.deleteFirst();
		fl.display();
	}
}
