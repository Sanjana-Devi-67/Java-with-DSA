package patterns;
import java.util.*;
public class star {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            //prints one line of stars
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            //after 1 line is printed give next line
            System.out.println();
        }
        System.out.println();
        //inverted star pattern
        int n2=sc.nextInt();
        for(int i=0;i<n2;i++){
            //prints one line of stars
            for(int j=i;j<n2;j++){
                System.out.print("*");
            }
            //after 1 line is printed give next line
            System.out.println();
        }
        //another method for inverted (j=0;j<(n-i+1);j++)
}
}

