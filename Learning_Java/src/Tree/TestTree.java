package Tree;

public class TestTree {

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(10, "Hello");
		tree.insert(20, "Hola");
		tree.insert(15, "Hallo");
		tree.insert(3, "Bonjur");
		tree.insert(5, "World");
		tree.insert(23, "Mundo");
		
		System.out.println(tree.root.data);
		System.out.println(tree.root.rightChild.data);
		System.out.println(tree.root.rightChild.leftChild.data);
		System.out.println(tree.root.leftChild.data);

		System.out.println(tree.find(15).data + " " + tree.find(15).sData);
		
		tree.preOrder(tree.root);
		System.out.println();
		
	
		tree.inOrder(tree.root);
		System.out.println();
		
		tree.postOrder(tree.root);
		System.out.println();
		
	}

}
