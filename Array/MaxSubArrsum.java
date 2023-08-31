package Array;

public class MaxSubArrsum { 
    public static void prsumsubarr(int num[]){
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i+1; j<num.length;j++){
                int end=j;
                curSum=0;
                for(int k=start;k<=end;k++){
                    curSum+=num[k];
                }
                System.out.println(curSum);
                if(maxSum<curSum){
                    maxSum=curSum;
                }
                
            }
            
        }
        System.out.println("max sum = " + maxSum);
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        prsumsubarr(num);

        
    }
    
}
