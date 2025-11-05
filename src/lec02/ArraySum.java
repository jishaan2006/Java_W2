package lec02;
import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of Elements :");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter "+n+" Elements :");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of Elements of array is : "+sum);
    }
}
