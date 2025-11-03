package lec01;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        System.out.println("Enter number :");
        Scanner sc = new Scanner(System.in);
        int number =sc.nextInt();
        int result=0;
        int b= number;
        while(number !=0){
            int first_number = number %10;
            result = result*10+ first_number;
            number = number /10;
        }
        if(b==result){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("It is not palindrome");
        }

    }
}
