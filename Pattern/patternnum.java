package Pattern;
public class patternnum {
    public static void main(String[] args) {
        int n=10;
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+count+" ");
            }
            count++;
            System.out.println();
        }
    }
    
}
