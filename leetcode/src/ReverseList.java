import java.util.Stack;

/**
 * Created by majun on 2016/6/30.
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        Stack<Integer> stack = new Stack<>();
        ListNode listNode = head;
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ListNode listNode1 = head;
        while (listNode1 != null) {
            listNode1.val = stack.pop();
            listNode1 = listNode1.next;
        }
        return head;
    }


    public ListNode ReverseList(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
