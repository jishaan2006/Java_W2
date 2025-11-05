package lec02;
import java.util.Scanner;
public class Calculator2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Format (Two numbers and an operator) :");
        System.out.println("Example (2 4 +)");
        System.out.println("Input :");
        int a=scan.nextInt();
        int b=scan.nextInt();
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
