public class Solution {
    public char nthCharacterBruteForce(String s, int r, int n) {
        // Perform 'r' iterations
        for (int i = 0; i < r; ++i) {
            StringBuilder transformed = new StringBuilder();
            
            // Apply transformation to each character in the string
            for (char ch : s.toCharArray()) {
                if (ch == '0') {
                    transformed.append("01");
                } else {
                    transformed.append("10");
                }
            }
            
            // Update the string with the transformed version
            s = transformed.toString();
        }

        // Return the nth character after 'r' iterations
        return s.charAt(n);
    }
