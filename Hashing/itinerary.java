import java.util.*;
public class itinerary {
    public static String getStart(HashMap<String,String> tickets){
        HashMap<String,String> revMap=new HashMap<>();
        for(String key:tickets.keySet()){
            revMap.put(tickets.get(key),key);// reverse mapping
        }
        for(String key:tickets.keySet()){// iterate through original map
            if(!revMap.containsKey(key)){ // if key is not present in revMap, it means it's the starting point
                return key; // starting point
            }
        }
        return null; // if no starting point found
    }
    public static void main(String[] args) {
        HashMap<String,String> tickets=new HashMap<>();
        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");
        String start=getStart(tickets);
        System.out.print(start);
        for(String key:tickets.keySet()){// iterate through the map
            System.out.print("->"+tickets.get(start));// print the destination
            start=tickets.get(start); // update start to next destination
        }
    }
}
