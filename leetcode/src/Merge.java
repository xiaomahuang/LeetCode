/**
 * Created by ws03 on 2016/7/3.
 */
public class Merge {
    public ListNode merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode head = new ListNode(0);
        ListNode listNode;
        if (list1.val > list2.val) {
            listNode = new ListNode(list2.val);
            list2 = list2.next;
        } else {
            listNode = new ListNode(list1.val);
            list1 = list1.next;
        }
        head.next = listNode;
        while (list1 != null && list2 != null) {
            ListNode node = new ListNode(0);
            if (list1.val > list2.val) {
                node.val = list2.val;
                listNode.next = node;
                listNode = node;
                list2 = list2.next;
            } else {
                node.val = list1.val;
                listNode.next = node;
                listNode = node;
                list1 = list1.next;
            }
        }
        while (list1 != null) {
            ListNode node = new ListNode(0);
            node.val = list1.val;
            listNode.next = node;
            listNode = node;
            list1 = list1.next;
        }
        while (list2 != null) {
            ListNode node = new ListNode(0);
            node.val = list2.val;
            listNode.next = node;
            listNode = node;
            list2 = list2.next;
        }
        return head.next;
    }
}
