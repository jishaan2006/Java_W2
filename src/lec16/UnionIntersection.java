package lec16;
import java.util.HashSet;
public class UnionIntersection {
    public static void main(String[] args) {
        int[] arr1={10,20,30,40,50,60,20,30,70,80};
        int[] arr2={30,40,50,90,100,30,110,120,60,130};

        HashSet<Integer> A=new HashSet<>();
        HashSet<Integer> B=new HashSet<>();

        for(int x:arr1) A.add(x);
        for(int x:arr2) B.add(x);

        HashSet<Integer> Union=new HashSet<>(A);
        for(int x:B) Union.add(x);

        HashSet<Integer> Intersection=new HashSet<>(A);
        Intersection.retainAll(B);

        HashSet<Integer> DiffAB=new HashSet<>(A);
        DiffAB.removeAll(B);

        HashSet<Integer> DiffBA=new HashSet<>(B);
        DiffBA.removeAll(A);

        System.out.println("Union :"+Union);
        System.out.println("Intersection :"+Intersection);
        System.out.println("(A - B) = "+DiffAB);
        System.out.println("(B - A) = "+DiffBA);
    }
}
