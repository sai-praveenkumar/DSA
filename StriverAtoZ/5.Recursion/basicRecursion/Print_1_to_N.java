//Problem Link :https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-1-to-n-without-using-loops
class Solution
{
    
  public void printNos(int N)
    {
       if(N==0)
            return;
        printNos(N-1);
        System.out.print(N+" ");
        
    }
}

// Follow up : Print N to 1 using recursion

//Problem Link:https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-n-to-1-without-loop
class Solution {

    void printNos(int N) {
        if(N==0) return;
        System.out.print(N+" ");
        printNos(N-1);
    }
}