public class trapping{
    public static int trappedRainwater(int[] height){
         //calc left max boundary-in form of array
         //calc right max boundary-in form of array
         int n=height.length;
         int leftMax[]= new int[n];
         leftMax[0]=height[0]; 
         for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        int RightMax[]= new int[n];
        RightMax[n-1]=height[n-1]; 
        for(int i=n-2;i>=0;i--){
            RightMax[i]=Math.max(height[i],RightMax[i+1]);
        }
        
        int trappedwater=0;
        //loop
        for(int i=0;i<n;i++){
            //waterlevel=min(leftmax bound,rightmax bound)
           int waterlevel=Math.min(leftMax[i],RightMax[i]);
            //trappedwater=waterlevel-height[i] also add new value to old trapped value
           trappedwater+=waterlevel-height[i];
        }
        return trappedwater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6};
        System.out.println(trappedRainwater(height));
    }
}