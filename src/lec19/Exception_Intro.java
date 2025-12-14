package lec19;

public class Exception_Intro {
    public static void main(String[] args) {

        System.out.println("Program Start");

        // 1. Array exception
        try {
            int arr[] = new int[5];
            System.out.println(arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error: " + e);
        }

        // 2. Null pointer exception
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Error: " + e);
        }

        // 3. Arithmetic exception
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: " + e);
        }

        System.out.println("Program End");
    }
}
