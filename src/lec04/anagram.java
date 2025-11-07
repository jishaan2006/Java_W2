package lec04;
import java.util.Arrays;
import java.util.Scanner;
public class anagram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String :");
        String str1=sc.nextLine();

        System.out.println("Enter String :");
        String str2=sc.nextLine();

        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String val1=new String(ch1);
        String val2=new String(ch2);
        if (val1.equals(val2)) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are not anagrams");
        }

    }
}
