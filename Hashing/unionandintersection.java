import java.util.*;
public class unionandintersection {
    public static void main(String[] args) {
        int[]  arr1={7,3,9};
        int[] arr2={6,3,9,2,9,4};
        HashSet<Integer> set=new HashSet<>();
        //union
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }
        System.out.println("Union is: "+set.size()+" "+set);
        //intersection    
        // ArrayList<Integer> intersection=new ArrayList<>();
        // for(int i=0;i<arr1.length;i++){
        //    for(int j=0;j<arr2.length;j++){
        //     if(arr1[i]==arr2[j]){
        //         if(!intersection.contains(arr1[i]))
        //             intersection.add(arr1[i]);
        //     }
        //   }
        // }
        // System.out.println("Intersection is: "+intersection.size()+" "+intersection);
        //or
        set.clear();
        int count=0;
        ArrayList<Integer> intersection=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                intersection.add(arr2[i]);
                set.remove(arr2[i]);//to avoid duplicates in intersection
            }
        }
        System.out.println("Intersection is: "+count+" "+intersection);

    }
}
