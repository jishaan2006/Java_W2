package lec12;

class Test {
    final int x = 10;
    void show() {
        //x = 20;             // Error ,value of final variable cannot be changed.
        System.out.println(x);
    }
}

class Constructor{
    final int age;
    Constructor(int a) {
        age = a; // allowed
    }
}

class Parent {
    final void show() {
        System.out.println("Parent show");
    }
}
class Child extends Parent {
    // void show() {} // Error     //A final method cannot be overridden in child classes.
}

final class Vehicle {
    void run() {
        System.out.println("Running...");
    }
}
// class Car extends Vehicle {}        // Error         //A final class cannot be inherited.

class Student {
    int marks;
}


public class Final{
    public static void main(String[] args) {

        Test t=new Test();
        t.show();

        final Student s = new Student();
        s.marks = 90; // allowed
        // s = new Student();   //Final reference means reference cannot change, but object CAN change.
    }
}

// Real Uses of final keyword ->
// Defining constants
// Preventing method overriding
// Preventing inheritance
// Creating immutable classes (String is final)
// Thread-safety (final variables)