class Solution {
    public int reverse(int x) {
        int reversed = 0;
        int sign = (x < 0) ? -1 : 1;
        x = Math.abs(x);
        
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            
            // Check for overflow
            if (reversed > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }
            
            reversed = reversed * 10 + digit;
        }
        
        return reversed * sign;
    
        
    }
}
