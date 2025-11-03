package lec01;
import java.util.Scanner;
public class GradeChecker{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Percentage: ");
        int percentage = scan.nextInt();

        if (percentage > 100 || percentage < 0) {
            System.out.println("Invalid Percentage!");
        }
        else if (percentage > 90) {
            System.out.println("Grade A");
        }
        else if (percentage >= 75) {
            System.out.println("Grade B");
        }
        else if (percentage >= 60) {
            System.out.println("Grade C");
        }
        else if (percentage >= 40) {
            System.out.println("Grade D");
        }
        else {   // no need for another condition here
            System.out.println("Fail");
        }

        scan.close();
    }
}

