package problems;

class MergeNodes {
    public ListNode mergeNodes(ListNode head) {
        ListNode writeHead = head;
        ListNode readHead = head.next;
        
        while (readHead != null) {
            int cumulativeSum = 0;
            while (readHead.val != 0) {
                cumulativeSum += readHead.val;
                readHead = readHead.next;
            }
            writeHead.val = cumulativeSum;
            writeHead = writeHead.next;
        }
        
        writeHead.next = null;
        
        return head;
    }
}