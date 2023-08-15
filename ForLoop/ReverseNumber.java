package ForLoop;
import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value: ");
        int i=sc.nextInt();


        for (;i != 0; i/= 10) {
            int digit = i % 10;
            System.out.print(digit);
            
        }
        sc.close();
        

    }  
}
