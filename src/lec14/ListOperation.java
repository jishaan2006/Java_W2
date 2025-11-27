package lec14;
import java.util.ArrayList;
public class ListOperation {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.set(0,10); //to set or modify element.
        System.out.println(list);
        System.out.println();

        int size =list.size();
        System.out.println("Size of list :"+size); //to get size of list
        System.out.println();

        int first=list.get(0); //to access elements
        System.out.println("First Element :"+first);
        int last=list.get(list.size()-1);
        System.out.println("Last element :"+last);
        System.out.println();

        list.remove(0); //to remove element
        System.out.println("List after removing 0 index :"+list);
        System.out.println();

        System.out.println("Loop printing (for) :");
        for(int i=0;i< list.size();i++){ //normal loop
            System.out.println(list.get(i));
        }
        System.out.println();

        System.out.println("loop printing (Enhanced) :");
        for(int num:list){ //enhanced loop
            System.out.println(num);
        }
        System.out.println();

        boolean exists= list.contains(3);
        System.out.println("List contains 3 :"+exists); //to check existence
        System.out.println();

        int index=list.indexOf(3);
        System.out.println("Index of 3 is :"+index); //to search
        System.out.println();
    }
}
