package FunctionsOrMethods;

import java.util.Scanner;

public class SumUsingFun2 {
    public static void calculateSum(int a,int b){
        
        int summ=a+b;
        System.out.println("Sum is "+summ);
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b=sc.nextInt(); 

        calculateSum(a,b);
        sc.close();
      
    }
    
}
