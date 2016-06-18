import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MinStack {
	private Stack<Integer> minStack = new Stack<Integer>();
	private Stack<Integer> normalStack = new Stack<Integer>();
	private int min;

	public void push(int x) {
		if (normalStack.empty()) {
			min = x;
			minStack.push(x);
			normalStack.push(x);
		} else {
			if (x < min) {
				min = x;
				minStack.push(x);
			}
			normalStack.push(x);
		}

	}

	public void pop() {
		minStack.pop();
		normalStack.pop();
		if (minStack.empty()) {
			min = 0;
		} else {
			if (minStack.peek() > min) {
				min = minStack.peek();
			}
		}
	}

	public int top() {
		return normalStack.peek();

	}

	public int getMin() {
		return min;
	}
}
