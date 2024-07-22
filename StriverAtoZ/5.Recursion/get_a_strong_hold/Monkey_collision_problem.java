// Leetcode 2550

// Recursive Solution:
class Solution {
    int mod = 1000000007;
    public int monkeyMove(int n) {
        int  exp =(int) pow(2,n)%mod;
        System.out.println(exp);
        return (int) (exp + mod - 2) % mod;
    }
    
    private long pow(long a, long b){
        if(b == 0) return 1;
        long temp = pow(a,b/2);
        long ans = temp * temp % mod;
        if(b % 2 == 1 )
            ans = ans * a % mod;
        return ans;
    }
}

// Iterative Solution :
class Solution {
    public int monkeyMove(int n) {
     long res = 1, base = 2, mod = (long)1e9 + 7;
     while (n > 0) {
         if (n % 2 == 1)
             res = res * base % mod;
         base = base * base % mod;
         n >>= 1;
     }
     return (int)((res - 2 + mod) % mod);
 }
}
