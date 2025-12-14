package lec19;

public class Basics {
    public static void main(String[] args) {
        try {
            riskyMethod();
        } catch (ArithmeticException e) {
            System.out.println("Main me handle hua: " + e);
        }
        System.out.println("Program continue...");
    }

    static void riskyMethod() throws ArithmeticException {
        System.out.println("riskyMethod start");
        int result = 10 / 0;
        System.out.println("Result: " + result);
    }
}

