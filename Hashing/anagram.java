import java.util.HashMap;
public class anagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
      HashMap<Character, Integer> map = new HashMap<>();
      for(int i=0;i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
      }
      for(int j=0;j<t.length();j++){
        if(map.get(t.charAt(j))!=null){//if character is present in map then decrease its count
            if(map.get(t.charAt(j))==1){// if count becomes 1 then remove that char from map
                map.remove(t.charAt(j));
            }else{
                map.put(t.charAt(j),map.get(t.charAt(j))-1);//reduce count by 1
            }
        }else{
            return false;//if an entirely diff char is found in t which is not in s
        }
      }
      return map.isEmpty();
    }   
    public static void main(String[] args) {
        String s="race";
        String t="caret";
        System.out.println(isAnagram(s, t));
    }
}
