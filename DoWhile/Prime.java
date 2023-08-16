package DoWhile;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        boolean isPrime=true;
        //for(int=2;i<=n-1;i++)
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                isPrime=false;
            }

           
        }
         if(isPrime==true){
                System.out.println("n is prime");
            }
        else{
                System.out.println("n is not prime");
            }
        sc.close();
    }
    
}
