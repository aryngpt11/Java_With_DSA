package FunctionsOrMethods;
import java .util.Scanner;
public class BionomialCoffi {
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
       
        return f;
    }
    public static int BinomialCoff(int n, int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_r_n=factorial(n-r);
        int bincoff=fact_n/(fact_r*fact_r_n);
        return bincoff;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.println("Enter the value of r: ");
        int r=sc.nextInt();
        int bincoff=BinomialCoff(n, r);
        System.out.println("The bionomial cofficient of the given number is: "+bincoff);
        sc.close();
        
    }
    
}
