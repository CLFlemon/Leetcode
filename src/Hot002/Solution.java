package Hot002;

public class Solution {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head = new  ListNode(-1);
            ListNode p = head;
            int x,y,flag = 0;
            while(l1 != null || l2 != null){
                x = l1 == null ? 0 : l1.val;
                y = l2 == null ? 0 : l2.val;
                int sum = x+y+flag;
                flag = sum /10;
                sum = sum%10;
                ListNode node = new ListNode(sum);
                p.next = node;
                p = node;
                if(l1 != null) l1 = l1.next;
                if(l2 != null) l2 = l2.next;
            }

            if(flag == 1){
                p.next = new ListNode(flag);
            }
            return head.next;
        }
}
