package Sorting;

public class TestSort {
	public static void main(String[] args) {
		long[] arr = new long[5];
		arr[0] = 23;
		arr[1] = 34;
		arr[2] = 45;
		arr[3] = 15;
		arr[4] = -1;
		
		System.out.print("Orinigal array: ");
		for(long num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		BubbleSort.sort(arr); // bubble sorting
		System.out.print("Bubble Sort: ");
		for(long num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		SelectionSort.sort(arr); // selection sorting
		System.out.print("Selection Sort: ");
		for(long num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		
		InsertSort.sort(arr); // insert sorting
		System.out.print("Insert Sort: ");
		for(long num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		
		ShellSort.sort(arr); // shell sorting
		System.out.print("Shell Sort: ");
		for(long num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	
		
	}

}
