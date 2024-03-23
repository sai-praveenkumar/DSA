import java.util.*;
class Reverse_Number{
    public static void main(String[] args){
        int number = 4567;
        System.out.println(rev(number,0));
    }
    private static int rev(int n,int sum){
        if(n==0)
        return sum;
        int rem=n%10;
        sum = sum*10+rem;
        return rev(n/10,sum);
    }
}