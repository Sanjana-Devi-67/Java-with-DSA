public class palindrome {
    public static boolean palid(int n){
        int num=n;
        int res=0;
        while(n>0){
            int digit=n%10;
            res=(res*10)+digit;
            n=n/10;
        }
        if(res==num){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        if(palid(124)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
