package Hot023;

import Hot023.ListNode;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        Queue<ListNode> queue = new PriorityQueue<>(
                (v1,v2) -> v1.val -v2.val
        );

        for(ListNode e : lists){
            if(e != null)
                queue.offer(e);
        }


        ListNode result = new ListNode(-1);
        ListNode p = result;

        while(!queue.isEmpty()){

            ListNode min = queue.poll();

            p.next = min;
            p = p.next;

            if(min.next != null){
                queue.offer(min.next);
            }

        }


        return result.next;

    }
}