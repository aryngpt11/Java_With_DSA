package FunctionsOrMethods;

public class Swapping_two_noUsingFun {
    public static void swap(int a,int b){
        System.out.println("the value of a before swapping: "+a);
        System.out.println("the value of b before swapping: "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("the value of a after swapping: "+a);
        System.out.println("the value of b after swapping: "+b);

    }
    public static void main(String[] args) {
        int a=5;
        int b=10;
       
        swap(a,b);
       

    }
    
}
