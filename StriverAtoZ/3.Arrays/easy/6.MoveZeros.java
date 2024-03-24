//https://www.codingninjas.com/studio/problems/ninja-and-the-zero-s_6581958?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM

public class Solution {
    public static int[] moveZeros(int n, int []a) {
        int fast = 0,slow = 0;
        for(int i = 0 ; i < a.length ; i++){
            if(a[slow] != 0){
                slow++ ;
                fast++ ;
            }
            else{
                if(a[fast] != 0){
                    a[slow] =a[fast] ;
                    a[fast]=0 ;
                    slow++ ;
                    fast++ ;
                }
                else{
                    fast++ ;
                }
            }
        }
        for(int j=slow+1 ; j<a.length ; j++){

            a[j] = 0 ;
        }
        return a;
}
}

// https://leetcode.com/problems/move-zeroes/description/

class Solution {
    public void moveZeroes(int[] nums) {
        int fast=0,slow=0;
        for(int i=0;i<nums.length;i++){
            if(nums[slow]!=0){
                fast++;
                slow++;
            }
            else{
                if(nums[fast]!=0){
                    nums[slow]=nums[fast];
                    nums[fast]=0;
                    slow++;
                    fast++;
                }
                else{
                    fast++;
                }
            }
        }
        for(int j=slow+1;j<nums.length;j++){
        nums[j]=0;
        }
    }

}