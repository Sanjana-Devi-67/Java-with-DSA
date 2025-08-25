import java.util.HashMap;
public class majorityele{
    public static void main(String[] args) {
    int arr[]={1,3,2,5,1,3,1,5,1,1};
    HashMap<Integer,Integer> map=new HashMap<>();  
    for(int i=0;i<arr.length;i++){
        // if(map.containsKey(arr[i])){
        //     map.put(arr[i],map.get(arr[i])+1);
        // }else{
        //     map.put(arr[i],1);
        // }
        //or
        map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
    }
    //set<Integer> keys=map.keySet();
    //or
    for(int key:map.keySet()){//or for(int key:keys)
        if(map.get(key)>arr.length/3){
            System.out.print(key+"");
        }
    }
  }
}
