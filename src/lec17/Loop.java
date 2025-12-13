package lec17;
import java.util.*;
public class Loop {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("Red");
        set.add("Blue");
        set.add("Green");
        set.add("Pink");
        set.add("Yellow");

        for(String s: set){
            System.out.println(s);
        }
    }
}
