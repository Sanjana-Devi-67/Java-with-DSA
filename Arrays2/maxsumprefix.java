public class maxsumprefix{
    public static void main(String args[]){
        int[] nums={1,-2,6,-1,3};
        int n=nums.length;
        int[] prefixsum=new int[n];
        int max_sum=Integer.MIN_VALUE;
        int sum;
        // int currsum;
        prefixsum[0]=nums[0];
        for(int i=1;i<n;i++){
            // sum=sum+nums[i];
            // prefixsum[i]=sum;
            prefixsum[i]=prefixsum[i-1]+nums[i];
        }
        for(int i=0;i<n;i++){
           for(int j=i;j<n;j++){
                sum = i==0? prefixsum[j]:prefixsum[j]-prefixsum[i-1];
                if(sum>max_sum){
                    max_sum=sum;
                }
           }
        }
        System.out.print(max_sum);   
     }
}