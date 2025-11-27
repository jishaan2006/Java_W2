package lec11;

interface Animal{
    void makeSound();
}

class Dog implements Animal{
    public void makeSound() {
        System.out.println("Bark");
    }
}
public class Jungle {
    public static void main(String[] args) {
        Animal d=new Dog();
        d.makeSound();
    }
}
