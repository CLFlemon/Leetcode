package Hot019;

import java.util.HashMap;
import java.util.Stack;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        HashMap<Integer,ListNode> map = new HashMap<>();

        int k = 0;
        ListNode newHead = new ListNode(-1);
        newHead.next = head;

        ListNode result = newHead;



        while(newHead != null){
            map.put(k,newHead);
            k++;
            newHead = newHead.next;
        }

        int count = k - n ;

        ListNode p = map.get(count);
        ListNode pre = map.get(count-1);
        pre.next = p.next;

        return result.next;
    }
}
