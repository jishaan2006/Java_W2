package lec02;
import java.util.Scanner;
public class SumNaturalNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Value of n :");
        int n= sc.nextInt();
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        System.out.print("Sum of Natural numbers till "+n+" is :" +sum);
    }
}
