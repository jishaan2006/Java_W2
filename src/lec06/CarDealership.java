package lec06;

class car{
    String brand;
    String model;
    int price;

    void add_car(String n,String m,int p){
        brand=n;
        model=m;
        price=p;
    }

    void display(){
        System.out.println("Brand :"+brand);
        System.out.println("Model "+model);
        System.out.println("Price :"+price);
        System.out.println();
    }
}
public class CarDealership {
    public static void main(String[] args) {
        car c1 = new car();
        car c2 = new car();
        car c3 = new car();

        c1.add_car("BMW", "Mcomp", 2024);
        c2.add_car("AUDI","R8",2018);
        c3.add_car("TATA NANO","Small",2011);

        c1.display();
        c2.display();
        c3.display();
    }
}
