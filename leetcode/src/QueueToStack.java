import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueToStack {
	Queue<Integer> quereB = new LinkedList<Integer>();

	// Push element x onto stack.
	public void push(int x) {
		quereB.add(x);
		for (int i = 0; i < quereB.size() - 1; i++) {
			quereB.offer(quereB.poll());
		}
	}

	// Removes the element on top of the stack.
	public void pop() {
		if (quereB.isEmpty()) {
			return;
		}
		quereB.poll();
	}

	// Get the top element.
	public int top() {
		if (quereB.isEmpty()) {
			return 0;
		}
		return quereB.peek();
	}

	// Return whether the stack is empty.
	public boolean empty() {
		if (quereB.isEmpty()) {
			return true;
		}
		return false;
	}
}
