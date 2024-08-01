// Problem Link : https://www.naukri.com/code360/problems/seeding_6581892?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

// n=5 implies      * * * * *
//                  * * * *
//                  * * * 
//                  * *
//                  *

public class Solution {
    public static void seeding(int n) {
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// Recursive Solution :
public class Solution {
    public static void seeding(int n) {
        outerloop(n);
    }
    public static void outerloop(int n){
        if(n==0) return;
        innerloop(n);
        System.out.println();
        outerloop(n-1);
    }
    public static void innerloop(int i){
        if(i==0) return;
        System.out.print("* ");
        innerloop(i-1);
    }
}