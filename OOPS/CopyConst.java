package OOPS;

public class CopyConst {
    public static void main(String[] args) {
        Studdent s1 = new Studdent(); 
        s1.name = "Aryan";
        s1.roll = 123;
        s1.password = "abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        
        // Use the copy constructor to create s2
        Studdent s2 = new Studdent(s1); 
        s2.password = "xyz";
        s1.marks[2]=70;
        System.out.println( s1.name + ", " + s1.roll + ", " + s1.password);
        System.out.println( s2.name + ", " + s2.roll + ", " + s2.password);
        for (int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
        
    }
}

class Studdent { 
    String name;
    int roll;
    String password;
    int marks[];

    // Copy constructor
    Studdent(Studdent s1) {
        marks=new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks=s1.marks;
        
    }
    Studdent(){
        marks=new int[3];
        System.out.println("this is a constructor");
    }
    Studdent(String name){
        marks=new int[3];
        this.name=name;
    }
}
