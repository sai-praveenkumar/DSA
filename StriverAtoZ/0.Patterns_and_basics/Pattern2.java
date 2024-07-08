// Problem Link : https://www.naukri.com/code360/problems/n-2-forest_6570178?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM

// n=3 implies
//              *
//              * *
//              * * *
public class Solution {
    public static void nForest(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// Using Recursion :
public class Solution {
    public static void nForest(int n) {
        solve1(1,n);
    }
    public static void solve1(int value, int n){
        if(value==n+1) return;
        print_star(1,value);
        System.out.println();
        solve1(value+1,n);
    }
    public static void print_star(int print_val, int value){
        if(print_val>value) return;
        System.out.print("* ");
        print_star(print_val+1,value);
    }
}