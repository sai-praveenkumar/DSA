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