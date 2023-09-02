package Sorting;
import java.util.Arrays;
import java.util.Collections;
public class InbuiltSort {
    /* public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ,");
        }
        System.out.println();
    } */
    public static void main(String[] args) {
        //this code is for priny=ting array in the ascending order
        int arr[]={30,3,43,2,1,45,123,11};
        Arrays.sort(arr);
        System.out.println("the given array in ascending order: ");
        /* Arrays.sort(arr,0,5); */
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ,");
        }
        System.out.println();
        
        //this code is for printing array in descending order

        Integer arrr[]={30,3,43,2,1,45,123,11};
        //Arrays.sort(arrr,0,5,Collections.reverseOrder());
        Arrays.sort(arrr,Collections.reverseOrder());
        System.out.println("the given array in descending order: ");
        for(int i=0;i<arrr.length;i++){
            System.out.print(arrr[i]+" ,");
        }
        System.out.println();

        
        
    }
    
}
 