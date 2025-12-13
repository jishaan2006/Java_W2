package lec17;
import java.util.*;
public class ConvertToArray {
    public static void main(String[] args) {
        HashSet<String> set =new HashSet<>();
        set.add("Hello");
        set.add("Java");
        set.add("World");

        Object[] array= set.toArray();
        System.out.println(Arrays.toString(array));
    }
}
