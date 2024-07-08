//https://www.codingninjas.com/studio/problems/left-rotate-an-array-by-one_5026278?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

import java.util.* ;
import java.io.*; 


public class Solution {

    static int[] rotateArray(int[] arr, int n) {
        reverse(arr,0,arr.length-1);
        reverse(arr,0,arr.length-2);
        return arr;
    }
    static void reverse(int[] arr,int start,int end){
        while(start<end){
            arr[start]=arr[start]+arr[end];
            arr[end]=arr[start]-arr[end];
            arr[start]=arr[start]-arr[end];
            start++;
            end--;
        }
    }
}

// LeetCode : https://leetcode.com/problems/rotate-array/description/

// Rotate right by k places
class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    void reverse(int[] arr, int start, int end){
        while(start<end){
            arr[start]=arr[start]+arr[end];
            arr[end]=arr[start]-arr[end];
            arr[start]=arr[start]-arr[end];
            start++;
            end--;
        }
    }
}

// Rotate ArrayList left by k places
//https://www.codingninjas.com/studio/problems/rotate-array_1230543?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

// ****V.V. Imp : Observe the difference between way of updating an array with an arraylist and the way of rotation towards left vs rotation towards right.

import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        k=k%arr.size();
        reverse(arr,0,arr.size()-1);
        reverse(arr,0,arr.size()-k-1);
        reverse(arr,arr.size()-k,arr.size()-1);
        return arr;
 
    }
    public static void reverse(ArrayList<Integer> nums,int start,int end){
        while(start<end){
           nums.set(end,nums.get(start)+nums.get(end));
           nums.set(start,nums.get(end)-nums.get(start));
           nums.set(end,nums.get(end)-nums.get(start));
            start++;
            end--;
        }
    }
}

// Check out the follow up questions as well.
