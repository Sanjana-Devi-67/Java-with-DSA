public class fibonacci {
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibnm1=fibo(n-1);
        int fibnm2=fibo(n-2);
        int fibn=fibnm1+fibnm2;
        return fibn;
        // return fibo(n-1)+fibo(n-2);
    }
    public static void main(String args[]){
        int n=20;
        System.out.println(fibo(n));
    }
}
