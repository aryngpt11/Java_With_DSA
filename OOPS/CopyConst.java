package OOPS;

public class CopyConst {
    public static void main(String[] args) {
        Studdent s1 = new Studdent(); // Use the correct class name
        s1.name = "Aryan";
        s1.roll = 123;
        s1.password = "abcd";
        
        // Use the copy constructor to create s2
        Studdent s2 = new Studdent(s1); // Use the correct class name
        
        // Modify s2's password
        s2.password = "xyz";
        
        // Print s1 and s2
        System.out.println("s1: " + s1.name + ", " + s1.roll + ", " + s1.password);
        System.out.println("s2: " + s2.name + ", " + s2.roll + ", " + s2.password);
    }
}

class Studdent { 
    String name;
    int roll;
    String password;

    // Copy constructor
    Studdent(Studdent s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;
    }
    Studdent(){
        System.out.println("this is a constructor");
    }
}
