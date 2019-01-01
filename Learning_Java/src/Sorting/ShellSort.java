package Sorting;

public class ShellSort {

	public static void sort(long[] arr) {
		int h = 1; //define the gap
		
		while(h < arr.length / 3) {  // compute the max. gap
			h = h * 3 + 1; 
		}
		
		while(h > 0) {
			// use insert sort
			long tmp = 0;
			for(int i = h; i < arr.length; i++) {
				tmp = arr[i];
				int j = i;
				while(j > 0 && arr[j - h] >= tmp) {
					arr[j] = arr[j - h];
					j -= h;
				}
				arr[j] = tmp;
			}
			// reduce gap
			h = (h - 1) / 3;
		}
	}
	

}
