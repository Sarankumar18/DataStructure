class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        
        int romanValue = 0;
        int prevValue = 0; // Keep track of previous value
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int value = roman.get(c);
            
            // If current value is less than previous value, subtract it
            if (value < prevValue) {
                romanValue -= value;
            } else {
                romanValue += value;
            }
            
            prevValue = value; // Update previous value
        }
        
        return romanValue;
    }
}