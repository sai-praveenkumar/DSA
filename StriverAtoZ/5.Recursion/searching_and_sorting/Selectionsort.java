//Problem link: https://www.geeksforgeeks.org/problems/selection-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=selection-sort

class Solution
{
	int  select(int arr[], int i)
	{
        int ans=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[ans]) ans=j;
        }
        return ans;
	}
	
	void selectionSort(int arr[], int n)
	{
	    for(int i=0;i<arr.length-1;i++){
	        int min_index=select(arr,i);
	        if(min_index==i) continue;
	        arr[min_index]=arr[min_index]+arr[i];
	        arr[i]=arr[min_index]-arr[i];
	        arr[min_index]=arr[min_index]-arr[i];
	    }
	    
	}
}
