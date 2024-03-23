// Coding Ninjas : https://www.codingninjas.com/studio/problems/ninja-and-the-sorted-check_6581957?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class Solution {
    public static int isSorted(int n, int []a) {
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1])
            return 0;
        }
        return 1;
    }
}


//Leetcode : https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/

/*
  Logic : check the edge case that arr[start]>arr[end] is always true if the array is already sorted.
 */

class Solution {
    public boolean check(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[((i+1)%nums.length)])
                count++;
        }
        return count <=1;

    }

}