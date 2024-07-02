package Day9;

import javax.security.auth.callback.CallbackHandler;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicateCharacterWithCount {
    public static void main(String[] args) {


        String str = "shubhamshu";

        char ch [] = str.toCharArray();

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for(char c : ch){
            if(map.containsKey(c)){
                map.put(c,map.get(c) + 1);
            }else{
                map.put(c,1);
            }
        }

        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+ ":"+entry.getValue());
        }

    }
}
