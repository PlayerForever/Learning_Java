package Array;

public class TestArray {
	public static void main(String[] args) {
		long[] arr = new long[] {2, 3, 4};
		System.out.println(arr[0]);
		
		Array arr1 = new Array(5);
		arr1.insert(12);
		arr1.insert(23);
		arr1.insert(34);
		arr1.insert(45);
		arr1.insert(56);
		
		arr1.display();
		
		System.out.println(arr1.search(34));
		System.out.println(arr1.get(3));
		
		arr1.delete(2);
		arr1.display();
		
		arr1.update(2, 12);
		System.out.println();
		
		arr1.display();
		System.out.println();
		
		
		OrderArray oarr = new OrderArray(5);
		oarr.insert(90);
		oarr.insert(40);
		oarr.insert(100);
		oarr.insert(20);
		oarr.insert(50);
		oarr.display();
		System.out.println();
		
		System.out.println(oarr.binarySearch(90));
		System.out.println();
		
	}
}
