// Coding Ninjas : https://www.codingninjas.com/studio/problems/remove-duplicates-from-sorted-array_1102307?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
public class Solution {
    public static int removeDuplicates(int[] arr,int n) {
        int count=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                count++;
            }
        }
        return count;
    }
}


// Leetcode : https://leetcode.com/problems/remove-duplicates-from-sorted-array/    -- This actually comes under a 2 pointer question. Check in that folder
