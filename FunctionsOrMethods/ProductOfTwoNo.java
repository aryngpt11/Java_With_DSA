package FunctionsOrMethods;
import java.util.Scanner;
public class ProductOfTwoNo {
    public static int multiply(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a=sc.nextInt();
        System.out.println("Enter value of b: ");
        int b=sc.nextInt();
        int m=multiply(a, b);
        System.out.println("multiply of two no: "+m);
        sc.close();
        m=multiply(10, 89);
        System.out.println("multiply of two no: "+m);
        
        
    }
    
}
