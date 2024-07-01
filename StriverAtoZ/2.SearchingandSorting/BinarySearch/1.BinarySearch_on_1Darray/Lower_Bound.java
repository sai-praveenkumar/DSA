//Problem Link : https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1?track=DSASP-Searching&amp%253BbatchId=154&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=floor-in-a-sorted-array
class Solution{
    
    static int findFloor(long arr[], int n, long x)
    {
        int floor=-1;
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]< x){
                floor=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return floor;
    }
    
}
