public class prime {
    public static boolean isPrime(int n){
        //normal approach
        // corner cases
        // if(n==2){
        //     return true;
        // }
        // // boolean isprime=true;
        // for(int i=2;i<=n-1;i++){
        //     if(n%i==0){
        //     //    isprime=false;
        //     //    break;
        //         return false;
        //     }
        // }
        // // return isprime;
        // return true;

      //optimized approach
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
           
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(17));
    }
}
