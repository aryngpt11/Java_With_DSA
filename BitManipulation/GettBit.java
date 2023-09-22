package BitManipulation;

public class GettBit {
    public static int getbit(int n,int i){
        int bitt=1<<i;
        if((n&bitt)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setbit(int n,int i){
        int bitm=1<<i;
        return n|bitm;
    }
    public static void main(String[] args) {
        System.out.println(getbit(10,3));
        System.out.println(setbit(10, 2));
        
    }
    
}
