// leetcode : 125
class Solution {
    public boolean isPalindrome(String s) {
        s.replace(" ","");
         s = s.replaceAll("[^a-zA-Z0-9]", "");
         s = s.toLowerCase();
        int start=0,end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}

// Follow up Q : Very Important