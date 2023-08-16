package ForLoop;
import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
        System.out.print("Enter value: ");
        int i=c.nextInt();


        for (;i != 0; i/= 10) {
            int digit = i % 10;
            System.out.print(digit);
            
        }
        c.close();
        

    }  
}
