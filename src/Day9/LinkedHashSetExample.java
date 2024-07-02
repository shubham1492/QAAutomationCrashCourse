package Day9;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Ramesh");
        set.add("Mahesh");
        set.add("Ram");
        set.add("Ramesh");
        set.add("Mahesh");
        set.add("Ram");
        set.add("Ramu");
        set.add("Ritik");

        System.out.println(set);

    }
}
