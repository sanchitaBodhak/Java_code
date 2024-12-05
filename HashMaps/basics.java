package HashMaps;

import java.util.HashMap;
import java.util.HashSet;

public class basics {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println(set);
        System.out.println(set.contains(30));
        set.remove(30);
        System.out.println(set);
        System.out.println(set.contains(30));
        HashMap<String,Integer> map = new HashMap<>();
        map.put("dip",420);
        System.out.println(map);
    }

}
