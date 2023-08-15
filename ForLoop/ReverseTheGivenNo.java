package ForLoop;

public class ReverseTheGivenNo {
    public static void main(String[] args) {
        int r=0,n=10801;
        for(;n!=0;n/=10){
            int digit=n%10;
            r=r*10+digit;

        }
        System.out.println(r);
    }
}
