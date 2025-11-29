package lec16;
import  java.util.HashSet;
import java.util.Iterator;

public class HashSetIntro{
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set+"\n");

        System.out.println("Printing using for-each :");
        for(int x:set){
            System.out.println(x);
        }
        System.out.println();

        System.out.println("Printing using Iterator :");
        Iterator<Integer> it= set.iterator();
        while(it.hasNext()){
            int value=it.next();
            if(value==2){
                it.remove();
            }
        }
        System.out.println(set);
    }
}
