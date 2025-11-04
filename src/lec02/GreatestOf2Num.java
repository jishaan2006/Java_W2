package lec02;
import java.util.Scanner;
public class GreatestOf2Num {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first num :");
        int a=sc.nextInt();
        System.out.println("Enter second num :");
        int b=sc.nextInt();
        if(a>b){
            System.out.print("Greater num is a :");
            System.out.println(a);
        }
        else if(a<b){
            System.out.print("Greater num is b :");
            System.out.println(b);
        }
        else{
            System.out.println("Both are Equal");
        }
    }
}
