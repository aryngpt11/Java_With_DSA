package Pattern;

public class NumberPyramid {
    public static void Num_Pyramid(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print(i);
            }
            System.out.println();


        }
        for(int i=n;i>=1;i--){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print(i);
            }
            System.out.println();


        }

    }
    public static void main(String[] args) {
        Num_Pyramid(8);
        
    }
    
}
