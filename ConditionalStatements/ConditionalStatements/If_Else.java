package ConditionalStatements;
import java.util.Scanner;
public class If_Else {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.print("Enter the value of age: ");
        int age=sc.nextInt();
        if (age>=18){
            System.out.println("Valid to give vote");

        }
        else{
            System.out.println("Not Valid");
        }
        sc.close();
    }
    
}
