package lec04;
import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string :");
        String str = scan.nextLine();
        int freq[] = new int[256];
        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }
        for(int i=0;i<256;i++){
            if(freq[i]>0){
                System.out.println((char)i +"->"+freq[i]);
            }
        }
    }
}
