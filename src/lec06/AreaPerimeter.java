package lec06;

class rectangle{
    int length;
    int breadth;

    void set_dimensions(int l,int b){
        length=l;
        breadth=b;
    }

    void area_perimeter(){
        System.out.println("Area :"+length*breadth);
        System.out.println("Perimeter :"+2*(length+breadth));
        System.out.println("");
    }

}
public class AreaPerimeter {
    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        rectangle r2 = new rectangle();

        r1.set_dimensions(5, 10);
        r2.set_dimensions(9, 11);

        r1.area_perimeter();
        r2.area_perimeter();
    }
}