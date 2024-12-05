package HashMaps;

import java.util.HashSet;

public class maximumNumberOfStringPairs_LT2744 {
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            if(set.contains(words[i])) count++;
            set.add(words[i]);
            set.add(reverseString(words[i]));
        }
        return count;
    }

    public static void main(String[] args) {
        String[] arr = {"cd","ac","dc","ca","zz"};
       int x = maximumNumberOfStringPairs(arr);
        System.out.println(x);
    }
}
