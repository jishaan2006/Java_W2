package lec07;
class book{
    String title;
    String author;
    float price;

    void addBook(String t,String a,float p){
        title=t;
        author=a;
        price=p;
    }
    void discount(){
        price=(float)(price-price*0.1);
    }
    void Showbill(){
        System.out.println("Title :"+title);
        System.out.println("Author :"+author);
        System.out.println("Price :"+price);
        System.out.println();
    }
}
public class Bookstore {
    public static void main(String[] args) {
        book b = new book();
        b.addBook("Harry potter","J.K Rowling",1000);
        b.Showbill();
        System.out.println("After discount :");
        b.discount();
        b.Showbill();
    }
}
