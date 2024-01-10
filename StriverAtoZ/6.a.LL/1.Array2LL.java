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

 *****************************************************************/

 public class Solution {
    public static Node constructLL(int []arr) {
        Node head=new Node(arr[0]);
        Node move=head;
        for(int i=1;i<arr.length;i++){
            Node temp =new Node(arr[i]);
            move.next=temp;
            move = temp;
        }
        return head;
    }
}

Problem Link : https://tinyurl.com/55cy4jtd
