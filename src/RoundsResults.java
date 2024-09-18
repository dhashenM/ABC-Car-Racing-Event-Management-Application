
public class RoundsResults {
	int top;
	int capacity;
	int[] stack;
	RoundsResults() {
		top = -1;
		capacity = 18;
		stack = new int [capacity];
	}
	public boolean isEmpty() {
		return top == -1;
	}
	public boolean isFull() {
		return top == capacity-1;
	}
	public int push(int data) {
		if(isFull()) {
			System.out.println("All cars have passed the finish line");
		}
		return stack[++top] = data;
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("No cars have passed the finish line yet");
		}
		return stack[top--];
	}
	public int peek() {
		return stack[top];
	}
	public void display() {
		for (int i:stack) {
			System.out.println(i); 
		}
	}
	public void displayWinners() {
		System.out.print("1st place is car number: ");
		System.out.println(stack[top-2]);
		System.out.print("2nd place is car number: ");
		System.out.println(stack[top-1]);
		System.out.print("3rd place is car number: ");
		System.out.println(stack[top]);
	
	}	
}
