//Problem link : https://www.geeksforgeeks.org/problems/reverse-sub-array5620/1

class Solution {
    void reverseSubArray(int arr[], int n, int l, int r) {
        if(l<0 || r> arr.length) return;
        reverse(arr,--l,--r);
    }
      public void reverse(int arr[], int start, int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
      }
     public void swap(int[] arr, int start, int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}

//Follow up Q : https://www.geeksforgeeks.org/problems/reverse-array-in-groups0255/1
class Solution {
    
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        if(k>n){
            k=n;
            reverse(arr,0,n-1);
            return;
        }
        int start1=0,end1=k-1;
        int start2=k,end2=arr.size()-1;
        reverse(arr,start1,end1);
        reverse(arr,start2,end2);
    }
    public void reverse(ArrayList<Integer> arr, int start, int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public void swap(ArrayList<Integer> arr, int start, int end){
        Integer temp=arr.get(start);
        arr.set(start,arr.get(end));
        arr.set(end,temp);
    }
}
