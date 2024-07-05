// Problem Link: https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1
class Solution {
    static String armstrongNumber(int n) {
        int ans=0,temp=n;
        while(temp!=0){
            int rem=temp%10;
            ans+=Math.pow(rem,3);
            temp/=10;
        }
        return (n==ans)? "true" : "false";
    }
}
// Follow up Q : TRy to understand why here TC = O(1)