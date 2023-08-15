package ConditionalStatements;
import java.util.Scanner;
public class Else_if_s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=sc.nextInt();
        if(a>=85){
            System.out.println("Grade A");
        }
        else if(a>=60){
            System.out.println("B grade");
        }
        else if(a>=33){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Fail or D Grade");
        }
        sc.close(); 
        
    }
    
}
