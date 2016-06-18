public class EntryNodeOfLoop {
	public ListNode getListNode(ListNode pHead) {
		ListNode listNode = getMeetingListNode(pHead);
		if (listNode == null) {
			return listNode;
		}
	}

	public ListNode getMeetingListNode(ListNode listNode) {
		if (listNode == null) {
			return null;
		}
		ListNode firstListNote = listNode;
		ListNode secondListNode = firstListNote.next;
		if (firstListNote != null && secondListNode != null) {
			if (firstListNote==secondListNode) {
				return secondListNode;
			}
			firstListNote=firstListNote.next;
			secondListNode=secondListNode.next;
		}
		return null;
	}
}
