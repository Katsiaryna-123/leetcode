package problems;

public class PalindromLinkedList {
    
    public boolean isPalindrome(ListNode head) {
        ListNode firstNode = head;
        int length = linkedListLength(head);
        for (int i = 0; i < length / 2 ; i++) {
            head = head.next;
        }
        ListNode reversed = reverseList(head);
        
        while (reversed != null) {
            if (reversed.val != firstNode.val) {
                return false;
            }
            reversed = reversed.next;
            firstNode = firstNode.next;
        }
        return true;
    }
    
    private ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
    
    private int linkedListLength(ListNode head) {
        int res = 0;
        while (head != null) {
            head = head.next;
            res = res + 1;
        }
        return res;
    }
}
