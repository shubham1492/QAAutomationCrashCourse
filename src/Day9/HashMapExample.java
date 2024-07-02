package Day9;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"Ravi");
        map.put(2,"Mohen");
        map.put(5,"ajay");
        map.put(4,"minu");
        map.put(4,"kathik");

        System.out.println(map);

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+ ":" + entry.getValue() );
        }

    }
}
