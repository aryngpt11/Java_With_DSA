package ArrayList;
import java.util.ArrayList;
public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer>Arr=new ArrayList<>();
        Arr.add(10);
        Arr.add(20);
        Arr.add(30);
        Arr.add(40);
        Arr.add(50);

        //reverse of a number O(n)
        for(int i=Arr.size()-1;i>=0;i--){
            System.out.print(Arr.get(i)+" ");
        }
        System.out.println();


        //maximum in the array
        int max=Integer.MIN_VALUE;
        for(int i=0;i<Arr.size();i++){
            /* if(max<Arr.get(i)){
                max=Arr.get(i);

            } */
            //or

            max=Math.max(max,Arr.get(i));

        }
        System.out.println("the maximum value in the given array are: "+max);
    }
    
}
