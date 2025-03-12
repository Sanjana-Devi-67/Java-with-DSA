// import java.util.*;
public class largest {
    public static void main(String[] args) {
        int[] numbers={8,6,5,4,3,38,4,2,6,};
        int max=numbers[0]; //Integer.MIN_VALUE(- INFINITY)
        int min=Integer.MAX_VALUE;   //+INFINITY
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println("maximum: "+max);
        System.out.println("minimum: "+min);
    }
}
