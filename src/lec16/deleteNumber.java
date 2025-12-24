package lec16;
import java.util.HashSet;
public class deleteNumber {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        System.out.println("Set :"+set);
        set.remove(2);
        System.out.println("Set after Deleting 2:"+set);
    }
}
