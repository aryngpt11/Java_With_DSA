package ConditionalStatements;
import java.util.Scanner;
public class Largest_Of_2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a=s.nextInt();
        System.out.print("Enter the value of b: ");
        int b=s.nextInt();
        if(a>b){
            System.out.println("a is greatest");
        }
        else{
            System.out.println("b Is largest");
        }
        s.close();
    }
    



    
}
