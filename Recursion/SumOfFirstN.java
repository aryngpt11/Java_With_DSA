package Recursion;
import java.util.*;
public class SumOfFirstN {
    public static int calcSumm(int n){
        if(n==1){
            return 1;
        }
        int snm1=calcSumm(n-1);
        int sn=n+snm1;
        return sn;

    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter ther value of n: ");
        int n=sc.nextInt();
        
        System.out.println("the sum of foirst natural num is: "+calcSumm(n));
        sc.close();
    }
}
