package lec11;

interface Vehicle{
    default void start(){
        System.out.println("Vehicle is starting...");
    }
}

class Car implements Vehicle{

}
public class Parking {
    public static void main(String[] args) {
        Car v=new Car();
        v.start();
    }
}
