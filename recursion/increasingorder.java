public class increasingorder {
    public static void printIncre(int n){
        // if(n==10){
        //     System.out.println(n);
        //     return;
        // }
        // System.out.print(n+" ");
        // printIncre(n+1);
        //or
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printIncre(n-1);
        System.out.print(n+" ");
        
    }
    public static void main(String args[]){
        int n=10;
        printIncre(n);

    }
}
