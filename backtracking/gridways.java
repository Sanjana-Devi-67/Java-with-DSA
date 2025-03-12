public class gridways {
    public static int findgridways(int i,int j,int n,int m){
        //base case
        //1 condition for last cell 
        if(i==n-1 && j==m-1){
            return 1;
        }else if(i==n || j==n){//2 boundary crossing condition
            return 0;
        }
          int w1=findgridways(i+1, j, n, m);
          int w2=findgridways(i, j+1, n, m);
          return w1+w2;
    }
    public static void main(String[] args) {
        int n=3;
        int m=3;
        System.out.println(findgridways(0,0, n, m));
    }
}
