package lec02;

public class StringsInJava {
    public static void main(String[] args) {
        String str="Jishaan";
        System.out.print("Last character is : ");
        System.out.println(str.charAt(str.length()-1));
        System.out.println("Name :");
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
        System.out.println("Name in reverse : ");
        for(int i=str.length()-1;i>=0;i--){
            System.out.println(str.charAt(i));
        }
    }
}
