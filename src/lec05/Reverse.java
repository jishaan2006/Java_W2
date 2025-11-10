package lec05;

public class Reverse {
    public static void main(String[] args){
        String str=new String("i love java");
        String[] arr=str.split(" ");
        StringBuilder ans=new StringBuilder();
        for(String a:arr){
            StringBuilder res=new StringBuilder(a);
            ans.append(res.reverse().append(" "));
        }
        System.out.println(ans);
    }
}

