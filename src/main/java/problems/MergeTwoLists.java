package problems;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode fakeNode = new ListNode();
        ListNode result = fakeNode;
        
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                fakeNode.next = list1;
                list1 = list1.next;
            } else {
                fakeNode.next = list2;
                list2 = list2.next;
            }
            fakeNode = fakeNode.next;
        }
        
        if (list1 == null) {
            fakeNode.next = list2;
        } else {
            fakeNode.next = list1;
        }
        
        return result;
    }
}
