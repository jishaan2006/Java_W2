package lec01;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        System.out.println("Enter value of a :");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        System.out.println("Enter value of b :");
        int b=scan.nextInt();
        System.out.println("Enter operator (+,-,*,/) :");
        char c=scan.next().charAt(0);
        switch (c){
            case '+':
                System.out.println(a+b);
            break;
            case '-':
                System.out.println(a-b);
            break;
            case '*':
                System.out.println(a*b);
            break;
            case '/':
                if(b==0){
                    System.out.println("Error: Division by zero");
                }
                else{
                    System.out.println(a/b);
                }
            break;
            default:System.out.println("Invalid Operator");
        }
    }
}
