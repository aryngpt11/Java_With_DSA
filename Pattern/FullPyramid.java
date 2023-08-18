package Pattern;

public class FullPyramid {
    public static void Full_Pyramid(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int z=1;z<=i;z++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        Full_Pyramid(5);
        
    }
    
}
