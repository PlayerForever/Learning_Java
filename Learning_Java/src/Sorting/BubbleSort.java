package Sorting;

public class BubbleSort {
	public static void sort(long[] arr) {
		long tmp = 0;
		for(int i=0; i< arr.length-1; i++) {
			for(int j = arr.length -1; j > 0; j --) {
				if(arr[j] < arr[j-1]) {
					tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
				}
			}
		}
	}
}
