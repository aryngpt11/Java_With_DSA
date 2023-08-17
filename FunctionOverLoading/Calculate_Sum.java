package FunctionOverLoading;

public class Calculate_Sum { 
   public static int sum(int a,int b){
      return a+b;

   }
   public static float sum(float a,float b){
      return a+b;

   }
   public static double sum(double a,double b){
      return a+b;

   }
   
   public static void main(String[] args) {
      int a=55;
      int b=78;
      System.out.println(sum(15d, 75d));
      System.out.println("float"+sum(3f, 5f));
      System.out.println(sum(10,20));
    
   }
    
}
