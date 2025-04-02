import java.util.*;
public class maxHistogram {
    public static void maxArea(int[] arr){
        int maxArea=0;
        int nsr[] =new int[arr.length];
        int nsl[] =new int[arr.length];
        //next smaller right
        Stack<Integer> s1=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            if(!s1.isEmpty() && arr[s1.peek()]>=arr[i]){
                s1.pop();
            }
            if(s1.isEmpty()){
                 nsr[i]=arr.length;
            }else{
                 nsr[i]=s1.peek();
            }
            s1.push(i);
        }
        //next smaller left
        s1=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(!s1.isEmpty() && arr[s1.peek()]>=arr[i]){
                s1.pop();
            }
            if(s1.isEmpty()){
                 nsl[i]=-1;
            }else{
                 nsl[i]=s1.peek();
            }
            s1.push(i);
        }
       //current area:width=j-i-1=nsr[i]-nsl[i]-1
       for(int i=0;i<arr.length;i++){
        int height=arr[i];
        int width=nsr[i]-nsl[i]-1;
        int area=width*height;
        maxArea=Math.max(area,maxArea);
       }
       System.out.print("Max area of histogram:"+maxArea);
    }
    public static void main(String[] args) {
        int[] arr={2,1,5,6,2,3};
        maxArea(arr);
    }
}
