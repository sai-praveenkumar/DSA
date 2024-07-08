// Problem Link : https://www.geeksforgeeks.org/problems/delete-node-in-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=delete-node-in-doubly-linked-list
class Solution {
    public Node deleteNode(Node head, int x) {
        Node temp=head;
             int cnt=1;
             if(head==null) return null;
             if(x==1){
                   return head.next;
             }
             while(temp != null){
                   if(cnt==x){
                        temp.prev.next=temp.next;
                        
                   }
                   
                   temp=temp.next;
                   cnt++;
             }
             
             return head;
    }
}
