
public class Checksortedarray {
	public static void main(String[] args) {
		int[] arr= {2,3,4,6,8,12,15,35,132,21};
		boolean check=checksorted(arr,0);
		System.out.println(check);
	}
	public static boolean checksorted(int[] arr,int curr) {
		if(curr==arr.length-1) {
			return true;
		}
		return arr[curr]< arr[curr+1] && checksorted(arr,curr+1);
	}
}
