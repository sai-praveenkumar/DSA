// Problem link : https://www.geeksforgeeks.org/problems/binary-search-trees/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=binary-search-trees

class Solution {
    static boolean isBSTTraversal(int nums[]) {
        for(int i=0;i<nums.length-1;i++)
        if(nums[i]>=nums[i+1]) return false;
        return true;
  }
}

// Follow up Q : Is Full Binary Tree : https://www.geeksforgeeks.org/problems/full-binary-tree/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=binary-search-trees
class GfG
{
    // Return True if the given Binary Tree is a Full Binary Tree. Else return False
	boolean isFullTree(Node root)
    {
        if(root == null)
            return true;
        if((root.left != null && root.right == null) || (root.right != null && root.left == null))
            return false;
        return isFullTree(root.left) && isFullTree(root.right);
    }
}