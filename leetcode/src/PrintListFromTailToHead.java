import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by majun on 2016/6/27.
 */
public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> integers = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        if (listNode == null) {
            return integers;
        }
        while (listNode != null) {
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.empty()) {
            integers.add(stack.pop());
        }
        return integers;
    }
}
