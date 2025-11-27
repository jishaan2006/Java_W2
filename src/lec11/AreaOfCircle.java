package lec11;

interface Shape{
    void area();
}

class Circles implements Shape{
    int r;
    Circles(int r){
        this.r=r;
    }
    public void area(){
        double res=3.14*r*r;
        System.out.println("Area of circle :"+res);
    }
}
public class AreaOfCircle {
    public static void main(String[] args) {
        Circles c=new Circles(5);
        c.area();
    }
}
