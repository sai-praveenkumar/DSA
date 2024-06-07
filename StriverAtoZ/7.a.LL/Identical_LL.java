//https://www.geeksforgeeks.org/problems/identical-linked-lists/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=linked-list-insertion

class Solution {
    
    //Function to check whether two linked lists are identical or not.
    public boolean isIdentical (Node head1, Node head2){
        Node temp1=head1,temp2=head2;
        int length1=0,length2=0;
        while(temp1!=null){
            length1++;
            temp1=temp1.next;
        }
        temp2=head2;
        while(temp2!=null){
            length2++;
            temp2=temp2.next;
        }
        temp1=head1;
        temp2=head2;
        while(temp1!=null && temp2!=null){
            if(temp1.data!=temp2.data) return false;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true && length1-length2==0;
    }
}