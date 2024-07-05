package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

//не решила =(
public class RemoveZeroSumSublists {
    public ListNode removeZeroSumSublists(ListNode head) {
        HashMap<Integer, ListNode> hashMap = new HashMap<>();
        
        ListNode firstNode = head;
        
        int sum = head.val;
        int previousSum = head.val;
        List<Integer> sumForRemovalInHashMap = new ArrayList<>();
        
        while (head != null) {
            if (!hashMap.containsKey(sum) && sum != 0) {
                hashMap.put(sum, head);
                head = head.next;
                previousSum = sum;
            } else {
                Set<Integer> keyset = hashMap.keySet();
                for (int num : keyset) {
                    if (num <= previousSum)
                        sumForRemovalInHashMap.add(num);
                }
                for (int s : sumForRemovalInHashMap) {
                    hashMap.remove(s);
                }
                head = head.next;
                
            }
            if (head != null) {
                sum = sum + head.val;
            }
        }
        
        
        while (firstNode.next != null) {
            while (!hashMap.containsValue(firstNode)) {
                firstNode = firstNode.next;
            }
            
            if (hashMap.containsValue(firstNode)) {
                firstNode = firstNode.next;
            }
        }
        System.out.println(hashMap);
        System.out.println("initial is " + firstNode.val);
        
        return firstNode;
    }
}
