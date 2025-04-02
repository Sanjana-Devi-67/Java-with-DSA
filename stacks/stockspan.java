import java.util.*;
public class stockspan {
    public static void stock(int[] stocks,int[] span){
       Stack<Integer> s=new Stack<>();
       span[0]=1;
       s.push(0);
       //to calculate span for each day
       for(int i=1;i<stocks.length;i++){
         int currPrice=stocks[i];
         //remove all smaller prices than curr price
         while(!s.isEmpty() && currPrice>stocks[s.peek()]){
             s.pop();
         } 
         //check if stack is empty if so make span as i+1
         if(s.isEmpty()){
            span[i]=i+1;
         }
         //calculate prevhigh and find span
         else{
            int prevHigh=s.peek();
            span[i]=i-prevHigh;
         }
         //push the currindex to stack
         s.push(i);
       }

    }
    public static void main(String[] args) {
        int stocks[]={100,80,60,70,60,85,100};
        int span[]=new int[stocks.length];
        stock(stocks,span);
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
    }
}
