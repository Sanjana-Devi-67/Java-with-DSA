public class tiling{
    public static int tilingpro(int n){
        if(n==0 || n==1){
            return 1;
        }
        //vertical choice
        int vertical=tilingpro(n-1);
        //horizontal choice
        int horizontal=tilingpro(n-2);
        //total ways
        int totalways=vertical+horizontal;
        return totalways;
    }
    public static void main(String args[]){
          System.out.println(tilingpro(5));
    }
}