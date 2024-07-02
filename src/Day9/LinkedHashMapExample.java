package Day9;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();

        map.put(101,"amit");
        map.put(105,"Vijay");
        map.put(110,"rahul");

        System.out.println(map);
    }
}
