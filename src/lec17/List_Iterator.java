package lec17;
import java.util.*;
public class List_Iterator {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        ListIterator<Integer> it=list.listIterator();
        System.out.print("Forward : ");
        while (it.hasNext()){
            int x= it.next();
            System.out.print(x+" ");
        }
        System.out.println();

        System.out.print("Backward : ");
        while (it.hasPrevious()){
            int x=it.previous();
            System.out.print(x+" ");
        }
    }
}
