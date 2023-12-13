
class Largest_and_second_largest{
    public static void main(String[] args){
        int[] arr={3,2,42,343,232,33,223,2343,242,24};
        int max=arr[0];
        int max2=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if (max < arr[i]){
        	    max2 =max;
                max=arr[i];
                }
                else {
        	        if(max2 < arr[i]) {
        		     max2 = arr[i];
        	        }
                }
            }
        System.out.println(max);
        System.out.println(max2);
    }
}
