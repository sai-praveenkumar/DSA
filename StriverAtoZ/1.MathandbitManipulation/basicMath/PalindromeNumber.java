//Leetcode 9
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        else if(x%10==x){
            return true;
        }
        else{
            return x==rev(x);
        }
    }
    public int rev(int x){
        int reverse=0;
        while(x%10!=x){
            int rem=x%10;
            reverse+=rem;
            reverse*=10;
            x/=10;
        }
        reverse+=x;
        return reverse;
    }
}

// Follow up Q : Palindrome LinkedList V.imp