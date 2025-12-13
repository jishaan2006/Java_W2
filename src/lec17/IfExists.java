package lec17;
import java.util.*;
public class IfExists {
    public static void main(String[] args) {
        HashSet<String> set =new HashSet<>();
        set.add("A");
        set.add("B");

        System.out.println(set.contains("C"));
    }
}
