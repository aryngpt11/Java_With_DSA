package Array;
import java.util.Scanner;
public class ArrCreation {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println(arr.length);
        arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        arr[2]=sc.nextInt();
        arr[3]=sc.nextInt();
        arr[4]=sc.nextInt();
        /* arr[0]=50;
        arr[1]=60;
        arr[2]=70;
        arr[3]=80;
        arr[4]=90; */

        //we can alsop take input from the user using scanner class
        
        /* for(int x:arr){
            System.out.println(x);
        } */

        for(int i=0;i<=4;i++){
            System.out.print(arr[i]+",");
        }
        sc.close();
    }
    
}
