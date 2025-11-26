package lec15;

import java.util.HashMap;

public class frequency {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr={1,1,1,2,2,3,4,4,4,4};
        for(int x: arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        System.out.println(map);
    }
}
