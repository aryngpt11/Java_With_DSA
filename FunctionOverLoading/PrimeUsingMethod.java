package FunctionOverLoading;

public class PrimeUsingMethod {
    public static boolean isPrime(int n){
        //boolean isPrime=true;
        if(n==2){//corner cases
            return true;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                //isPrime=false;
                return false;
            }

        }
        //return isPrime;
        return true;

    }
    public static void main(String[] args) {
        int n=2;
        boolean c=isPrime(n);
        if(c==true){
            System.out.println("given no is prime");
        }
        else{
            System.out.println("given no is not prime: ");
        }
        
    }
    
}
