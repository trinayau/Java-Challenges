package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapDriver {
    public static void main(String[] args) {
        //Hashmap features
        //1. No order
        //2. No duplicate keys
        //3. Not sorted

        //Create
        Map<Integer, String> nameNamp = new HashMap<>();
        nameNamp.put(2, "dd");
        nameNamp.put(5, "gg");
        nameNamp.put(-9, "jj");
        nameNamp.put(4, "ee");
        System.out.println(nameNamp);
        nameNamp.put(4, "zz");
        nameNamp.put(null, "yy");
        nameNamp.put(22, null);
        nameNamp.put(44, null);
        System.out.println(nameNamp);

        //Read
        System.out.println("find key 5=" + nameNamp.get(5));
    }
}
