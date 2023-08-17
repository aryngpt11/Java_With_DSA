package FunctionOverLoading;

public class Multiplication {
    public static int multiply(int a,int b){
        return a*b;
    }
    public static int multiply(int a,int b,int c){
        return a*b*c;
    }
    public static int multiply(int a,int b,int c, int d){
        return a*b*c*d;
    }
    public static void main(String[] args) {
        int a=10;
        int b=25;
        System.out.println(multiply(a, b));
        System.out.println(multiply(70, 75,15));
        
    }
    
}
