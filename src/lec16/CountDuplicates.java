package lec16;
import java.util.HashSet;
public class CountDuplicates {
    public static void main(String[] args) {
        int[] arr={10,20,10,40,50,20,60,70,80,50,90,100,10,40,30,20,110,120,30,40};
        int a=arr.length;
        HashSet<Integer> set =new HashSet<>();
        for(int x:arr){
            set.add(x);
        }
        int b= set.size();
        if(a-b==0){
            System.out.println("No duplicate elements present.");
        }else{
            System.out.println("Number of duplicate elements :"+(a-b));
        }
    }
}
