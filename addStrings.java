import java.math.BigInteger;

// Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

class Solution {
    public String addStrings(String num1, String num2) {
        String final_str = "";
        BigInteger l1 = new BigInteger(num1);
        BigInteger l2 = new BigInteger(num2);
        
        BigInteger sum = l1.add(l2);

        final_str = final_str + sum.toString();
        
        return final_str;
        
        
        
    }
}