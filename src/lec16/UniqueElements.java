package lec16;

import javax.sound.midi.Soundbank;
import java.util.HashSet;
import java.util.SortedMap;

public class UniqueElements {
    public static void main(String[] args) {
        HashSet<Integer> set =new HashSet<>();
        int[] arr={1,2,3,4,1,2};
        for(int x:arr){
            set.add(x);
        }
        System.out.println("Unique Elements :"+set);
    }
}
