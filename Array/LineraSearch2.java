package Array;

public class LineraSearch2 {
    public static void main(String[] args) {
        int key=90;
        int arr[]={20,30,40,50,60,10};
        for(int i=0 ;i<arr.length;i++){
            if(arr[i]==key){
                System.out.print("the element is found at index: "+i);
            }
        
        }
        System.out.println("The given element is not present in the given array");
    }
    
}
