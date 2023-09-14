package Strings;
//import java.util.*;
public class Basic {
    public static void Letters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       /*  char arr[]={'a','b','c','d'};
        String str="abcd";
        //or
        String str1=new String("xyz");
        Scanner sc=new Scanner(System.in);
        //String name=sc.next();
        String name=sc.nextLine();
        System.out.println(name);
        System.out.println(arr);
        System.out.println(str);
        System.out.println(str1);
        sc.close(); */


        //length of a string

        //String fullname="Aryan Gupta";
        //System.out.println(fullname.length());


        //concatenation
        String fname="Aryan";
        String lname="Gupta";
        String fullname=fname+" "+lname;
        System.out.println(fullname);
        System.out.println(fullname.charAt(0));
        Letters(fullname);
    }
    
}
