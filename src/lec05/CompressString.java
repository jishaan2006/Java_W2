package lec05;

import javax.management.StringValueExp;

public class CompressString {
    public static void main(String[] args){
        String str=new String("aaabbcccddddddddddd");
        char[] c=str.toCharArray();
        int a=c.length;
        int count=1;
        for(int i=0;i<a-1;i++){
            if(c[i]==c[i+1]){
                count++;
            }else{
                System.out.print(c[i]+""+count);
                count=1;
            }
        }
        System.out.print(c[a-1] + "" + count);
    }
}
