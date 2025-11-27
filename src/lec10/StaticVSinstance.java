package lec10;
class Parent{
    static void StaticMethod(){
        System.out.println("Static Parent");
    }
    void instanceMethod(){
        System.out.println("Parent Instance");
    }
}
class Child extends Parent{
    static void StaticMethod(){
        System.out.println("Static Child");
    }
    void instanceMethod(){
        System.out.println("Child Instance");
    }
}
public class StaticVSinstance {
    public static void main(String[] args){
        Parent p1=new Child();
        p1.StaticMethod();
        p1.instanceMethod();
    }
}
