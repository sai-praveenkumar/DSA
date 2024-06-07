// Q: LeetCode 2095   Delete middle element using a 2 pointer approach.
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode slow = head;
            ListNode fast = head;
            ListNode ptr = null;
            while(fast!=null && fast.next!=null){
                ptr = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
         ptr.next = ptr.next.next;
         return head;
                   
    }
}

// Follow up Q: LeetCode 19 : Nth node from end of a ll


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode first = dummy;
        ListNode second = dummy;

        int i = 0;
        while (first != null){
            if (i <= n){
                first = first.next;
                i++;
            } else {
                first = first.next;
                second = second.next;
            }
        }

        second.next = second.next.next;
        return dummy.next;
    }
}

// Follow up : LeetCode 1721 : Swapping Nodes in a LL

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        
          ListNode slow = head;
          ListNode fast = head;

           while(--k>0){

                fast = fast.next;
           }

            ListNode first = fast;

             while(fast.next!=null){

                   slow  = slow.next;
                   fast  = fast.next;
             }

              int temp = slow.val;
              slow.val = first.val;
              first.val = temp;

              return head;
    }
}
