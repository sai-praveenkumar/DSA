public class LinearSearch{
    public static void main(String[] args){
        int[] arr={23,232,132,321,211,32};
        System.out.println(LinearSearch(arr,0,32));
    }
    static boolean LinearSearch(int[] arr,int index,int target){
        if(index == arr.length)
            return false;
            return arr[index]==target || LinearSearch(arr,index+1,target);
    }
}