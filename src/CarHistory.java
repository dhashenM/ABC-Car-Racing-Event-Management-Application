
public class CarHistory {
	int top;
	int capacity;
	int[] stack;
	CarHistory() {
		top = -1;
		capacity = 6;
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
			System.out.println("No more cars can be registered for the racing event");
		}
		return stack[++top] = data;
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("No cars have been registered");
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
}

