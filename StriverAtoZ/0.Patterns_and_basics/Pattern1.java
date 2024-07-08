//  N =3 implies 
//                           * * *
//                           * * *
//                           * * *

// Problem Link : https://www.naukri.com/code360/problems/n-forest_6570177?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

public class Solution {
    public static void nForest(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// Using Recursion
public class Solution {
    public static void nForest(int n) {
        solve(0,n);
    }
    public static void solve(int index, int n){
        if(index==n) return;
        print_star(0,n);
        System.out.println();
        solve(index+1,n);
    }
    public static void print_star(int index, int n){
        if(index==n) return;
        System.out.print("* ");
        print_star(index+1,n);
    }

}