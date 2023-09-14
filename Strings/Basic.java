package Strings;
import java.util.Scanner;
public class Basic {
    public static void main(String[] args) {
        char arr[]={'a','b','c','d'};
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
        sc.close();
    }
    
}
