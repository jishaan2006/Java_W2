package lec06;

class sbi{
    String name;
    int accnum;
    int balance;

    void set_details(String n,int a,int b){
        name=n;
        accnum=a;
        balance=b;
    }

    void deposit(int d){
        balance=balance+d;
    }

    void withdraw(int w){

        if(balance<w){
            System.out.println("Insufficient balance");
        }else{
            balance=balance-w;
        }
    }

    void display_details(){
        System.out.println("Name :"+name);
        System.out.println("Account number :"+accnum);
        System.out.println("Balance :"+balance);
    }

}
public class Bank {
    public static void main(String[] args){
        sbi customer1=new sbi();

        customer1.set_details("Jishaan",8982,0);
        customer1.deposit(8000);
        customer1.withdraw(7000);
        customer1.display_details();
    }
}
