/**
 * Created by ws03 on 2016/6/18.
 */
public class DeleteDuplication {
    public static ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null)
            return null;
        ListNode myListNode=new ListNode(pHead.val+1);
        myListNode.next=pHead;
        ListNode currentListNode = myListNode;
        while (currentListNode.next != null && currentListNode.next.next != null) {
            if (currentListNode.next.val != currentListNode.next.next.val) {
                currentListNode = currentListNode.next;
            } else {
                while (currentListNode.next.val == currentListNode.next.next.val) {
                    currentListNode.next = currentListNode.next.next;
                    if (currentListNode.next.next == null) {
                        currentListNode.next = null;
                        return myListNode.next;
                    }
                }
                currentListNode.next = currentListNode.next.next;
            }


        }
        return myListNode.next;
    }
}
