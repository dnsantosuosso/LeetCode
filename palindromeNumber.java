// Given an integer x, return true if x is palindrome integer.

// An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        
        int len = str.length();
        String str2 = "";
        
        for (int i = len -1; i >= 0; i--){
            char c = str.charAt(i);
            str2 = str2 + c;
        }
        
        if (str.equals(str2)){
            return true;
        }
        return false;
        
        
        // for (int i=0, j=len-1; i < len, j >= 0; i++, j--){
        //     if (str.substring(i,i+1) != str.substring(j-1,j)){
        //         return var;
        //     }
        // }
        // var = true;
        // return var;
    }
}