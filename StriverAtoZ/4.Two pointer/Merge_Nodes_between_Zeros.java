// LeetCode 2181
class Solution {
    public ListNode mergeNodes(ListNode head) {
        if(head.next==null) return null;
        int sum=0;
        ListNode first=head;
        ListNode second=head.next;
        while(second!=null){
            if(second.val != 0){
                sum+=second.val;
            }
            else{
                first.val=sum;
                if(second.next==null) break;
                first=first.next;
                sum=0;
            }
            second=second.next;
        }
        first.next=null;
        return head;
    }
}