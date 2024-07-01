package Day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Mango");
        list.add("Apple");
        list.add("Mango");
        list.add("Grapes");

        System.out.println(list);

        System.out.println("-----------------------------------------");

        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("------------------------------");

        for(String str :list){
            System.out.println(str);
        }

        System.out.println("---------------------------");
        Collections.sort(list);
        System.out.println(list);
    }
}
