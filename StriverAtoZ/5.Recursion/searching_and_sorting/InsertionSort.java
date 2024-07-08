// Problem Link :https://www.geeksforgeeks.org/problems/insertion-sort/0?category%5B%5D=Algorithms&page=1&query=category%5B%5DAlgorithmspage1&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=insertion-sort
class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
          for(i=0;i<=(arr.length-1);i++){
                int k=i;
                while(k>0 && arr[k-1]>arr[k]){
          int temp=arr[k-1];
          arr[k-1]=arr[k];
          arr[k]=temp;
          k--;
      }
        }
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      insert(arr,n);
  }
}

// Recursive Approach : 

class Solution
{
  static void insert(int arr[],int i)
  {
        
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      // Base case 
        if (n <= 1) 
            return; 
       
        // Sort first n-1 elements 
        insertionSort( arr, n-1 ); 
       
        // Insert last element at its correct position 
        // in sorted array. 
        int last = arr[n-1]; 
        int j = n-2; 
       
        /* Move elements of arr[0..i-1], that are 
          greater than key, to one position ahead 
          of their current position */
        while (j >= 0 && arr[j] > last) 
        { 
            arr[j+1] = arr[j]; 
            j--; 
        } 
        arr[j+1] = last; 
  }
}