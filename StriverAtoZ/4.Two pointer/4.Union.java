//https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=union-of-two-sorted-arrays

class Solution{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m){
        ArrayList<Integer> ans= new ArrayList<>();
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<= arr2[j]){
                if(ans.size()== 0 || ans.get(ans.size()-1) != arr1[i])
                    ans.add(arr1[i]);
                i++;
            }
            else{
                if(ans.size()==0 || ans.get(ans.size()-1)!= arr2[j])
                    ans.add(arr2[j]);
                j++;
            }
        }
        while(i<arr1.length){
            if(ans.size()==0 || ans.get(ans.size()-1)!=arr1[i])
                ans.add(arr1[i]);
            i++;
        }
        while(j<arr2.length){
            if(ans.size()==0 || ans.get(ans.size()-1)!= arr2[j])
                ans.add(arr2[j]);
            j++;    
        }
        return ans;
    }
}
