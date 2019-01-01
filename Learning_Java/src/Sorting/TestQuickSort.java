package Sorting;

public class TestQuickSort {

	public static void main(String[] args) {
		long[] arr = new long[10];
		for(int i = 0; i< 10; i++) {
			arr[i] = (long) (Math.random() * 99);
		}
		
		QuickSort.displayArr(arr);

//		long point = arr[arr.length -1];
		
//		QuickSort.partition(arr, 0, arr.length-1, arr[arr.length -1]);
		
		QuickSort.sort(arr, 0, arr.length-1);
	
		QuickSort.displayArr(arr);
	}

}
