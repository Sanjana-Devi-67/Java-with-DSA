import java.util.*;
public class binomial{
    public static int factor(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }
    public static int bino(int n,int r){
        int nfact=factor(n);
        int rfact=factor(r);
        int nmr_fact=factor(n-r);
        int binoCoeff=nfact/(rfact*nmr_fact);
        return binoCoeff;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int res=bino(n, r);
        System.out.println("binomial coefficient="+res);
    }
}