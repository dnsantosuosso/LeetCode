// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

class Solution {
    public int reverse(int x) {
        String temp = Integer.toString(x);
        String final_str = "";
        
        for (int i = temp.length()-1; i >= 0; i--){
            char c = temp.charAt(i);
            // String s = String.valueOf(c);
            final_str = final_str + c;
        }
        
        if (final_str.charAt(final_str.length()-1) == '-'){
            String final2 = "-";
            for (int i = 0; i < final_str.length() - 1; i++){
                char c = final_str.charAt(i);
                final2 = final2 + c;
            }
            try{
                int final_int = Integer.parseInt(final2);
                return final_int; 
            }
            catch (NumberFormatException nf){
                return 0;
            }
        }
        
        try{
            int final_int = Integer.parseInt(final_str);
            return final_int; 
        }
        catch (NumberFormatException nf){
            return 0;
        }
    }
}