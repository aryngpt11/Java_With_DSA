package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class Swapnums {
    public static void swap(ArrayList<Integer>list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(45);
        list.add(5);
        int idx1=1,idx2=3;
        System.out.println(list);
        swap(list,idx1,idx2);
        System.out.println(list);
        Collections.sort(list);//ascending order
        System.out.println(list);

        //descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
    
}
