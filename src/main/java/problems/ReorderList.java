package problems;

public class ReorderList {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        prev.next = null;
        ListNode list1 = head;
        ListNode list2 = reverseList(slow);
        merge(list1, list2);
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
    
    public void merge(ListNode list1, ListNode list2) {
        while (list2 != null) {
            ListNode l1_nextNode = list1.next;
            ListNode l2_nextNode = list2.next;
            
            list1.next = list2;
            
            list2 = l1_nextNode;
        }
    }
    
}
