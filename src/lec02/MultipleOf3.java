package lec02;
import java.util.Scanner;
public class MultipleOf3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int a=sc.nextInt();
        if(a%3==0){
            System.out.println("Number is multiple of 3");
        }
        else{
            System.out.println("Number is not a multiple of 3");
        }
    }
}
