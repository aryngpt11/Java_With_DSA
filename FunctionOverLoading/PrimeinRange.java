package FunctionOverLoading;

public class PrimeinRange {
    public static boolean primes(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                //isPrime=false;
                return false;
            }

        }
        return true;
    }
    public static void PrimesInRange(int n){
        for(int i=2;i<=n;i++){
            if(primes(i)){
                System.out.print(i+",");

            }
        }
        System.out.println();
    }

        
    
    public static void main(String[] args) {
        
       PrimesInRange(30);
        
    }
    
}
