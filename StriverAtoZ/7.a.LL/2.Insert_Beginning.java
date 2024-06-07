 public class Solution
 {
     public static Node insertAtFirst(Node list, int newValue) {
         Node head=new Node(newValue);
         head.next= list;
         list=head;
         return list;
     }
 }

 //Problem Link : https://www.codingninjas.com/studio/problems/insert-node-at-the-beginning_8144739?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

 //Follow up q : https://www.geeksforgeeks.org/problems/linked-list-insertion-1587115620/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=linked-list-insertion

 class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        Node temp=new Node(x);
        temp.next=head;
        head=temp;
        return head;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        Node temp1=new Node(x);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=temp1;
        return head;
    }
}