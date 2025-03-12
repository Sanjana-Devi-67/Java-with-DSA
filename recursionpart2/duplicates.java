public class duplicates{
    public static void dupli(String str,int idx,StringBuilder newStr,boolean[] map){
        if(idx==str.length()-1){
            System.out.println(newStr);
            return;
        }

        char curr=str.charAt(idx);
        if(map[curr-'a']==true){
            dupli(str, idx+1, newStr, map);//duplicate
        }
        else{
            map[curr-'a']=true;
            dupli(str, idx+1, newStr.append(curr), map);
        }
    }
   public static void main(String[] args) {
    String str="appnnacollege";
    StringBuilder newStr=new StringBuilder("");
    boolean[] map=new boolean[26];
    dupli(str, 0, newStr, map);
  }
}
