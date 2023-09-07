package Two_D_Array;
import java.util.Scanner;
public class Creation {
    public static boolean Search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if (matrix[i][j]==key){
                    System.out.println("found");
                    return true;
                }
                

            }
            
        }
        System.out.println("not found");
        return false;

    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        //int n=3,m=3; or
        int n=matrix.length, m=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        
        Search(matrix, 5);

        //output
        
        sc.close();
    }
    
}
