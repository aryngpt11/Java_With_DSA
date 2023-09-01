package Sorting;

public class SelectionSort {
    public static void selectionsort(int num[]){
        for(int i=0;i<num.length;i++){
            int minpos=i;
            for(int j=i+1;j<num.length;j++){
                if(num[minpos]>num[j]){
                    minpos=j;

                }
            }
            int temp=num[minpos];
            num[minpos]=num[i];
            num[i]=temp;

        }
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int num[]={5,4,1,3,2};
        selectionsort(num);

    }
    
}
