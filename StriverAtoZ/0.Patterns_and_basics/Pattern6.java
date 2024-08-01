// Problem Link : https://www.naukri.com/code360/problems/reverse-number-triangle_6581889?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

// n = 5 implies             1 2 3 4 5
//                           1 2 3 4
//                           1 2 3
//                           1 2
//                           1


public class Solution {
    public static void nNumberTriangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

// Recursive Soluion

public class Solution {
    public static void nNumberTriangle(int n) {
        outerloop(1,n);
    }
    public static void outerloop(int i, int n){
        if(i>n) return;
        innerloop(n,i,1);
        System.out.println();
        outerloop(i+1, n);
    }
    public static void innerloop(int n, int i, int j){
        if(j>n-i+1) return;
        System.out.print(j+" ");
        innerloop(n,i,j+1);
    }
}
