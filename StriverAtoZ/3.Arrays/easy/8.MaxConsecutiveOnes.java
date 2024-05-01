//https://leetcode.com/problems/max-consecutive-ones/description/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt1=0,cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)
                cnt1++;
            else{
                cnt2=Math.max(cnt1,cnt2);
                cnt1=0;
            }
        }
        return Math.max(cnt1,cnt2);
    }
}

// 2nd logic for same question (Try to understand the thinking process)
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt1=0,cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cnt1++;
                cnt2=Math.max(cnt1,cnt2);
            }
            else
                cnt1=0;
        }
        return cnt2;
    }
}

//Similar Questions :https://www.naukri.com/code360/problems/maximum-consecutive-ones_892994?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//                   https://www.naukri.com/code360/problems/traffic_6682625?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
// Leetcode : Max Consecutive Ones III : https://leetcode.com/problems/max-consecutive-ones-iii/description/

class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0,n=nums.length,ans=0,z=0;

            while(r<n)
            {
                if(nums[r]==0) z++;
                while(z>k)
                {
                    if(nums[l]==0) z--;l++;
                }

                ans = Math.max(ans,r-l+1);
                r++;
            }    
            return ans;
    }
}