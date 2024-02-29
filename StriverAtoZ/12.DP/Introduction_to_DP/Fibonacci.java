import java.util.Arrays;

public class Fibonacci {
	
	public static void main(String[] args) {
		int n=6;       
		System.out.println("The recursive Solution is : "+recfibo(n));;
		System.out.println("The Memoization Solution is : "+memofibo(n));
		System.out.println("The Tabulation Solution is : "+tabfibo(n));
		System.out.println("The Space Optimized solution is : "+spaceoptfibo(n));
	}
	private static int recfibo(int n) {
		if (n==1 || n== 0 ) {
			return n;
		}
		return recfibo(n-1)+recfibo(n-2);
	}
	private static int tabfibo(int n) {
		if(n==0 || n==1) {
			return n;
		}
		int[] dp= new int[n+1];
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<=n;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
	static int memofibo(int n) {
		int [] dp=new int[n+1];
		Arrays.fill(dp,-1);
		if(n==1 || n== 0) {
			return n;
		}
		if(dp[n]!= -1) {
			return dp[n];
		}
		return dp[n] = memofibo(n-1)+memofibo(n-2);
	}
	
	static int spaceoptfibo(int n) {
		if(n == 0 || n == 1 ) {
			return n;
		}
		int prev1=1,prev2=0;
		int curr=prev1;
		for(int i=2;i<=n;i++) {
			curr= prev1+prev2;
			prev2=prev1;
			prev1=curr;
		}
		return prev1;
	}

}
