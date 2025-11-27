package lec11;

//class A{
//    void show(){
//        System.out.println("hiii");
//    }
//}
//
//class B{
//    void show(){
//        System.out.println("hello");
//    }
//}
//
//class C extends A,B{   //not allowed multiple inheritance (diamond problem)
//
//}

interface Aa {
    void show();
}

interface Bb {
    void show();
}

class C implements Aa, Bb {
     public void show(){
         System.out.println("C show()"); //allowed in interfaces
    }
}
public class Hello {
    public static void main(String[] args) {
        C c1=new C();
        c1.show();
    }
}
