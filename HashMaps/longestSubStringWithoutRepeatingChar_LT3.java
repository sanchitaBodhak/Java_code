package HashMaps;

import java.util.HashMap;

public class longestSubStringWithoutRepeatingChar_LT3 {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n <= 1) return n; // If string has 0 or 1 characters, return the length as it's already the longest unique substring.

        HashMap<Character, Integer> m = new HashMap<>(); // Map to store the last index of each character in the substring.
        int maxlen = 0; // Variable to store the maximum length of a substring found so far.
        int i = 0, j = 0; // Two pointers: i is the start of the current substring, j is the end.

        // Iterate through the string using j as the end pointer.
        while (j < n) {
            char ch = s.charAt(j); // Current character at the end pointer.

            // Check if the character is already in the map and within the current substring bounds.
            if (m.containsKey(ch) && m.get(ch) >= i) {
                int len = j - i; // Calculate the current substring length.
                maxlen = Math.max(len, maxlen); // Update maxlen if the current length is greater.

                // Move the start pointer i to one position past the last occurrence of the repeated character.
                while (s.charAt(i) != ch) i++;
                i++;
            }

            // Update the map with the current character's index.
            m.put(ch, j);
            j++; // Move the end pointer to the next character.
        }

        // After the loop, calculate the length of the last substring and update maxlen if necessary.
        int len = j - i;
        maxlen = Math.max(len, maxlen);

        return maxlen; // Return the maximum length of substring without repeating characters.
    }

    public static void main(String[] args) {
        int x = lengthOfLongestSubstring("abcabcbb");
        System.out.println(x);
    }
}
