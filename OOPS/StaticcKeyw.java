package OOPS;

public class StaticcKeyw {
   public static void main(String[] args) {
    Sttuudent s1=new Sttuudent();
    s1.schoolName="GPS";
    s1.name="Aryan";
    System.out.println(s1.getName());
    Sttuudent s2=new Sttuudent();
    System.out.println(s2.schoolName);
    
   } 
}
class Sttuudent{
    String name;
    int roll;
     String schoolName;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
    void setRoll(int roll){
        this.roll=roll;
    }
    int getRoll(){
        return this.roll;
    }
}
