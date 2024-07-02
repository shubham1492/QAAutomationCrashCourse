package Day9;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Ramesh");
        set.add("Mahesh");
        set.add("Ram");
        set.add("Ramesh");
        set.add("Mahesh");
        set.add("Ram");
        set.add("Ramu");
        set.add("Ritik");

        System.out.println(set);

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        HashSet<String> set1 = new HashSet<>();
        set1.add("Deepak");
        set1.add("Rajesh");

        set.addAll(set1);
        System.out.println(set);

        set.remove("Rajesh");
        System.out.println(set);

        set.clear();
        System.out.println(set);
    }
}
