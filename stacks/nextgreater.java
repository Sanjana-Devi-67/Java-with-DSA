import java.util.*;
public class nextgreater {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer> s=new Stack<>();
        int next_greater[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            //while loop(s.peek()->has index not element since we push index to stack)
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){//to access element we use arr[s.peek()]
                s.pop();
            }
            //if-else
            if(s.isEmpty()){
                next_greater[i]=-1;
            }else{
                next_greater[i]=arr[s.peek()];
            }
            //push index of element already analysed
            s.push(i);
        }
      for(int i=0;i<next_greater.length;i++){
        System.out.print(next_greater[i]+" ");
      }
    }
}
