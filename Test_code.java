import java.util.ArrayList;
import java.util.HashMap;

public class Test_code {
    // reverse method
    public  int reverse(int n){
        int reversed = 0;
        while(n != 0){
            int ld = n % 10;
            reversed = reversed*10 + ld;
            n = n / 10;
        }
        return reversed;
    }

    public HashMap<Integer, Integer> int_frequency_map_reversed(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - reverse(arr[i]); // -->
            int curr_element = arr[i];
            if (hm.containsKey(curr_element)) {
                int prev_freq = hm.get(curr_element); // Get the current frequency
                hm.put(curr_element, prev_freq+1 ); // Increment and update the frequency
            }
            else {
                hm.put(curr_element, 1); // Initialize the frequency to 1 for new elements
            }
        }
        return hm;
    }

    public    int nC2(int n){
        if (n == 2) return 1;
        if(n < 2) return 0;
        return n * (n-1) / 2;
    }
    public  int countNicePairs(int[] nums) {

        int pairCounter = 0;
        HashMap<Integer, Integer> map = int_frequency_map_reversed(nums);  // (key = elem , value = frequency)
        for (int key : map.keySet()) {
            int freq = map.get(key);

            pairCounter += nC2(freq);
            pairCounter %= 1000000007;

        }
        return pairCounter;
    }

        public static void main(String[] args) {
        String a = "abc";
        System.out.println(a);
        int[] arr = {1,2,3,4,5};
        System.out.println(arr.length);

    }
}