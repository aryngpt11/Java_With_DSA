package ForLoop;

public class Reverse_A_Num {
    public static void main(String[] args) {
        int n=10899;
        while(n>0){
            int lastDigit=n%10;
            System.out.print(lastDigit);
            n=n/10;
        }
        System.out.println(); 
        
       

       
    }
    
}
