package lec16;
import java.util.HashSet;
public class Names {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("Jishaan");
        set.add("Khatri");
        set.add("Vanshika");
        set.add("Mourya");
        System.out.println(set);
        System.out.println("Size :"+set.size());
    }
}
