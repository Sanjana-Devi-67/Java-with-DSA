import java.util.*;
public class factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int factorial=1;
        if(n==0 || n==1){
            System.out.println("Factorial= 1");

        } else{
            for(int i=1;i<=n;i++){
                factorial*=i;
            } 
            System.out.println("Factorial=" + factorial);
        }
        sc.close();
    
    }
}
