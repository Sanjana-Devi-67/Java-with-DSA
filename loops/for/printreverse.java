public class printreverse {
    public static void main(String args[]){
        int n=10899567;
        for(int i=n;i>0;){
            int last=i%10;
            System.out.print(last);
            i=i/10;
        }
        // while(n>0){
        //     int last=n%10;
        //     System.out.print(last);
        //     n=n/10;
        // }
    }
}
