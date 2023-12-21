public class LinearSearch {
	public static void main(String[] args) {
		int [] arr = {21,22,43,232,242,11,13};
		int target=43;
		int found_index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				found_index=i;
			}
		}
		System.out.println(found_index);
	}
}
