public class subarray {
    public static void main(String args[]){
        int[] nums={2,4,6,8,10};
        int n=nums.length;
        int sum=0;
        int totalsubarray=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){//print 
                    sum=sum+nums[k];//sum of subarray
                    System.out.print(nums[k]+" ");
                
                }
            
            System.out.print(", and sum of the subarray="+sum+" ");
            sum=0; //reset sum for each subarray
            totalsubarray++;
            System.out.println();
        }
            System.out.println();
        } 
        System.out.println("Total subarrays:"+totalsubarray);
    }
}
