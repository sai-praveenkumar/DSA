// Leetcode 700
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        if(root.val == val) return root;
        else if(root.val < val) return searchBST(root.right,val);
        else return searchBST(root.left,val);
    }
}

// Follow up Q : 701, 2476