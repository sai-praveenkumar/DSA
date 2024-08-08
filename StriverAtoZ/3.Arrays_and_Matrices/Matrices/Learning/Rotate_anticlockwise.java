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

// Brute Force Solution
class Solution
{
    public void rotate(int[][] matrix)
    {
        int n=matrix.length;
        int[][] ans= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[n-i-1][n-j-1]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]= ans[i][j];
            }
        }
    }
}

// Optimal Solution
class Solution
{
    public void rotate(int[][] matrix)
    {
        for(int i=0;i<matrix.length/2;i++){
            reverserows(matrix[i],matrix[matrix.length-i-1]);
        }
        for(int i=0;i<matrix.length;i++){
            reverseelements(matrix[i]);
        }
    }
    private static void reverserows(int[] arr1, int[] arr2){
        for(int i=0;i<arr1.length;i++){
            arr1[i]^=arr2[i];
            arr2[i]^=arr1[i];
            arr1[i]^=arr2[i];
        }
    }
    private static void reverseelements(int[] nums){
        int start=0,end=nums.length-1;
        while(start<end){
            nums[start]+=nums[end];
            nums[end]=nums[start]-nums[end];
            nums[start]-=nums[end];
            start++;
            end--;
        }
    }
}
