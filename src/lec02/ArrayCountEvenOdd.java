package lec02;
import java.util.Scanner;
public class ArrayCountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int odd_count=0,even_count=0,zero=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zero++;
            }
            else if(arr[i]%2==0){
                even_count++;
            }
            else{
                odd_count++;
            }
        }
        System.out.println(even_count+" Even numbers \n"+odd_count+" Odd numbers \n"+zero+" Zero");
    }
}
