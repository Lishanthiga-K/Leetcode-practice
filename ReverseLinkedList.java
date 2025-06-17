class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current=head,prev=null,next=null;
        
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
        return head;
    }
    
}
