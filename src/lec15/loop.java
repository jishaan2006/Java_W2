package lec15;
import java.util.*;
public class loop {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,10);
        map.put(2,20);
        map.put(3,30);
        map.put(4,40);
        map.put(5,50);

        for(int x : map.keySet()){
            System.out.println(map.get(x));
        }
    }
}
