package lec12;

interface A{
    String city = "Bhopal";
}
public class Two {
    public static void main(String[] args) {
        System.out.println(A.city);
        //A.city = "Indore";           cannot change variable of interface they are public static final
    }
}
