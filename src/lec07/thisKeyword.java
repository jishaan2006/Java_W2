package lec07;
class hiii{
    int a;
    void assign(int a){
        this.a=a;
    }
}
public class thisKeyword {
    public static void main(String[] args){
        hiii obj=new hiii();
        obj.assign(86);
        System.out.println(obj.a);
    }
}
