package Array;

public class OrderArray {
private long[] arr;
	
	private int len;
	
	public OrderArray() {
		arr = new long[50];
	}
	
	
	public OrderArray(int maxsize) {
		arr = new long[maxsize];
	}
	
	public void insert(long value) {
		int i;
		for(i = 0; i < len; i++) {
			if(arr[i] > value) {
				break;
			}
		}
		
		for(int j = len; j > i; j --) {
			arr[j] = arr[j - 1];
		}
		arr[i] = value;
		len ++;
	}
	
	public void display() {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public int search(long value) { // find a particular value, return index
		int i;
		for(i = 0; i < arr.length; i++) {
			if(value == arr[i]) {
				break;
			} 
		}
		
		if (i == len) {
			return -1;
		} else {
			return i;
		}
	}
	
	
	public int binarySearch(long value) {
		int middle = 0; // index of the item in the middle
		int low = 0; // index of the first item at the half array
		int pow = len; // index of the last item at the half array
		
		while(true) {
			middle = (pow + low) / 2;
			if(arr[middle] == value) {
				return middle;
			} else if(low > pow) {
				return -1;
			} else {
				if(arr[middle] > value) {
					pow = middle - 1;
					
				} else {
					low = middle + 1;
				}
			}
		}
	}
	
	
	public long get(int index) {
		if(index >= len || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			return arr[index];
		}
	}
	
	
	public void delete(int index) {
		if(index >= len || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			for(int i = index; i < len; i++) {
				arr[index] = arr[index + 1];
			}
			len --;
		}
	}
	
	public void update(int index, long newValue) {
		if(index >= len || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			arr[index] = newValue;
		}
	}
	
}
