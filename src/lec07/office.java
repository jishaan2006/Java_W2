package lec07;

class Employee {
    String name;
    int id;
    double salary;

    void setDetails(String n,int i,double s) {
        name=n;
        id=i;
        salary=s;
    }

    void increase() {
        salary=salary+(salary*0.05);
    }

    void display() {
        System.out.println("Name: " +name);
        System.out.println("ID: "+id);
        System.out.println("Salary: "+salary);
    }

}
public class office {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setDetails("Jishaan", 154, 50000);
        System.out.println("Before Increment:");
        e1.display();

        e1.increase();
        System.out.println("\nAfter Increment:");
        e1.display();
    }
}