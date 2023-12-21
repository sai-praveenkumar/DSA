
class Largest_and_second_largest{
    public static void main(String[] args){
        int[] arr={3,2,42,343,232,33,223,2343,242,24};
        int max=arr[0];
        int max2=Integer.MIN_VALUE;
            for(int i=1;i<arr.length;i++){
                if (max < arr[i]){
        	    max2 =max;
                max=arr[i];
                }
                else {
        	        if(max2 < arr[i]) {
        		     max2 = arr[i];
        	        }
                }
            }
        System.out.println(max);
        System.out.println(max2);
    }
}


// Edge case : Here if in for loop, if the iteration 'i' starts with i=0, the corner test case when the maximum element present at i=0 gets failed and both max1 and max2 points to the maximum value of the array.
// So we start our iteration from i=1.

// Similar problem in Coding Ninjas :
https://www.codingninjas.com/codestudio/problems/ninja-and-the-second-order-elements_6581960?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
// Code :

public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        int max1=a[0],min1=a[0];
        int max2=Integer.MIN_VALUE,min2=Integer.MAX_VALUE;
        int[] arr=new int[2];
        for(int i=1;i<a.length;i++){
            if(max1 < a[i]){
                max2=max1;
                max1=a[i];
            }
            else{
                if(max2 < a[i]){
                    max2=a[i];
                }
            }
            if(min1 > a[i]){
                min2 = min1;
                min1=a[i];
            }
            else{
                if(min2 > a[i]){
                    min2 = a[i];
                }
            }
        }
        arr[0]=max2;
        arr[1]=min2;
    return arr;
    }
}

// Here, if the for loop starts from i=0, then the corner test case : 
10
1 2 3 4 5 6 7 8 9 10 

// This test case fails giving us the output : 
    9 1  
//instead of the correct answer :
    9 2    // since the minimum element of the array starts from index 0
    
Follow up : LeetCode Q.2706
