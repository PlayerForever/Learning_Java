package Sorting;

public class InsertSort {
	public static void sort(long[] arr) {
		long tmp = 0;
		
		for(int i = 1; i < arr.length; i++) {
			tmp = arr[i];
			int j = i;
			while(j > 0 && arr[j] >= tmp) {
				arr[j] = arr[j - 1];  // TODO: why the last item will stay at last? Not compared?
				j--;
			}
			arr[j] = tmp;
		}
	}
}
