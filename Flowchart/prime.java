import java.util.Scanner;
public class prime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int val=2;
        while(val<n){
            if(n%val==0){
                System.out.println(" not prime");
                return;
            }else{
                val=val+1;
            }
        }
        System.out.println("prime");
        sc.close();
        //approach2
        // for(int i=2;i<n;i++){
        //     if(n%i==0){
        //         System.out.println("not prime");
        //         break;
        //     }
        //     else{
        //         System.out.println("prime");
        //         break;
        //     }
        // }
    }
}