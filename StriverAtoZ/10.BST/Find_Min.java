//Problem link : https://www.geeksforgeeks.org/problems/minimum-element-in-bst/1
class Solution {
    // Function to find the minimum element in the given BST.
    int minValue(Node root) {
        if(root.left==null) return root.data;
        return minValue(root.left);
    }
}


// Follow up Q : https://www.geeksforgeeks.org/problems/search-a-node-in-bst/1

class BST {
    // Function to search a node in BST.
    boolean search(Node root, int x) {
        if(root== null) return false;
        if(root.data == x) return true;
        else if(root.data >x) return search(root.left,x);
        else return search(root.right,x);
    }
}

// Follow up Q : Check for BST :https://www.geeksforgeeks.org/problems/check-for-bst/1

