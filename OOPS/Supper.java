package OOPS;

public class Supper {
    public static void main(String[] args) {
        Horsse h=new Horsse();
        System.out.println(h.color);
        
    }
}
class Anml{
    String color;
    Anml(){
        System.out.println("anml constructor is called");
    }
}
class Horsse extends Anml{
    Horsse(){
        super.color="brown";
        //super();
        System.out.println("Horse constructor is called");
    }

}