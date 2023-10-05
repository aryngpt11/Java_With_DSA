package Recursion;

public class FirstOccur {
    public static int firstocc(int arr[] ,int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstocc(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,3,6,8,5,9};
        
        System.out.println(firstocc(arr, 5, 0));
    }
}
