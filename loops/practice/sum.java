import java.util.*;
public class sum {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int oddSum=0;
    int evenSum=0;
    int choice=1;
    while(choice==1){
        System.out.println("Enter number:");
        int n=sc.nextInt();
        if(n%2==0){
            evenSum+=n;
        }
        if(n%2!=0){
            oddSum+=n;
        }
        System.out.println("Do u wnt to enter another number? Type 1 for yes 0 for no");
        choice=sc.nextInt();
    }
    System.out.println("Odd Sum= "+oddSum);
    System.out.println("Even Sum= "+evenSum);
    }
}
