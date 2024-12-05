package HashMaps;

import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;

public class Iteration {


    public static void main(String[] args) {
        // for each loop applied on array
        int[] arr = {4,9,2,6,4,8,1};
        for (int ele : arr){
            System.out.print(ele + "\t");
        }
        System.out.println();
// for each loop applied on Hashset
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        for (int ele : set){
            System.out.print(ele + "\t");
        }
        System.out.println();
        //hashmap......
        HashMap<String,Integer> map = new HashMap<>();
        map.put("dip",100);
        map.put("bristy",200);
        map.put("putu",300);
        map.put("bubucula",400);
        // for-each loop applied on hashmap
        for (String key : map.keySet()){
            System.out.print(key+"\t");
            System.out.println(map.get(key));
        }
        for (int val : map.values()) {
            System.out.print(val + "\t");
        }
    }
}
