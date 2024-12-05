package HashMaps;

import java.util.HashMap;

public class Anagram_LT242 {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;   // edge case
        HashMap<Character,Integer> smap = new HashMap<>();//creating hashmaps for storing letters and frequency
        HashMap<Character,Integer> tmap = new HashMap<>();
        // loop to store each char of string and their frequency
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // retrieve the character
            int v = 0; // by default freq of each letter is 0
            // if the character is already present then get their frequency and incresed freq by one
            if(smap.containsKey(ch)){
                 v = smap.get(ch);
                 v++;
            }
            smap.put(ch,v); //pushing back the char
        }
        // same loop again for t string
        for (int i = 0; i < t.length(); i++) {
            char ch = s.charAt(i);
            int u = 0;
            if (tmap.containsKey(ch)) {
                u = tmap.get(ch);
                u++;
            }
            tmap.put(ch, u);

        }
        // if both of the hashmaps are equal then return true ... otherwise return false
        return smap.equals(tmap);

    }

    public static void main(String[] args) {
        boolean b = isAnagram("eats","ate");
        System.out.println(b);
    }
}
