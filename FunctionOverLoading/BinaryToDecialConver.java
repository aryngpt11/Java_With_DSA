package FunctionOverLoading;

public class BinaryToDecialConver {
    public static void binToDec(int binnum){
        int mynum=binnum;
        int pow=0;
        int decnum=0;
        while(binnum>0){
            int ld=binnum%10;
            decnum=decnum+(ld*(int)Math.pow(2,pow));
            pow++;
            binnum=binnum/10;
        }
        System.out.println("decimal of "+ mynum+"= "+decnum);

    }
    public static void main(String[] args) {
        binToDec(101);
        
    }
    
}
