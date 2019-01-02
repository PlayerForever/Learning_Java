package Stack_Queue;

public class Stack {
	
		private long[] arr;
		private int top;
		
		public Stack() {
			arr = new long[10];
			top = -1;
		}
		
		
		public Stack(int maxsize) {
			arr = new long[maxsize];
			top = -1;
		}
	
		public void push(int value) {
			arr[++top] = value;
		}
		
		public long pop() {
			return arr[top--];
		}
		
		
		public long peek() {
			return arr[top];
		}
		
		
		public boolean isEmpty() {
			return top == -1;
		}
		
		
		public boolean isFull() {
			return top == arr.length - 1;
		}
}
