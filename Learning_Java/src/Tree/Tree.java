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
	
	
	
	public boolean delete(long value) {
		Node current = root;
		Node parent = root;
		boolean isLeftChild = true; // check if the node is leftChild
		
		while(current.data != value) {
			parent = current;
			
			if(current.data > value) {
				current = current.leftChild;
				isLeftChild = true;
			} else {
				current = current.rightChild;
				isLeftChild = false;
			}
			
			if(current == null) {
				return false;
			}
		}
		
		
		if(current.leftChild == null && current.rightChild == null) { // delete the leaf node
			if(current == root) {
				root = null;
			} else if(isLeftChild) {
				parent.leftChild = null;
			} else {
				parent.rightChild = null;
			}
		} else if(current.rightChild == null) {  // delete the node with only leftChild
			if(current == root) {
				root = current.leftChild;
			} else if(isLeftChild) {
				parent.leftChild = current.leftChild;
			} else {
				parent.rightChild = current.leftChild;
			}
		} else if(current.leftChild == null) {  // delete the node with only rightChild
			if(current == root) {
				root = current.rightChild;
			} else if(isLeftChild) {
				parent.leftChild = current.rightChild;
			} else {
				parent.rightChild = current.rightChild;
			}
		} else {
			Node successor = getSuccessor(current);
			if(current == root) {
				root = successor;
			} else if(isLeftChild) {
				parent.leftChild = successor;
			} else {
				parent.rightChild = successor;
			}
		}
		return true;
	}
	
	
	public Node getSuccessor(Node delNode) {
		Node successor = delNode;
		Node successorParent = delNode;
		Node current = delNode.rightChild;
		
		while(current != null) {
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}
		
		if(successor != delNode.rightChild) {
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = delNode.rightChild;
		}
		return successor;
	}
	
	
	
	
	
	public void preOrder(Node localNode) { // pre-order traversal
		if(localNode != null) {
			System.out.println(localNode.data + ", " + localNode.sData);
			preOrder(localNode.leftChild); // recursively read the leftChild
			preOrder(localNode.rightChild);
		}
	}
	
	
	
	public void inOrder(Node localNode) {  // in-order traversal
		if(localNode != null) {
			inOrder(localNode.leftChild); // recursively read the leftChild
			System.out.println(localNode.data + ", " + localNode.sData);
			inOrder(localNode.rightChild);
		}
	}
	
	
	public void postOrder(Node localNode) {  //post-order traversal
		if(localNode != null) {
			postOrder(localNode.leftChild); // recursively read the leftChild
			postOrder(localNode.rightChild);
			System.out.println(localNode.data + ", " + localNode.sData);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
