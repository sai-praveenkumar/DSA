// Problem Link : https://www.naukri.com/code360/problems/triangle_6573690?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

//       n= 5 implies 
//                          1
//                          2 2
//                          3 3 3
//                          4 4 4 4
//                          5 5 5 5 5

public class Solution {
    public static void nTriangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }       
    }
}

// Recursive Solution :
public class Solution {
    public static void nTriangle(int n) {
        outerloop(n,1);
    }
    public static void outerloop(int n, int index){
        if(index>n) return;
        innerloop(index,1);
        System.out.println();
        outerloop(n,index+1);
    }
    public static void innerloop(int outer_index, int inner_index){
        if(outer_index<inner_index) return;
        System.out.print(outer_index+" ");
        innerloop(outer_index, inner_index+1);
    }
}