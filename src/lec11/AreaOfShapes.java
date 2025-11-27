package lec11;

abstract class Shapes{
    abstract void area();
}

class Circle extends Shapes{
    int r;
    public Circle(int r){
        this.r=r;
    }
    void area(){
        double res=3.14*r*r;
        System.out.println("Area of Circle :"+res);
    }
}

class Rectangle extends Shapes{
    int l,b;
    public Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    public void area(){
        double res=l*b;
        System.out.println("Area of Rectangle :"+res);
    }
}

public class AreaOfShapes {
    public static void main(String[] args) {
        Circle c1=new Circle(10);
        c1.area();

        Rectangle r1=new Rectangle(10,20);
        r1.area();
    }
}




