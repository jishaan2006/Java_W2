package lec02;
import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter int a :");
        int a= sc.nextInt();
        System.out.println("Int a :"+ a);
        System.out.println("Float a :"+(float)a);
    }
}
