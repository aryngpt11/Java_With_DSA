package OOPS;

public class Innheritancce {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();
        
    }
}
//base Class
class Animal{
    String color;//properties
    void eat(){//functions
        System.out.println("Eats");
    }     
    void breathe(){
        System.out.println("breathes");
    }
}
//Derived Class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water");
    }
}
