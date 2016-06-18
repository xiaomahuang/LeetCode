public class EntryNodeOfLoop {
    public ListNode getListNode(ListNode pHead) {
        ListNode listNode = getMeetingListNode(pHead);
        if (listNode == null) {
            return listNode;
        }
        int num = getCircleNum(listNode);
        ListNode quickListNode = pHead;
        for (int i = 0; i < num; i++) {
            quickListNode = quickListNode.next;
        }
        ListNode slowListNode = pHead;
        while (quickListNode != slowListNode) {
            quickListNode = quickListNode.next;
            slowListNode = slowListNode.next;
        }
        return slowListNode;
    }

    public ListNode getMeetingListNode(ListNode listNode) {
        if (listNode == null) {
            return null;
        }
        ListNode firstListNote = listNode;
        ListNode secondListNode = firstListNote.next;

        if (secondListNode != null) {
            while (firstListNote != secondListNode) {
                firstListNote = firstListNote.next;
                if (secondListNode.next != null) {
                    secondListNode = secondListNode.next;
                } else {
                    return null;
                }
                secondListNode = secondListNode.next;
                if (firstListNote == null || secondListNode == null)
                    return null;
            }
        }
        return secondListNode;
    }

    public int getCircleNum(ListNode listNode) {
        int num = 1;
        ListNode currentListNode = listNode.next;
        while (currentListNode != listNode) {
            currentListNode = currentListNode.next;
            num++;
        }
        return num;
    }
}
