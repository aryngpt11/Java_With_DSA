package OOPS;

public class Absstracttion {
   public static void main(String[] args) {
    /* Horse h=new Horse();
    h.eat();
    h.walk();
    System.out.println(h.color);
    Chicken c=new Chicken();
    c.eat();
    c.walk(); */
    Mustang m=new Mustang();
   } 
}
abstract class Animal1{
    String color;
    Animal1(){
        System.out.println("Animal constructor is called.");
    }
    void eat(){//non abstarct method
        System.out.println("Animal eats");
    }
    abstract void walk();//abstract method

}
class Horse extends Animal1{
    Horse(){
        System.out.println("horse constructor called");
    }
    void changeColor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }

}
class Mustang extends Horse{
    Mustang(){
        System.out.println("const called");
    }
}
class Chicken extends Animal1{
    void changeColor(){
        color="White";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }

}