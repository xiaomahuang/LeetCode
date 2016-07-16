/**
 * Created by majun on 2016/6/30.
 */
public class FindKthToTail {
    public ListNode findKthToTail(ListNode head, int k) {
        if (head == null || k <= 0) {
            return null;
        }
        ListNode listNode = head;
        for (int i = 0; i < k; i++) {
            if (listNode == null) {
                return null;
            }
            listNode = listNode.next;
        }
        while (listNode != null) {
            head = head.next;
            listNode = listNode.next;
        }
        return head;
    }
}
