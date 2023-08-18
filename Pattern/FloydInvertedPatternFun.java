package Pattern;

public class FloydInvertedPatternFun {
    public static void InvertedWithCounting(int n){
        int num=55;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(num--+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        InvertedWithCounting(10);
        
    }
    
}
