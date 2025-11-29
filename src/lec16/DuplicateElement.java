package lec16;
import java.util.HashSet;
public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        HashSet<Integer> set =new HashSet<>();
        for(int x:arr){
            if(set.contains(x)){
                System.out.println("Duplicate Element :"+x);
                return;
            }
            set.add(x);
        }
        System.out.println("No duplicate Elements present.");
    }
}
