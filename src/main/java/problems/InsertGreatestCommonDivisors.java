package problems;

class InsertGreatestCommonDivisors {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode firstNode = head;
        while (head != null && head.next != null) {
            int insertedNode = getCommonDivisor(head.val, head.next.val);
            ListNode nodeToInsert = new ListNode(insertedNode);
            
            ListNode secondNode = head.next;
            
            head.next = nodeToInsert;
            
            nodeToInsert.next = secondNode;
            head = secondNode;
        }
        return firstNode;
    }
    
    private int getCommonDivisor(int a, int b) {
        for (int i = Math.min(a, b); i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }
}