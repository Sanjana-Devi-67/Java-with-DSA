import java.util.Scanner;
public class sumofn {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int counter=0;
        while(counter<=n){
            sum += counter;
            counter++;
        }
        System.out.println(sum);
        sc.close();
}
} 
