package ConditionalStatements;
import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check Even or Odd: ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is an even number.");
        }
        else{
            System.out.println(num+" is a odd number");
        }
        sc.close();
    }

    
}
