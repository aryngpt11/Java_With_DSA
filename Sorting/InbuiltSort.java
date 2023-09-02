package Sorting;
import java.util.Arrays;
public class InbuiltSort {
    /* public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ,");
        }
        System.out.println();
    } */
    public static void main(String[] args) {
        int arr[]={30,3,43,2,1,45,123,11};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ,");
        }
        System.out.println();
        /* printarr(arr); */
    }
}
 