/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 ****************************************************************/

 public class Solution {
    public static Node deleteLast(Node list){
        if(list.next==null)
        return null;
        Node head= list;
        while(head.next!=null){
            if(head.next.next==null){
                head.next=null;
                break;
            }
            head=head.next;
        }
        return list;
    }
}

//Problem link : https://www.codingninjas.com/studio/problems/delete-node-of-linked-list_8160463?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf


// Folow up Q: Leetcode 237

class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}

//Follow up Q : Leetcode 203
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
        return null;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode move=dummy;
        while(move.next!=null){
            if(move.next.val==val){
                move.next=move.next.next;
            }
            else{
                move=move.next;
            }
        }
        return dummy.next;
    }
}