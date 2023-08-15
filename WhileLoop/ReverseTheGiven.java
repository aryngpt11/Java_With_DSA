package WhileLoop;

public class ReverseTheGiven {
    public static void main(String[] args) {
        int n=100901,rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        System.out.print(rev);
    }
    
}
