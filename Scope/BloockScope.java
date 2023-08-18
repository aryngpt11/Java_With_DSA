package Scope;

public class BloockScope {
    public static void main(String[] args) {
        {int s=45;
        System.out.println(s);}
        //System.out.println(s); it throws an error because s is not define in the outer fron the curly braces
    }
    
}
