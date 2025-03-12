public class sum {
    public static void main(String[] args) {
        int sum=0;
        int[][] nums = {{1,4,9},{11,4,3},{2,2,3} };
       for(int j=0;j<nums.length;j++){
           sum+=nums[1][j];
       }
       System.out.println(sum);
    }
}
