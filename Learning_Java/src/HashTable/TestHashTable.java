package HashTable;

public class TestHashTable {

	public static void main(String[] args) {
		
		HashTable ht = new HashTable();
		ht.insert(new Info("abc", "Alice"));
		ht.insert(new Info("bbb", "Bob"));
		ht.insert(new Info("cba", "Cindy"));
		ht.insert(new Info("David", "David"));
		ht.insert(new Info("Eric", "Eric"));
		
		System.out.println(ht.find("Eric").getName());
	}

}
