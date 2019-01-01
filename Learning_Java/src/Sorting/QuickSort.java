package Sorting;

public class QuickSort {
	
	public static int partition(long[] arr, int left, int right, long point) { // partition the array
		int leftPtr = left - 1;
		int rightPtr = right;
		while(true) { // a dead cycle to keep the recursion run
			//move the numbers to left, which are smaller than the keyword 'point'
			while(leftPtr < rightPtr && arr[++leftPtr] < point);
			
			//move the numbers to right, which are larger than the keyword 'point'
			while(rightPtr > leftPtr  && arr[--rightPtr] > point);
			
			if(leftPtr >= rightPtr) {
				break;
			} else {
				long tmp = arr[leftPtr];
				arr[leftPtr] = arr[rightPtr];
				arr[rightPtr] = tmp;
			}
		}
		// exchange keyword 'point' and current 'leftPtr'
		long tmp = arr[leftPtr];
		arr[leftPtr] = arr[right];
		arr[right] = tmp;
		
		return leftPtr;
	}
	
	
	public static void displayArr(long[] arr) {
		System.out.print("Quick Sort: ");
		for(long num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		
	}
	
	public static void sort(long[] arr, int left, int right) {
		
		if(right - left <= 0) {
			return;
		} else {
			
		long point = arr[right]; // set keyword
		
		// get the partition point and divide the array
		int partition = partition(arr, left, right, point);
		
		// quick sort the left sub-array
		sort(arr, left, partition - 1);
		
		// quick sort the right sub-array
		sort(arr, partition, right);
		
		}
	}

}
