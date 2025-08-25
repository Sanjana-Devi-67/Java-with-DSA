import java.util.HashSet;
public class Countdistinct {
    public static void main(String[] args) {
        int[] arr={4,3,2,5,6,7,3,4,2,1};
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            // if(set.contains(arr[i])){
            //     continue;
            // }else{
            //     set.add(arr[i]);
            //     count++;
            // }
            //or
            set.add(arr[i]);
        }
        // System.out.println(count);
        System.out.println(set.size());
        System.out.println(set); 
    }
}
