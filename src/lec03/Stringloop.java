package lec03;

public class Stringloop {
    public static void main(String[] args){
        String str="hello java bye";
        String[] a=str.split(" ");
        for(String str1:a){
            System.out.println(str1);
        }
}
}
