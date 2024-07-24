package Arrary;

public class Merge_two_sorted_array {
    public static void main(String[] args) {
        int[] a = {11,41,42,71};
        int[] b = {26,49,67,81,105};
        int a_len = a.length;
        int b_len = b.length;
        int res = a.length + b.length;
        int[] result = new int[res];
        int i = 0;          // pointer to array 'a'
        int j = 0;          // pointer to array 'b'
        int r = 0;          // pointer to resultant array
        while ( i < a_len && j < b_len) {
             if (a[i] <= b[j]) {
                result[r] = a[i];
                r++;
                i++;
            } else  {
                result[r] = b[j];
                j++;
                r++;
            }
        }
            if (i == a_len){
                while ( j < b_len) {
                    result[r] = b[j];
                    r++;
                    j++;
                }
            }
             else if (j == b_len) {
                while (i < a_len) {
                    result[r] = a[i];
                    i++;
                    r++;
                }
            }

                for (int k = 0; k < result.length; k++) {
                    System.out.print(result[k] + "\t");
                }
    }
}
