package problems;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class MergeInBetween {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        ListNode firstPart = list1;
        ListNode secondPart = list1;
        
        for (int i = 0; i < a - 1; i++) {
            firstPart = firstPart.next;
        }
        
        for (int i = 0; i < b + 1; i++) {
            secondPart = secondPart.next;
        }
        
        firstPart.next = list2;
        
        while (list2.next != null) {
            list2 = list2.next;
        }
        list2.next = secondPart;
        
        return list1;
    }
}