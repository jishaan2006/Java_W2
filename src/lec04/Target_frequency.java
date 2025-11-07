package lec04;
import java.util.Scanner;
public class Target_frequency {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter string :");
        String str=scan.nextLine();
        System.out.println("Enter target character :");
        char target=scan.next().charAt(0);
        int count=0;
        char[] b=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(b[i]==target){
                count++;
            }
        }
        System.out.println(count);
    }
}

