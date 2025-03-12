public class optimizedpower {
    public static int optimized(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpow=optimized(x,n/2);
        int halfsq=halfpow*halfpow;
        //n is odd
        if(n%2!=0){
            halfsq=x*halfsq;
        }
        return halfsq;
    }
    public static void main(String args[]){
        int x=2;
        int n=5;
        System.out.println(optimized(x,n));
    }
}
