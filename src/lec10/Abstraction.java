package lec10;

 abstract  class Animals{
      abstract   void eat();
 }
 class Doggie extends  Animal{
     void eat(){
         System.out.println("Dog eats.");
     }
 }

 class Abstraction{
     public static void main(String[] args) {
         Doggie d1=new Doggie();
         d1.eat();

         Animals a1=new Animals() {
             void eat() {
                 System.out.println("Animal eats.");
             }
         };
         a1.eat();
     }
 }