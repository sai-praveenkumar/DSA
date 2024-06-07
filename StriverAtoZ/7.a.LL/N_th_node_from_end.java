//Problem link : https://www.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=linked-list-insertion
class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	if(head==null ) return -1;
    	int length=0;
        Node temp= head;
        while(temp!=null){
            length+=1;
            temp=temp.next;
        }
        temp=head;
        if(length<n) return -1;
        for(int i=0;i<length;i++){
            if(i==length-n) break;
            temp=temp.next;
        }
        return temp.data;
    }
}
// Same Q LeetCode 19 (using 2 pointer approach)
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
// Follow up Q : Middle element of a LL
//https://www.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=linked-list-insertion
class Solution
{
    int getMiddle(Node head)
    {
        Node temp=head;
        int length=0;
        while(temp!=null) {
            length+=1;
            temp=temp.next;
        }
        length=length/2+1;
        temp=head;
        while(length>1){
            temp=temp.next;
            length--;
        }
        return temp.data;
         
    }
}

