package SwitchStatements;
import java.util.Scanner;
public class Calculator { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first value");
        int a=sc.nextInt();
        System.out.print("Enter second value:");
        int b=sc.nextInt();
        System.out.print("Enter the operator to perform(+,-,/,*,%): ");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+':System.out.println(a+b);
                        break;
            case '-':System.out.println(a-b);
                        break;
            case '*':System.out.println(a*b);
                        break;
            case '/':System.out.println(a/b);
                        break;
            case '%':System.out.println(a/b);
                        break;
            default :System.out.println("Wrong operator");
        }
        sc.close();
        
    }
   
    
}
