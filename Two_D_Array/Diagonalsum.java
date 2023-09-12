package Two_D_Array;

public class Diagonalsum {
    public static int Diagonal(int m[][]){
        int summ=0; 
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(i==j){
                    summ+=m[i][j];
                }
                //secondary diagonal
                else if(i+j==m.length-1){
                    summ+=m[i][j];
                }
            }
            

        }
        return summ;
        

    }
    public static void main(String[] args) {
        int m[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("the sum of diagonal element of the matrix are: " +Diagonal(m));
    }
    
}
