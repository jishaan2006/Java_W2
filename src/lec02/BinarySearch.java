package lec02;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements (Sorted): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target Element to find : ");
        int key= sc.nextInt();

        int start=0;
        int end=n-1;
        boolean found=false;

        while(start<=end){
        int mid=(start+end)/2;
            if(arr[mid]==key){
                System.out.println("Target found at index : "+mid);
                found=true;
                break;

            }
            else if(key>arr[mid]){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        if(!found){
            System.out.println("Target not Found");
        }
    }
}
