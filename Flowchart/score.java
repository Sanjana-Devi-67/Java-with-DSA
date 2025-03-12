import java.util.Scanner;
public class score {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int n=sc.nextInt();
    int sum=0;
    int s;
    for(int i=0;i<n;i++){
        System.out.println("Enter score:"+ (i+1));
        s=sc.nextInt();
        sum=sum+s;
    }
    int avg=sum/n;
    System.out.println("Average="+avg);
    sc.close();
}
}