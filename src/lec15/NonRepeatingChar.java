package lec15;

import java.util.HashMap;

public class NonRepeatingChar {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String str = "aabbbbbbbbbcccdnkdaandkbgjebtys";
        for (char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        System.out.println(map);
        for (char ch : str.toCharArray()){
            if(map.get(ch)==1){
                System.out.println(ch);
                break;
            }
        }
    }
}
