package Pattern;

public class FloydPattern {
    public static void main(String[] args) {
        int n=10,num=1;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+++" ");
                
            }
            
            System.out.println();
        }
    }
    
}
