package OOPS;

public class Constructtorr {
    public static void main(String[] args) {
        //Studentt s1=new Studentt();
        Studentt s2=new Studentt("Aryan");
        Studentt s3=new Studentt(1127);
       // Studentt s4=new Studentt("Aryan",29);not exist
        System.out.println(s2.name);
        System.out.println(s3.roll);
    }
    
}
class Studentt{
    String name;
    int roll;
    Studentt(String name){//parameterized constructor
        this.name=name;
    }
    Studentt(){//non parameterized cvonstructor
        System.out.println("Constructor is called");
    }
    Studentt(int roll){
        this.roll=roll;
    }
}
