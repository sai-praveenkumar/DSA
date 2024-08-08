// LeetCode : 48

// Brute Force
class Solution {
    public void rotate(int[][] matrix) {
        int[][] ans= new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                ans[j][ans.length-i-1]=matrix[i][j];
            }
        }
        for(int i=0;i<ans.length;i++){
            for (int j=0;j<ans[i].length;j++){
                matrix[i][j]= ans[i][j];
            }
        }
    }
}

// Optimal : 
class Solution {
    public void rotate(int[][] matrix) {
       for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[i].length;j++){
                matrix[i][j]^=matrix[j][i];
                matrix[j][i]^=matrix[i][j];
                matrix[i][j]^=matrix[j][i];
            }
       }
       for(int i=0;i<matrix.length;i++){
        reverse(matrix[i]);
       }
    }
    public void reverse(int[] arr){ 
        int start=0,end=arr.length-1;
        while(start<end){
            arr[start]^=arr[end];
            arr[end]^=arr[start];
            arr[start]^=arr[end];
            start++;
            end--;
        }
    }
}

// Follow up Q : Clockwise Rotation
// https://www.geeksforgeeks.org/problems/rotate-matrix-elements-clockwise2336/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
