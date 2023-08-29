package Array;

public class Arrpassreeg {
    public static void update(int marks[],int nonchangeable){
        nonchangeable=5;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
        System.out.println("function value of nonchangeable: "+nonchangeable);
    }
    public static void main(String[] args) {
        int marks[]={97,98,99};
        int nonchangeable=10;
        update(marks,nonchangeable);
        System.out.println("main function value of nonchangeable: " +nonchangeable);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
    
}
