// Problem Link : https://www.geeksforgeeks.org/problems/insert-a-node-in-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=insert-a-node-in-doubly-linked-list
class GfG
{
   void addNode(Node head_ref, int pos, int data){
   int ind=1;
   Node newNode=new Node(data);
   Node temp =head_ref;
   while(temp != null){
        if(ind==pos+1){
            newNode.prev=temp;
            newNode.next=temp.next;
            temp.next=newNode;
        }
        ind++;
        temp=temp.next;
    }
   }
}