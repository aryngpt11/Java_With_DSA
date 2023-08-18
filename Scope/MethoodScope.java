package Scope;

public class MethoodScope {
    public static void PrintS(){
        int s=5;//to use this funcion inside main method then we have to use the scope of this method which is PrintS()
        System.out.println(s);

    }

    public static void main(String[] args) {
        
        //System.out.println(s); if we write this then it will give error that s is not resolved because main method doesnot allow and the scope of the variable is not used 
        PrintS();
    }
    
}
