// Problem link : https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        long sum=0,max_sum=0;
        int left=0,right=K-1;
        for(int i=0;i<=K-1;i++){
            sum+=Arr.get(i);
        }
        max_sum=sum;
        while(right<Arr.size()-1){
            sum-=Arr.get(left);
            left++;
            right++;
            sum+=Arr.get(right);
            max_sum=Math.max(sum,max_sum);
        }
        return max_sum;
    }
}

// Follow up Q : https://www.naukri.com/code360/problems/maximum-of-all-subarrays-of-size-k_1170789?leftPanelTabValue=PROBLEM

import java.util.* ;
import java.io.*; 
public class Solution 
{

    public static ArrayList<Integer> maxOfSubarray(ArrayList<Integer> nums, int n, int k) 
	{
        ArrayList<Integer> ans = new ArrayList<>();
        int left=0,right=k-1;
        while(right < n){
            ans.add(findmax(nums,left,right));
            left++;
            right++;
        }
        return ans;
    }
    private static int findmax(ArrayList<Integer> arr, int left,int right){
        int max=0;
        for(int i=left;i<=right;i++)  max=Math.max(max,arr.get(i));
        
        return max;
        
    }

}