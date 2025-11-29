package lec16;

import java.util.HashSet;

public class CheckEmpty {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        if(set.isEmpty()){
            System.out.println("Set is empty.");
        }else{
            System.out.println("Set is filled");
        }
    }
}
