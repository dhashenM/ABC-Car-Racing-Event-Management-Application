
public class CarStack {
	int top;
	int capacity;
	String[] stack;
	CarStack() {
		top = -1;
		capacity = 24;
		stack = new String [capacity];
	}
	public boolean isEmpty() {
		return top == -1;
	}
	public boolean isFull() {
		return top == capacity-1;
	}
	public String push(String data) {
		if(isFull()) {
			System.out.println("No more cars can be registered for the racing event");
		}
		return stack[++top] = data;
	}
	public String pop() {
		if(isEmpty()) {
			System.out.println("No cars have been registered");
		}
		return stack[top--];
	}
	public String peek() {
		return stack[top];
	}
	public void display() {
		for (int i = 0; i <= stack.length-1; i ++) {
			if (stack[i] != null){
				System.out.print(stack[i]);
				if (i % 4 < 3) {
					System.out.print(", ");
				} else {
					System.out.println();
				}
			}
		}
	System.out.println();
	}	
}
