package lec02;

import java.util.Scanner;

public class linerSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target Element to find : ");
        int key= sc.nextInt();

        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println("Target found at index : "+i);
                return;
            }
        }
        System.out.println("Target not found");
    }
}
