package Array;

public class SubArrSumPrefix {
    public static void prefixsumsubarr(int num[]){
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[num.length];
        prefix[0]=num[0];
        for(int i=1; i<prefix.length;i++){ 
            prefix[i]=prefix[i-1]+num[i];

        }
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i+1; j<num.length;j++){
                int end=j;
                curSum= start==0? prefix[end]:prefix[end]- prefix[start-1];
               
                if(maxSum<curSum){
                    maxSum=curSum;
                }
                
            }
            
        }
        System.out.println("max sum = " + maxSum);
    }
    
    public static void main(String[] args) { 
        int num[]={2,4,6,8,10};
        prefixsumsubarr(num);
        
    }
    
}
