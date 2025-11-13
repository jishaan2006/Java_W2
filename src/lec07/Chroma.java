package lec07;
class Laptop{
    String brand;
    int ram;
    int price;

    void setDetails(String b,int r,int p){
        brand=b;
        ram=r;
        price=p;
    }

    void display(){
        System.out.println("Brand :"+brand);
        System.out.println("Ram :"+ram);
        System.out.println("Price :"+price+"\n");
    }
}
public class Chroma {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();

        l1.setDetails("Lenovo",16,80000);
        l2.setDetails("ASUS",16,95000);

        l1.display();
        l2.display();
    }
}
