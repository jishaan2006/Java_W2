package lec02;
import java.util.Scanner;
public class DivisibleBy5or11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int a= sc.nextInt();
        if(a % 5 == 0 && a % 11 == 0) {
            System.out.println("Number is divisible by both 5 and 11");
        }
        else if(a%5==0) {
            System.out.println("Number is Divisible by 5");
        }
        else if (a%11==0) {
            System.out.println("Number is Divisible by 11");
        }
        else{
            System.out.println("Number is neither divisible by 5 nor 11");
        }
    }
}
