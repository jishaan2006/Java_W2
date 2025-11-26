package lec15;
import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,10);
        map.put(2,20);
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.getOrDefault(3,0));
    }
}
