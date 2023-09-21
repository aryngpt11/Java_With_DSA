package BitManipulation;

public class ODDEVEN {
    public static void oddeven(int n){
        int bitM=1;
        if((n&bitM)==0){
            System.out.println("even num");
        }
        else{
            System.out.println("odd num");
        }
    }
    public static void main(String[] args) {
        oddeven(3);
        oddeven(11);
        oddeven(14);
        oddeven(2);
        
    }
}
