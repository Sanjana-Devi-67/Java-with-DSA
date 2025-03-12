public class palindrome{
    public static void main(String[] args){
        String str="racecarp";
        boolean flag=true;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                flag=false;
            }
        }
        if(flag==true){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}