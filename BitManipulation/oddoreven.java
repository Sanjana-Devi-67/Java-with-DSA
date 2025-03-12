public class oddoreven{
    public static void main(String[] args){
        int n=4;
        int bitmask=1;
        if((n & bitmask)==0){
            //even number
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
}