package OOPS;

public class First {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("blue");
        System.out.println(p1.color);
         
    } 
    
}
class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
class Student{
    String name;
    int age;
    float percentage;
    void calcPercetage(int phy, int chem,int math){
        percentage=(phy+chem+math)/3;  
    }
}
