import java.util.Stack;


public class StackToQueue {
	// Push element x to the back of queue.
		Stack<Integer> stackA = new Stack<Integer>();
		Stack<Integer> stackB = new Stack<Integer>();

		public void push(int x) {
			stackA.push(x);
		}

		// Removes the element from in front of queue.
		public void pop() {
			if (stackA.isEmpty() && stackB.isEmpty()) {
				return;
			}
			if (stackB.isEmpty()) {
				while (!stackA.isEmpty()) {
					stackB.push(stackA.peek());
					stackA.pop();
				}
			}
			stackB.pop();
		}

		// Get the front element.
		public int peek() {
			if (stackA.isEmpty() && stackB.isEmpty()) {
				return 0;
			}
			if (stackB.isEmpty()) {
				while (!stackA.isEmpty()) {
					stackB.push(stackA.peek());
					stackA.pop();
				}
			}
			return stackB.peek();

		}

		// Return whether the queue is empty.
		public boolean empty() {
			if (stackA.isEmpty() && stackB.isEmpty()) {
				return true;
			}
			return false;
		}
}
