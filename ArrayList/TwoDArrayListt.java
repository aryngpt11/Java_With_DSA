package ArrayList;
import java.util.ArrayList;
public class TwoDArrayListt {
    public static void main(String[] args) {
        /* ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1); list.add(2);
        mainList.add(list);
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(3); list1.add(4);
        mainList.add(list1);
        for (int i=0;i<mainList.size();i++){
            ArrayList<Integer>currList=mainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainList); */

        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        for(int i=1; i<=5;i++){
            list.add(i*1);
            list1.add(i*2);
            list2.add(i*3);
        }
        mainList.add(list);
        mainList.add(list1);
        mainList.add(list2);
        System.out.println(mainList);
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currList=mainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }



    }
    
}
