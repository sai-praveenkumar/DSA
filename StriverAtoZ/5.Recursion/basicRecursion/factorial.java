package Recursion;

public class factorial {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(fact(n));
	}
	public static int fact(int n) { 
		if(n==1) {
			return 1;
		}
		return n*fact(n-1);
	}
}

//Follow up Q : https://www.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty%255B%255D=-1&page=1&query=problemTypefunctionaldifficulty%255B%255D-1page1
class Solution{
    static ArrayList<Long> ans= new ArrayList<>();
    
    static ArrayList<Long> factorialNumbers(long N){
        facto(N,1,1);
        return ans;
    }
    public static void facto(long n, long fact, int i){
        i++;
        if(fact > n)
        return ;
        ans.add(fact);
        facto(n,fact*i,i);
        
    }
    
} // Recursive solution giving error

// Iterative solution is working.


//User function Template for Java
class Solution{

    
    static ArrayList<Long> factorialNumbers(long N){
       
             ArrayList<Long> ans= new ArrayList<>();
            long fact = 1L;
            int i=2;
            while(fact<=N){
                ans.add(fact);
                fact*=i;
                i++;
            }
            return ans;
    }
    
}