import java.util.ArrayList;
public class pairsum1twop{
    public static boolean pairsum1(ArrayList<Integer> list,int target){
        int lp=0;
        int rp=list.size()-1;  
        while(lp!=rp){
            //case1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            //case2
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
        
    }
    public static void main (String[] args){
         ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=6;i++){
            list.add(i);
        }
        int tar=5;
        System.out.println(pairsum1(list,tar));
    }
}