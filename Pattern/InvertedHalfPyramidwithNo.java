package Pattern;

public class InvertedHalfPyramidwithNo {
    public static void PyramidWithNo(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PyramidWithNo(5);
        
    }
    
}
