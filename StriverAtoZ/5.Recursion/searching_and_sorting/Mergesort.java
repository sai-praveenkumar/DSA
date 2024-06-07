import java.util.*;
public class Mergesort{
    public static void main(String[] args){
        int[] arr = {12,3,43,432,554,438,557,437,5967};
        arr=mergesort(arr);
        System.out.print(Arrays.toString(arr));
    }
    static int[] mergesort(int[] arr){
        if(arr.length==1) return arr;
        int mid=arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    public static int[] merge(int[] left, int[] right){
        int i=0,j=0,k=0;
        int[] ans = new int[left.length+right.length];
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                ans[k]=left[i];
                i++;
            }
            else{
                ans[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            ans[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            ans[k]=right[j];
            j++;
            k++;
        }
        return ans;
    }
}

// Merge Sort Inplace 

// Problem link : https://www.geeksforgeeks.org/problems/merge-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=merge-sort

// Using array as Auxilary space
class Solution {
    private static void merge(int[] arr, int low, int mid, int high) {
       int[] temp= new int[high-low+1];
       int left=low;
       int right=mid+1;
       int k=0;
       while (left <= mid && right <= high) {
           if (arr[left] <= arr[right]) {
               temp[k]=arr[left];
               left++;
           } 
           else {
               temp[k]=arr[right];
               right++;
           }
           k++;
       }

       while (left <= mid) {
           temp[k]=arr[left];
           left++;
           k++;
       }

       while (right <= high) {
           temp[k]=arr[right];
           right++;
           k++;
       }

       for (int i = low; i <= high; i++) {
           arr[i] = temp[i - low];
       }
   }

   public static void mergeSort(int[] arr, int low, int high) {
       if (low >= high) return;
       int mid = (low + high) / 2 ;
       mergeSort(arr, low, mid);  
       mergeSort(arr, mid + 1, high); 
       merge(arr, low, mid, high);  
   }
}

// Using ArrayList as an auxilary space

class Solution {
    private static void merge(int[] arr, int low, int mid, int high) {
       ArrayList<Integer> temp = new ArrayList<>(); 
       int left = low;      
       int right = mid + 1;   

       while (left <= mid && right <= high) {
           if (arr[left] <= arr[right]) {
               temp.add(arr[left]);
               left++;
           } else {
               temp.add(arr[right]);
               right++;
           }
       }

       while (left <= mid) {
           temp.add(arr[left]);
           left++;
       }

       while (right <= high) {
           temp.add(arr[right]);
           right++;
       }

       for (int i = low; i <= high; i++) {
           arr[i] = temp.get(i - low);
       }
   }

   public static void mergeSort(int[] arr, int low, int high) {
       if (low >= high) return;
       int mid = (low + high) / 2 ;
       mergeSort(arr, low, mid);  
       mergeSort(arr, mid + 1, high); 
       merge(arr, low, mid, high);  
   }
}
