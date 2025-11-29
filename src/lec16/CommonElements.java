package lec16;
import java.util.HashSet;
public class CommonElements {
    public static void main(String[] args) {
       int[] arr1={1,2,3,4,5};
       int[] arr2={1,2,3};

       HashSet<Integer> set1=new HashSet<>();
       HashSet<Integer> result_set=new HashSet<>();

        for(int x:arr1){
            set1.add(x);
        }
        for(int x:arr2){
            if(set1.contains(x)){
                result_set.add(x);
            }
        }
        System.out.println("Common elements are :"+result_set);
    }
}
