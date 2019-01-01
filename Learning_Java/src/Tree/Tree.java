package Tree;

// binary tree
public class Tree {
	
	public Node
	root;
	
	public void insert(long value, String sValue) {
		Node newNode = new Node(value, sValue); // encapsulate the node
		Node current = root; // reference current node
		Node parent; // reference parent node
		
		if(root == null) {
			root = newNode;
			return;
		} else {
			while(true) {
				parent = current;  // 'current' points to the parent node
				if(current.data > value) {
					current = current.leftChild;  // if value is smaller, go left
					if(current == null) {
						parent.leftChild = newNode;
						return;
					}
				} else {
					current = current.rightChild; // if value is greater, go right
					if(current == null) {
						parent.rightChild = newNode;
						return;
					}
				}	
			}
			
		}		
		
	}
	
	
	
	public Node find(long value) {
		Node current = root; // begin from the root node
		
		while(current.data != value) {
			if(current.data > value) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
			
			if(current == null) {
				return null;
			}
		}
		
		return current;
	}
	
	
	
	public void delete(long value) {
		
	}
}
