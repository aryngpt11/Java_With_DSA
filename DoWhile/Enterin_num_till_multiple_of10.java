package DoWhile;
import java.util.Scanner;
public class Enterin_num_till_multiple_of10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        
        do{System.out.print("Enter the value");
        
            int n=sc.nextInt();
            
            System.out.println(n);
            if(n%10==0){
                break ;
            }
        }while(true);
        sc.close();
    }
    
}
