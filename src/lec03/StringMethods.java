package lec03;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args){
        String str=new String("jishaan");
        String str2=new String("jishaan");
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.indexOf("s"));
        System.out.println(str.indexOf("o"));
        System.out.println(str.substring(2));
        System.out.println(str.substring(1,3));
        System.out.println(str==str2);
        System.out.println(str.equals(str2));
        System.out.println(str.length());
        str=str.trim();
        System.out.println(str.length());
    }
}

