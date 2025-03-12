import java.util.Arrays;
public class anagrams {
    public static void main(String[] args) {
        String str1="race";
        String str2="care";
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()==str2.length()){
            char[] str1char=str1.toCharArray();
            char[] str2char=str2.toCharArray();
            Arrays.sort(str1char);
            Arrays.sort(str2char);
            // String s1=new String(str1char);
            // String s2=new String(str2char);
            // boolean res1=s1.equals(s2);
          
            boolean res=Arrays.equals(str1char, str2char);
            if(res){
                System.out.println("valid");
            }else{
                System.out.print("Invalid");
            }
        }
        else{
            System.out.println("Not valid");
        }
    }
}
