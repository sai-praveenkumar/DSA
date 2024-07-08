// Problem Link : https://www.geeksforgeeks.org/problems/introduction-to-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=introduction-to-doubly-linked-list

class Solution {
    Node constructDLL(int arr[]) {
        if(arr.length==0) return null;
        Node head=new Node(arr[0]);
        Node ptr=head;
        for(int i=1;i<arr.length;i++){
           Node temp = new Node(arr[i]);
            temp.prev=ptr;
            ptr.next=temp;
            ptr=temp;;
        }
        return head;
    }
}