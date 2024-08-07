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