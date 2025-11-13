package lec07;
class operations{
    double add(double a, double b){
        return a+b;
    }
    double subtract(double a, double b){
        return a-b;
    }
    double multiply(double a, double b){
        return a*b;
    }
    double divide(double a,double b){
        if(b==0){
            System.out.println("Cannot divide by 0");
            return 0;
        }
        return a/b;
    }
}
public class Calculatorr {
    public static void main(String[] args){
        operations o=new operations();
        System.out.println("Addition :"+o.add(5,10));
        System.out.println("Subtraction :"+o.subtract(5,10));
        System.out.println("Multiplication :"+o.multiply(5,10));
        System.out.println("Division :"+o.divide(5,10));
    }
}
