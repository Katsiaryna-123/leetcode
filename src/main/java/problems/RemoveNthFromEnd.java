package problems;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = getLinkedListLength(head);
        ListNode node = head;
        for (int i = 0; i < size - n - 1; i++) {
            node = node.next;
        }
        
        if (node.next == null)
            return null;
        
        node.next = node.next.next;
        
        return head;
    }
    
    public int getLinkedListLength(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }
}
