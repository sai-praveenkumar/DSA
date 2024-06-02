// Problem link : https://www.geeksforgeeks.org/problems/bubble-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=bubble-sort

//Recursive approach 
class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        sort(arr,0);
    }
    public static void sort(int[] arr, int i){
        if(i==arr.length-1) return;
        sort2(arr,0,i);
        sort(arr,i+1);
    }
    public static void sort2(int[] arr, int j, int i){
        if(j==arr.length-i-1) return;
        if(arr[j]>arr[j+1]) {
            arr[j]=arr[j]+arr[j+1];
            arr[j+1]=arr[j]-arr[j+1];
            arr[j]=arr[j]-arr[j+1];
        }
        sort2(arr,j+1,i);
    }
}

//Iterative approach :
class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
      for(int i=0;i<n;i++){
          for(int j=0;j<n-i-1;j++){
              if(arr[j]>arr[j+1]){
                  arr[j]=arr[j]+arr[j+1];
                  arr[j+1]=arr[j]-arr[j+1];
                  arr[j]=arr[j]-arr[j+1];
              }
          }
      }
    }
}