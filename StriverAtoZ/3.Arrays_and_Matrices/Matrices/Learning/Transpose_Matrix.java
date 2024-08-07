// Problem Link : https://www.geeksforgeeks.org/problems/transpose-of-matrix-1587115621/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card


class Solution
{
    public void transpose(int n,int arr[][])
    {
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                arr[i][j]^=arr[j][i];
                arr[j][i]^=arr[i][j];
                arr[i][j]^=arr[j][i];
            }
        }
    }
}

// Recursive Solution : https://www.geeksforgeeks.org/problems/swapping-triangles5209/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

class Solution {
    int[][] swapTriangle(int N, int A[][]) {
        outerloop(A,0);
        return A;
    }
 private static void outerloop(int[][] matrix,int index){
     if(index==matrix.length) return;
     innerloop(matrix,index,index+1);
     outerloop(matrix,index+1);
 }   
 private static void innerloop(int[][] matrix, int outer_iterator, int inner_iterator){
     if(inner_iterator==matrix.length) return;
     matrix[outer_iterator][inner_iterator]^=matrix[inner_iterator][outer_iterator];
     matrix[inner_iterator][outer_iterator]^=matrix[outer_iterator][inner_iterator];
     matrix[outer_iterator][inner_iterator]^=matrix[inner_iterator][outer_iterator];
     innerloop(matrix,outer_iterator,inner_iterator+1);
 }
}