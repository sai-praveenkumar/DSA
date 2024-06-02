//leetcode : 50
class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        long N = n;
        if(n<0) {
        x=1/x;
        N=-N;
        } 
        return (N%2==0) ? myPow(x*x,(int)N/2) : x*myPow(x,(int)N-1);
    }
}

// Follow up Q : Leetcode 372