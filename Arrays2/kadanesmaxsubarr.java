

public class kadanesmaxsubarr{
    public static void main(String[] args) {
        int[] num={-2,-3,4,-1,-2,1,5,-3};
        int ms= Integer.MIN_VALUE;
        
        int cs=0;
        for(int i=0;i<num.length;i++){
            cs=cs+num[i];
            if(cs<0){
                cs=0;
            }
            // if(cs>ms){
            //     ms=cs;
            // }
            //or
            ms=Math.max(cs,ms);
        }
        System.out.println("Max subarray sum="+ms);
    }
}