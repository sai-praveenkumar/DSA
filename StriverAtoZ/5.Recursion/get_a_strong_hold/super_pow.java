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
class Solution {
    public int power(int a,int times){
        int mod=1337;
        int ans=1;
        for(int i=0; i<times; i++){
            ans=((a%mod)*(ans%mod))%mod;
        }
    
        return ans;
    }
    public int superPow(int a, int[] b) {
        int mod=1337;
        int ans=1;
        int prev=a;
       ans=((ans%mod)*(power(prev,b[b.length-1])%mod))%mod;

        for(int i=b.length-2; i>=0; i--){
           prev=power(prev,10);
           ans=((ans%mod)*(power(prev,b[i])%mod))%mod;

        }
        return ans;
    }
}

// DP Solution for same problem

class Solution {
    
    final int k = 1337;
	
    public int superPow(int a, int[] b) {
    	int fac=a%1337,l=b.length;
    	int[] dp=new int[l];
    	dp[0] = pMod(fac,b[l-1]);
        for (int i=1;i<l;i++) dp[i]=dp[i-1]*pMod(fac=pMod(fac,10),b[l-i-1])%k;
        return dp[l-1];
    }
    
    // pMod is for calculating (a^b) mod 1337
    private int pMod(int a, int b) {
    	return b==0?1%k:b==1?a%k:a%k*pMod(a,b-1)%k;
    }
}