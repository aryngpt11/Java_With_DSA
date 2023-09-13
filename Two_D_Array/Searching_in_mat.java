package Two_D_Array;
import java.util.Scanner;
public class Searching_in_mat {
     public static boolean Searching(int m[][], int key){
    
        for(int i=0;i<m.length;i++){
            
            for(int j=0;j<m.length;j++){
                if(key==m[i][j]){
                   return true;

                }
                
            }
            
           
        }
        return false;

     }
    public static void main(String[] args) {
        int m[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of key: ");
        int key=sc.nextInt();
        System.out.println(Searching(m, key));
        sc.close();
        
    }
    
}
