package FunctionsOrMethods;

import java.util.Scanner;

public class SumUsingFun3 {
        public static int calculateSum(int a,int b){
        
        return a+b;
        
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b=sc.nextInt(); 

        int summ=calculateSum(a,b);
        System.out.println("Sum is "+summ);
        sc.close();
      
    }
    
    
}
