// Leetcode 125 

// Iterative Solution 

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

// Recursive Solution

class Solution {
    public boolean isPalindrome(String s) {
        s.replace(" ","");
         s = s.replaceAll("[^a-zA-Z0-9]", "");
         s = s.toLowerCase();
        int start=0,end=s.length()-1;
        return isPalindrom(s,start,end);
    }
    public boolean isPalindrom(String str, int start, int end){
        if(start>=end) return true;
        else if(str.charAt(start)!=str.charAt(end)) return false;
        else return isPalindrom(str,++start,--end);
    }
}