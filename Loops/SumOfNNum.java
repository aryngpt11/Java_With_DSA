package Loops;
import java.util.Scanner;
public class SumOfNNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int count=1,summ=0;
        while(count<=n){
            summ+=count;
            
            count++;
        }
        System.out.println(summ);
        sc.close();
    }
    
}
