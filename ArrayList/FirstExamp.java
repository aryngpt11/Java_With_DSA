package ArrayList;
import java.util.ArrayList;
public class FirstExamp {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        //ArrayList<String>list1=new ArrayList<>();
       // ArrayList<Boolean>list2=new ArrayList<>();
        list.add(11);
        list.add(27);
        //0r
        list.add(2,1127);
        list.add(22);
        list.add(23);
        /* list1.add("Aryan");
        list1.add("Arya");
        list2.add(true);
        list2.add(false); */

        System.out.println(list);
        /* System.out.println(list1);
        System.out.println(list2); */
        //get operation
        int element=list.get(1);
        System.out.println(element);
        System.out.println(list.size());

        //Delete
        /* list2.remove(false);
        System.out.println(list2); */
        //set value

        /* list2.set(1,true);
        System.out.println(list2); */

        //print the arraylist
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

    }
    
}
