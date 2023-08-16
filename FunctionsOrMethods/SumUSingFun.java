package FunctionsOrMethods;
import java.util.Scanner;
public class SumUSingFun {
    public static void calculateSum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b=sc.nextInt(); 
        int summ=a+b;
        System.out.println("Sum is"+summ);
        sc.close();

    }
    public static void main(String[] args) {
        calculateSum();
      
    }
    
}
