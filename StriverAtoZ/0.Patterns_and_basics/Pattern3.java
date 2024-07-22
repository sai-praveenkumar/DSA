// Problem link : https://www.naukri.com/code360/problems/n-triangles_6573689?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
 
//     N =5 implies :

//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

public class Solution {
    public static void nTriangle(int n) {
        for(int i=1;i<=n;i++){
            for( int j=1;j<=i;j++){
                System.out.print(j+" ");
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
    public static void outerloop(int n,int index){
        if(n<index) return;
        innerloop(index,1);
        System.out.println();
        outerloop(n, index+1);
    }
    public static void innerloop(int outer_index, int inner_index){
        if(inner_index>outer_index) return ;
        System.out.print(inner_index+" ");
        innerloop(outer_index, inner_index+1);
    }
}