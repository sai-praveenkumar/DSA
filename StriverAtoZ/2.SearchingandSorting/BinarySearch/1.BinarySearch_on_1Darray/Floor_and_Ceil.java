// Problem Link : https://www.naukri.com/code360/problems/ceiling-in-a-sorted-array_1825401?leftPanelTabValue=PROBLEM

import java.util.* ;
import java.io.*; 

public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      int start=0,end=a.length-1;
      int[] ans=new int[2];
      ans[0]=-1;
      ans[1]=-1;
      while(start<=end){
        int mid=start+(end-start)/2;
        if(a[mid]==x) {
          ans[0]=a[mid];
          ans[1]=a[mid];
          break;
        }
        else if(a[mid]< x){
          ans[0]=a[mid];
          start=mid+1;
        }
        else{
          ans[1]=a[mid];
          end=mid-1;
        }
      }
      return ans;
    }
    
}