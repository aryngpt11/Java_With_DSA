package Array;

public class LinearSearch {
    public static int Linear(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int key=10;
        int num[]={2,3,4,5,6,7,1,2,10};
        int index=Linear(num, key);
        if(index==-1){
            System.out.println("Nbot Found");
        }
        else{System.out.println("key at index: "+index);}
        
    }


}


