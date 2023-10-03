package OOPS;

public class Innheritancce {
    public static void main(String[] args) {
       /*  Fish shark=new Fish();
        shark.eat(); */
        Dog d=new Dog();
        d.eat();
        d.legs=4;
        System.out.println(d.legs);
        
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
class Mammals extends Animal{
    int legs;
}
class Dog extends Mammals{
    String breed;
}
//Derived Class
/* class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water");
    }
} */
