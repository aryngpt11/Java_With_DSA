package Strings;

public class String_Funcn_Comparison {
    public static void main(String[] args) {
        String s1="Aryan";
        String s2="Aryan";
        String s3=new String("Aryan");
        if(s1==s2){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
        if(s1==s3){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
        if(s1.equals(s3)){
            System.out.println("yes equal");

        }
        else{
            System.out.println("no not equal");
        }
    }
    
}
