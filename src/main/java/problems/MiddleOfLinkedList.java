package problems;

class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        
        int nodesCount = 0;
        while (current != null) {
            nodesCount++;
            current = current.next;
        }
        
        ListNode middleNode = head;
        
            for (int i = 0; i < nodesCount / 2; i++) {
                middleNode = middleNode.next;
            }
        return middleNode;
    }
    
    public ListNode middleNodeWithTwoPointers(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        
        while (fast!=null){
            
            slow = slow.next;
            if(fast.next==null){
                fast=null;
            }
            else{
                fast = fast.next.next;}
            
        }
        return slow;
    }
}