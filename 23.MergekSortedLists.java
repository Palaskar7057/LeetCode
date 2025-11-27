/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
    ListNode head=new ListNode(0);
    Queue<ListNode>mainHeap=new PriorityQueue<ListNode>((a,b)->a.val-b.val);
    for(ListNode i: lists){
        if(i!=null){
            mainHeap.add(i);
        }
    }    
    ListNode curr=head;
    while(mainHeap.size()>0){
        ListNode min=mainHeap.poll();
        if(min.next!=null){
            mainHeap.add(min.next);
        }
        curr.next=min;
        curr=curr.next;

    }
    return head.next;
    }
}