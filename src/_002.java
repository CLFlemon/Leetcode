import java.util.HashMap;
import java.util.Stack;

public class _002 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */

    /*    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int temp1 = 0;
            int temp2 = 0;



            for(int i = 0; l1 != null; i++){
                temp1 += l1.val* Math.pow(10,i);
                l1 = l1.next;
            }

            for(int i = 0; l2 != null; i++){
                temp2 += l2.val* Math.pow(10,i);
                l2 = l2.next;
            }

            int resulttemp = temp1+temp2;
            if(resulttemp == 0) return new ListNode(0);
            ListNode head = new ListNode(-1);
            ListNode p = head;

            while(resulttemp != 0){
                int temp = resulttemp%10;
                resulttemp = resulttemp/10;
                ListNode node = new ListNode(temp);
                p.next = node;
                p = node;
            }
            return head.next;
        } */
    public int lengthOfLongestSubstring(String s) {
       int length = s.length();
       int ans = 0;
       HashMap<Character,Integer> hashMap = new HashMap<>();
       for(int left = 0,right = 0; right<length;right++){
           char temp = s.charAt(right);
           if(hashMap.containsKey(temp)){ //重复
               left = Math.max(hashMap.get(temp),left);
           }

           ans = Math.max(ans,right-left+1);
           hashMap.put(temp,right+1);
        }
        return ans;
    }


}
