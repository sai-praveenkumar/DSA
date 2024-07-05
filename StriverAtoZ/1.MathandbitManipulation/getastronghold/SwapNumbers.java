//Problem Link : https://www.geeksforgeeks.org/problems/swap-two-numbers3844/1
class Solution{
    static List<Integer> get(int a,int b)
    {
        List<Integer> ans = new ArrayList<>();
        a=a^b;
        b=a^b;
        a=a^b;
        ans.add(a);
        ans.add(b);
        return ans;
        
    }
}