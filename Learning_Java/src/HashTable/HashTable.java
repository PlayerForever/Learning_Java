package HashTable;

import java.math.BigInteger;

public class HashTable {
	public Info[] arr;
	
	public HashTable() {
		arr = new Info[100000000];
	}
	
	public HashTable(int maxsize) {
		arr = new Info[maxsize];
	}
	
	public void insert(Info info) {
		arr[hashCode(info.getKey())] = info;
	}
		
	public Info find(String key) {
		return arr[hashCode(key)];
	}
		
	public int hashCode(String key) {
//		int hashVal = 0;   
//		for(int i = key.length()-1; i >=0; i --) {
//			int letter = (int) key.charAt(i) ; // ASCII code --> A: 97, B: 98.....
//			hashVal += letter;  // addition is a problem when the sums of different Strings are the same, like abc = bbbb =cba ...
//		}
//		return hashVal;

		BigInteger hashVal = new BigInteger("0");  // BigInteger to avoid index out of bound
		BigInteger pow27 = new BigInteger("1");
		for(int i = key.length()-1; i >=0; i --) {
			int letter = (int) key.charAt(i);
			BigInteger letterB = new BigInteger(String.valueOf(letter));
			hashVal = hashVal.add(letterB.multiply(pow27));  // = hashVal += letter * pow27;
			pow27 = pow27.multiply(new BigInteger(String.valueOf(27))); //pow27 *= 27;
		}
		return hashVal.mod(new BigInteger(String.valueOf(arr.length))).intValue();
	}
	
}
