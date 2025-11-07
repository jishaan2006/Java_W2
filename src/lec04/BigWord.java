package lec04;

public class BigWord {
    public static void main(String[] args) {
        String str = "Java is a goodd language";
        String[] a = str.split(" ");
        String res=a[0];
        int max_length_word= a[0].length();
        for (int i=1;i<a.length;i++) {
            if(max_length_word<a[i].length()){
                max_length_word=a[i].length();
                res=a[i];
            }
        }
        System.out.println("Longest word: " + res + " (length: " + max_length_word + ")");
    }
}
