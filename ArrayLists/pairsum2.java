import java.util.ArrayList;
public class pairsum2 {
    public static boolean pairsumtwo(ArrayList<Integer> list,int target){
          int bp=-1;
          int n=list.size();
          //to find breaking point
          for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
          }
          int lp=bp+1; //smallest
          int rp=bp; //largest
          while(lp!=rp){
            //case1:target found
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            //case2:sum is less than target update lp
            if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }else{
                //case 3:sum is greater than target update rp
                rp=(n+rp-1)%n;
            }
          }
          return false;
    }
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        //11,15,6,8,9,10->sorted and rotated
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=16;
        System.out.println(pairsumtwo(list, target));
    }
}
