import java.util.*;
public class fractionalKnapsack {
    public static void main(String[] args){
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int w=50;
        //to sort ratios we make a 2d array
        double ratio[][]=new double[val.length][2];
        //0th col-> idx and 1st col->ratio
        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;//index storing
            ratio[i][1]=val[i]/(double)weight[i];
        }
        //sort -> ascending order
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        //since array is in ascending and we want descending we start from end
        int capacity=w;
        int finalVal=0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            //include totally
              if(capacity>=weight[idx]){
                finalVal+=val[idx];
                capacity-=weight[idx];
            }
            else{
                //include fractional part
                finalVal+=(ratio[i][1] * capacity);
                capacity=0;
                break;
            }
        }
        System.out.print("final value="+finalVal);
    }
}
