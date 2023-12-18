public class Factorial {
	public static void main(String[] args) {
		int n=5;
		System.out.println("The recursive solution is : "+recfact(n));
		System.out.println("The space Optimized solution is : "+spaceoptfact(n));
	}

	private static int spaceoptfact(int n) {
		if (n==1 || n==0) {
			return 1;
		}
		int val=1;
		for(int i=2;i<=n;i++) {
			val=i*val;
		}
		return val;
	}

	private static int recfact(int n) {
		if (n == 1 || n == 0) {
			return 1;
		}
		return n*recfact(n-1);
	}