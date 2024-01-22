import java.util.*;
public class BinarySearch{
    public static void main(String[] args){
        int[] arr={3,13,16,26,27,45};
        int target=26;
        System.out.println(binarysearch(arr,0,arr.length-1,target));
    }
    private static int binarysearch(int[] arr, int start,int end, int target){
        if(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]== target)
            return mid;
            else if(arr[mid]< target)
            return binarysearch(arr,mid+1,end,target);
            else
            return binarysearch(arr,start,mid-1,target);

        }
        return -1;
    }
}