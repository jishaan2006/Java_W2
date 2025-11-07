package lec04;

import java.util.Scanner;

public class vowelCounter {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter String : ");
            String str=sc.nextLine();
            int vowel=0;
            str=str.toLowerCase();
            for(char ch:str.toCharArray()){
                if("aeiou".indexOf(ch)!=-1){
                    vowel++;
                }
            }
            System.out.println("Vowel count : "+vowel);
        }
}
