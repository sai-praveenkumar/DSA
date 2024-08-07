// problem Link : https://www.geeksforgeeks.org/problems/rotate-by-90-degree-1587115621/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

// Brute Force
class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int matrix[][], int n) 
    { 
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
    public static void reverse(int[] arr){ 
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

// Optimal


// Follow up Q : 180 degree rotation
//https://www.geeksforgeeks.org/problems/c-matrix-rotation-by-180-degree0745/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
