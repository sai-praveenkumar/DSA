// Leetcode : https://leetcode.com/problems/remove-duplicates-from-sorted-array/ 

class Solution {
    public int removeDuplicates(int[] nums) {
        int fast=0,slow=0,count=1;
        for(int i=0; i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                fast++;
            }
            else{
                fast++;
                slow++;
                nums[slow]=nums[fast];
                count++;
            }
        }
        for(int j=slow+1;j<nums.length;j++){
            nums[j]='_';
        }
        return count;
    }
}