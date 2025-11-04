package lec02;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int a=sc.nextInt();
        int result=0;
        while(a!=0){
            int firstnum=a%10;
            result=result*10+firstnum;
            a=a/10;
        }
        System.out.println("Reversed number is :"+result);
    }
}
