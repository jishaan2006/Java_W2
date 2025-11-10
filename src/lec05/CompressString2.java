package lec05;

public class CompressString2 {
    public static void main(String[] args){
        String str="aaaaaaaabbbbbccccdddddddd";
        StringBuilder result=new StringBuilder();
        int count=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }else{
                result.append(str.charAt(i-1)).append(count);
                count=1;
            }
        }
        result.append(str.charAt(str.length() - 1)).append(count);
        System.out.print(result);
    }
}
