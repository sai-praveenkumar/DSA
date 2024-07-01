//Leetcode 35 
class Solution {
    public int searchInsert(int[] nums, int target) {
        int upperbound=nums.length;
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                upperbound=mid;
                end=mid-1;
            }
        }
        return upperbound;
    }
}
// Follow up Q : Leetcode 278
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=1,end=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isBadVersion(mid)){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}
// Problem Link : https://www.geeksforgeeks.org/problems/ceil-the-floor2802/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=ceil-the-floor
class Solve {
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        int flor=-1,ciel=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return new Pair(arr[i],arr[i]);
            }
            else if(arr[i]<x){
                if(flor<arr[i]){
                    flor=arr[i];
                }
            }
            else{
                if(ciel==-1) ciel=arr[i];
                else{
                    if(ciel>arr[i]){
                        ciel=arr[i];
                    }
                }
            }
        }
        return new Pair(flor,ciel);
    }
}