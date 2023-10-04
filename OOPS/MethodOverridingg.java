package OOPS;

public class MethodOverridingg {
    public static void main(String[] args) {
      Deer d=new Deer();
      d.eat();  
    }
}
class Animall{
    void eat(){
        System.out.println("eats Anything");
    }
}

class Deer extends Animall{
    void eat(){
        System.out.println("Eat grass");
    }
}
