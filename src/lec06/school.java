package lec06;

class student{
    String name;
    int roll;
    int marks;

    void set(String n,int r,int m){
        name=n;
        roll=r;
        marks=m;
    }
    void display(){
        System.out.println("Name :"+name);
        System.out.println("Roll number :"+roll);
        System.out.println("Marks :"+marks);
        System.out.println();
    }
}

public class school {
    public static void main(String[] args){
    student s1=new student();
    student s2=new student();
    student s3=new student();

    s1.set("Jishaan",154,35);
    s2.set("Ishika",11,21);
    s3.set("Ruchi",70,99);

    s1.display();
    s2.display();
    s3.display();

    }
}
