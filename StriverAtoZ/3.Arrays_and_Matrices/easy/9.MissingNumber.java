// LeetCode : https://leetcode.com/problems/missing-number/
class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
    return ((nums.length)*(nums.length+1)/2) - sum;
    }
}

// Approach 2 : Using XOR operations
// Logic : XOR of something with 0 wil return the same number. ex:  5^0 = 5
//        : XOR of 2 same numbers will return 0. ex : 5^5= 0
//        : XORing 2 different numbers will result nothing ex :4^5= 5^4  (Order also doesn't matter in XOR operations)
class Solution {
    public int missingNumber(int[] nums) {
       int sum = 0;
       for(int i=1;i<=nums.length;i++)
            sum^=i;
        for(int i=0;i<nums.length;i++)
            sum^=nums[i];
        return sum;

    }
}
// Follow up Q : very imp