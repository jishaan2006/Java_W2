package lec10;
class Animal{
    void eat(){
        System.out.println("Food");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("roti");
    }
    void data(){
        System.out.println("carrot");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
    }
}
