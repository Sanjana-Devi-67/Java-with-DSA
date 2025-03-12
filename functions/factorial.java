import java.util.*;
public class factorial{
    public static int factor(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int fact=factor(n);
          System.out.println("factorial="+fact);
    }
}