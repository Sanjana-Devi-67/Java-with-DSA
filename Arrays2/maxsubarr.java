public class maxsubarr {
    public static void main(String args[]){
        int[] nums={1,-2,6,-1,3};
        int n=nums.length;
        int max_sum=Integer.MIN_VALUE;
        int sum;
        for(int i=0;i<n;i++){
          for(int j=i;j<n;j++){
                sum=0; //reset sum for each subarray
                for(int k=i;k<=j;k++){//print 
                    sum=sum+nums[k];//sum of subarray
                    if(sum>max_sum){
                        max_sum=sum;//maximum sum
                    }
                }
            
                System.out.println("sum of the subarray="+sum+" ");
             }
             System.out.println();
            }
        
        System.out.println("maximum sum="+max_sum);
    }
}
