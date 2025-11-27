package lec11;

interface Parent{
    void sleep();
    default void hair(){
        System.out.println("has hair");
    }
}
class Child implements Parent{
    public void sleep(){
        System.out.println("sleeping");
    }
}
public class Interface {
    public static void main(String[] args) {
        Child c1=new Child();
        c1.sleep();
        c1.hair();
    }
}
