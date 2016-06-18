import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeftRotateString {
	public String rotateString(String str, int n) {
		if (str == null || str.isEmpty()) {
			return "";
		}
		char[] cs = str.toCharArray();
		int length = str.length();
		int rotateN = n % length;
		Queue<Character> lists = new LinkedList<Character>();
		for (int i = rotateN; i < length; i++) {
			lists.offer(cs[i]);
		}
		for (int i = 0; i < rotateN; i++) {
			lists.offer(cs[i]);
		}
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < cs.length; i++) {
			builder.append(lists.poll());
		}
		return builder.toString();
	}
}
