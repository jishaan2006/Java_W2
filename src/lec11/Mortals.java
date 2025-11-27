package lec11;

interface Walkable{
    void walk();
}

interface Runnable{
    void run();
}

class Humans implements Walkable,Runnable{
    public void walk(){
        System.out.println("Humans can walk");
    }
    public void run(){
        System.out.println("Humans can run");
    }
}
public class Mortals {
    public static void main(String[] args) {
        Humans h1=new Humans();
        h1.run();
        h1.walk();
    }
}
