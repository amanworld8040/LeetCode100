class Solution {
    public int romanToInt(String s) {

        // Mapping Roman numerals to their integer values
        java.util.Map<Character, Integer> romanToIntMap = new java.util.HashMap<>();
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);
        
        int total = 0;
        int prevValue = 0;
        
        // Iterate through each character in the Roman numeral string
        for (int i = 0; i < s.length(); i++) {
            // Get the integer value of the current Roman numeral
            char currentChar = s.charAt(i);
            int value = romanToIntMap.get(currentChar);
            
            // If the previous value is less than the current value, subtract twice the previous value
            if (prevValue < value) {
                total += value - 2 * prevValue;
            } else {
                total += value;
            }
            
            // Update the previous value to the current value
            prevValue = value;
        }
        
        return total;
    }
}
