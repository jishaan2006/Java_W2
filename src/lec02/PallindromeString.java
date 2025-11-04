package lec02;

import java.util.Scanner;

public class PallindromeString {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=sc.nextLine();
        char arr[]=str.toCharArray();
        for(int i=0;i< arr.length/2;i++){
            char temp=arr[i];
            arr[i]=arr[str.length()-1-i];
            arr[str.length()-i-1]=temp;
        }
        String a= new String(arr);
        if(a.equals(str)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
