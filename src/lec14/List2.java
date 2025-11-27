package lec14;
import java.util.ArrayList;
public class List2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(2);
        list1.add(4);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(6);
        list2.add(8);
        System.out.println("List 1 :"+list1);
        System.out.println("List 2 :"+list2);
        list1.addAll(list2);
        System.out.println("List 1 after joining with list 2 :"+list1);
    }
}
