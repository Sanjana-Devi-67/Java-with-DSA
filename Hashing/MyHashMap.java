import java.util.*;
public class MyHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        //insert
        map.put("India",100);
        map.put("USA", 200);
        map.put("China", 350);
        map.put("Germany", 80);
        map.put("France", 60);
        //iterate
        Set<String> keys=map.keySet(); 
        System.out.print(keys);
        for(String key:keys){
            System.out.println("Key="+key+",Value="+map.get(key));
        }
        //entrySet
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println("Entries in the map:");
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println(map);
        //get
        int pop=map.get("India");
        System.out.println("Population of India: " + pop);
        //contains
        boolean containsUSA = map.containsKey("USA");
        boolean containsGermany = map.containsKey("Germany");
        System.out.println("Contains USA: " + containsUSA);
        System.out.println("Contains Germany: " + containsGermany);
        //remove
        int val=map.remove("China");
        System.out.println("Removed China with population: " + val);
        System.out.println("After removing China: " + map);
        //size
        System.out.println("Size of map: " + map.size());
        //clear
        map.clear();
        //isEmpty
        System.out.println("Is map empty? " + map.isEmpty());
    }
}