package lec07;

class circle{
    int radius;
    void setRadius(int r){
        radius=r;
    }
    void AreaCircumference(){
        System.out.println("Area :"+(float)(3.14*radius*radius));
        System.out.println("Circumference :"+(float)(2*3.14*radius));
        System.out.println();
    }
}
public class CircleAreaCircumference {
    public static void main(String[] args){
        circle c1=new circle();

        c1.setRadius(10);
        c1.AreaCircumference();
    }
}

