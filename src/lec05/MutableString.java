package lec05;

public class MutableString {
    public static void main(String[] args){
        StringBuilder str=new StringBuilder("hello");
        System.out.println(str.length());
        System.out.println(str.append("hi"));
        System.out.println(str);
        System.out.println(str.insert(2,"ok"));
        System.out.println(str.replace(2,4,"okkkk"));
        System.out.println(str.delete(2,4));
        System.out.println(str.reverse());
        System.out.println(str.deleteCharAt(2));
        str.setCharAt(3,'k');
        System.out.println(str);
    }
}
