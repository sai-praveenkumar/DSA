//https://www.codingninjas.com/studio/problems/find-the-single-element_6680465?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM

public class Solution {
    public static int getSingleElement(int []arr){
        int temp=arr[0],i=1;
        while(i<arr.length){
            temp ^= arr[i];
            i++;
        }
        return temp;
    }
}

//https://leetcode.com/problems/single-number/description/
class Solution {
    public int singleNumber(int[] nums) {
        int temp=nums[0];
        for(int i=1;i<nums.length;i++){
            temp^=nums[i];
        }
        return temp;
    }
}
