package WhileLoop;
import java.util.Scanner;
public class PrintNumsUsingScann {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n=sc.nextInt();
        int count=1;
        while(count<=n){
            System.out.print(count+" ");
            count++;
        }
        System.out.println();
        sc.close();
    }
    
}
